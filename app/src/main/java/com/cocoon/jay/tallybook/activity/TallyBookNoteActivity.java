package com.cocoon.jay.tallybook.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.pickerview.OptionsPickerView;
import com.bigkoo.pickerview.TimePickerView;
import com.cocoon.jay.tallybook.R;
import com.cocoon.jay.tallybook.adapter.MyPagerAdapter;
import com.cocoon.jay.tallybook.adapter.TallyBookNoteAdapter;
import com.cocoon.jay.tallybook.bean.TallyNoteBean;
import com.cocoon.jay.tallybook.utils.DateUtils;
import com.cocoon.jay.tallybook.utils.TestDataUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 记账本 --- 记一笔
 */
public class TallyBookNoteActivity extends BaseActivity {

    @BindView(R.id.tb_note_income)
    TextView incomeTv;
    @BindView(R.id.tb_note_outcome)
    TextView outcomeTv;
    @BindView(R.id.tb_note_remark)
    ImageView remarkTv;
    @BindView(R.id.tb_note_money)
    TextView moneyTv;
    @BindView(R.id.tb_note_date)
    TextView dateTv;
    @BindView(R.id.tb_note_cash)
    TextView cashTv;
    @BindView(R.id.viewpager_item)
    ViewPager viewpagerItem;
    @BindView(R.id.layout_icon)
    LinearLayout layoutIcon;

    public String type = "1";//1支出2收入
    //计算器
    private boolean isDot;
    private String num = "0";
    private String dotNum = ".00";
    private final int MAX_NUM = 9999999;
    private final int DOT_NUM = 2;
    private int count = 0;
    //选择器
    private OptionsPickerView pvCustomOptions;
    private List<String> cardItem;
    //viewpager数据
    private int page ;
    private boolean isTotalPage;
    private int sortPage = -1;
    private List<TallyNoteBean.SortlistBean> mDatas;
    private List<TallyNoteBean.SortlistBean> tempList;
    //记录上一次点击后的imageview
    public TallyNoteBean.SortlistBean lastBean;
    public ImageView lastImg;



    @Override
    protected int getLayout() {
        return R.layout.activity_tallybook_note;
    }

    @Override
    protected void initEventAndData() {

        dateTv.setText(DateUtils.getCurDateStr("yyyy-MM-dd"));
        setTitleStatus();

    }



    /**
     * 设置状态
     */
    private void setTitleStatus() {

        TallyNoteBean tallyNoteBean = null;
        if (type.equals("1")){
            outcomeTv.setSelected(true);
            incomeTv.setSelected(false);
            tallyNoteBean = TestDataUtil.getTallyNoteBeanOut();
        }
        if (type.equals("2")){
            incomeTv.setSelected(true);
            outcomeTv.setSelected(false);
            tallyNoteBean = TestDataUtil.getTallyNoteBeanIn();
        }

        mDatas = tallyNoteBean.getSortlist();

        lastBean = mDatas.get(0);
        lastImg = new ImageView(this);

        cardItem = new ArrayList<>();
        for (int i = 0; i < tallyNoteBean.getPayinfo().size(); i++) {
            cardItem.add(tallyNoteBean.getPayinfo().get(i).getPay_name());
        }

        initViewPager();
    }




    private void initViewPager() {
        LayoutInflater inflater = this.getLayoutInflater();// 获得一个视图管理器LayoutInflater
        viewList = new ArrayList<>();// 创建一个View的集合对象
        if (mDatas.size() % 10 == 0)
            isTotalPage = true;
        page = (int) Math.ceil(mDatas.size() * 1.0 / 10);
        for (int i = 0; i < page; i++) {
            tempList = new ArrayList<>();
            View view = inflater.inflate(R.layout.pager_item_tb_type, null);
            RecyclerView recycle = (RecyclerView) view.findViewById(R.id.pager_type_recycle);
            if (i != page - 1 || (i == page -1 && isTotalPage)){
                for (int j = 0; j < 10; j++) {
                    if (i != 0 ){
                        tempList.add(mDatas.get(i * 10 + j));
                    }else {
                        tempList.add(mDatas.get(i + j));
                    }
                }
            }else {
                for (int j = 0; j < mDatas.size() % 10; j++) {
                    tempList.add(mDatas.get(i * 10 + j));
                }
            }

            TallyBookNoteAdapter mAdapter = new TallyBookNoteAdapter(this, tempList);
            GridLayoutManager layoutManager = new GridLayoutManager(this, 5);
            recycle.setLayoutManager(layoutManager);
            recycle.setAdapter(mAdapter);
            viewList.add(view);
        }

        viewpagerItem.setAdapter(new MyPagerAdapter(viewList));
        viewpagerItem.setOverScrollMode(View.OVER_SCROLL_NEVER);
        viewpagerItem.setOffscreenPageLimit(1);//预加载数据页
        viewpagerItem.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                try {
                    for (int i = 0; i < viewList.size(); i++) {
                        icons[i].setImageResource(R.drawable.icon_banner_point2);
                    }
                    icons[position].setImageResource(R.drawable.icon_banner_point1);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        initIcon();
    }
    private List<View> viewList;
    private ImageView[] icons;
    private void initIcon() {
        icons = new ImageView[viewList.size()];
        layoutIcon.removeAllViews();
        for (int i = 0; i < icons.length; i++) {
            icons[i] = new ImageView(this);
            icons[i].setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            icons[i].setImageResource(R.drawable.icon_banner_point2);
            if(viewpagerItem.getCurrentItem() == i){
                icons[i].setImageResource(R.drawable.icon_banner_point1);
            }
            icons[i].setPadding(5, 0, 5, 0);
            icons[i].setAdjustViewBounds(true);
            layoutIcon.addView(icons[i]);
        }
        if (sortPage != -1)
            viewpagerItem.setCurrentItem(sortPage);
    }




    @OnClick({R.id.tb_note_income, R.id.tb_note_outcome, R.id.tb_note_cash, R.id.tb_note_date,
            R.id.tb_note_remark, R.id.tb_calc_num_done, R.id.tb_calc_num_del, R.id.tb_calc_num_1,
            R.id.tb_calc_num_2, R.id.tb_calc_num_3, R.id.tb_calc_num_4, R.id.tb_calc_num_5,
            R.id.tb_calc_num_6, R.id.tb_calc_num_7, R.id.tb_calc_num_8, R.id.tb_calc_num_9,
            R.id.tb_calc_num_0, R.id.tb_calc_num_dot, R.id.tb_note_clear, R.id.back_btn})
    protected void onClick(View view){
        switch (view.getId()){
            case R.id.back_btn:
                finish();
                break;
            case R.id.tb_note_income://收入
                type = "2";
                setTitleStatus();
                break;
            case R.id.tb_note_outcome://支出
                type = "1";
                setTitleStatus();
                break;
            case R.id.tb_note_cash://现金
                pvCustomOptions = new OptionsPickerView.Builder(this, new OptionsPickerView.OnOptionsSelectListener() {
                    @Override
                    public void onOptionsSelect(int options1, int option2, int options3, View v) {
                        cashTv.setText(cardItem.get(options1));
                    }
                })
                        .build();
                pvCustomOptions.setPicker(cardItem);
                pvCustomOptions.show();
                break;
            case R.id.tb_note_date://日期
                final TimePickerView startTimePicker = new TimePickerView.Builder(this, new TimePickerView.OnTimeSelectListener() {
                    @Override
                    public void onTimeSelect(Date date, View v) {//选中事件回调
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        dateTv.setText(sdf.format(date));
                    }
                })
                        .setRange(2017,2050)
                        .setType(new boolean[]{true,true,true,false,false,false})
                        .build();
                startTimePicker.show();
                break;
            case R.id.tb_note_remark://备注
                Toast.makeText(mContext, "点击备注", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tb_calc_num_done://确定
                Toast.makeText(mContext, "点击确定", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tb_calc_num_1:
                calcMoney(1);
                break;
            case R.id.tb_calc_num_2:
                calcMoney(2);
                break;
            case R.id.tb_calc_num_3:
                calcMoney(3);
                break;
            case R.id.tb_calc_num_4:
                calcMoney(4);
                break;
            case R.id.tb_calc_num_5:
                calcMoney(5);
                break;
            case R.id.tb_calc_num_6:
                calcMoney(6);
                break;
            case R.id.tb_calc_num_7:
                calcMoney(7);
                break;
            case R.id.tb_calc_num_8:
                calcMoney(8);
                break;
            case R.id.tb_calc_num_9:
                calcMoney(9);
                break;
            case R.id.tb_calc_num_0:
                calcMoney(0);
                break;
            case R.id.tb_calc_num_dot:
                if (dotNum.equals(".00")){
                    isDot = true;
                    dotNum = ".";
                }
                moneyTv.setText(num + dotNum);
                break;
            case R.id.tb_note_clear://清空
                num = "0";
                count = 0;
                dotNum = ".00";
                isDot = false;
                moneyTv.setText("0.00");
                break;
            case R.id.tb_calc_num_del://删除
                if (isDot){
                    if (count > 0){
                        dotNum = dotNum.substring(0, dotNum.length() - 1);
                        count--;
                    }
                    if (count == 0){
                        isDot = false;
                        dotNum = ".00";
                    }
                    moneyTv.setText(num  + dotNum);
                }else {
                    if (num.length() > 0)
                        num = num.substring(0, num.length() - 1);
                    if (num.length() == 0)
                        num = "0";
                    moneyTv.setText(num + dotNum);
                }
                break;
        }
    }





    private void calcMoney(int money) {
        if (num.equals("0") && money == 0)
            return;
        if (isDot) {
            if (count < DOT_NUM) {
                count++;
                dotNum += money;
                moneyTv.setText(num + dotNum);
            }
        }else if (Integer.parseInt(num) < MAX_NUM) {
            if (num.equals("0"))
                num = "";
            num += money;
            moneyTv.setText(num + dotNum);
        }
    }

}
