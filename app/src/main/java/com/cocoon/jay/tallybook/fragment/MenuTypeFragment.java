package com.cocoon.jay.tallybook.fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bigkoo.pickerview.TimePickerView;
import com.cocoon.jay.tallybook.R;
import com.cocoon.jay.tallybook.adapter.TallyTypeRankAdapter;
import com.cocoon.jay.tallybook.bean.TallyTypeBean;
import com.cocoon.jay.tallybook.utils.DateUtils;
import com.cocoon.jay.tallybook.utils.FormatUtils;
import com.cocoon.jay.tallybook.utils.PieChartUtil;
import com.cocoon.jay.tallybook.utils.TestDataUtil;
import com.cocoon.jay.tallybook.view.CircleImageView;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 记账本--类别报表
 */
public class MenuTypeFragment extends BaseFragment
        implements OnChartValueSelectedListener {


    @BindView(R.id.chart)
    PieChart mChart;
    @BindView(R.id.center_title)
    TextView centerTitle;
    @BindView(R.id.center_money)
    TextView centerMoney;
    @BindView(R.id.layout_center)
    LinearLayout layoutCenter;
    @BindView(R.id.center_img)
    ImageView centerImg;
    @BindView(R.id.data_year)
    TextView dataYear;
    @BindView(R.id.data_month)
    TextView dataMonth;
    @BindView(R.id.layout_data)
    LinearLayout layoutData;
    @BindView(R.id.cash_surplus)
    TextView cashSurplus;
    @BindView(R.id.cash_compared)
    TextView cashCompared;
    @BindView(R.id.circle_bg)
    CircleImageView circleBg;
    @BindView(R.id.circle_img)
    ImageView circleImg;
    @BindView(R.id.layout_circle)
    RelativeLayout layoutCircle;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.money)
    TextView money;
    @BindView(R.id.rank_title)
    TextView rankTitle;
    @BindView(R.id.layout_other)
    RelativeLayout layoutOther;
    @BindView(R.id.other_money)
    TextView otherMoney;
    @BindView(R.id.swipe)
    SwipeRefreshLayout swipe;
    @BindView(R.id.item_type)
    RelativeLayout itemType;
    @BindView(R.id.item_other)
    RelativeLayout itemOther;
    @BindView(R.id.rv_list)
    RecyclerView rvList;
    @BindView(R.id.layout_typedata)
    LinearLayout layoutTypedata;

    private boolean TYPE = true;//默认总收入true
    private List<TallyTypeBean.TMoneyBean> tMoneyBeanList;
    private int report_type = 0;//饼状图与之相对应的类型
    private String type_name;
    private String back_color;

    private TallyTypeRankAdapter adapter;
    private List<String> list;



    @Override
    protected int getLayoutId() {
        return R.layout.fragment_menu_type;
    }


    @Override
    protected void initEventAndData() {

        PieChartUtil.initPieChart(mChart);
        mChart.setOnChartValueSelectedListener(this);

        dataYear.setText(DateUtils.getCurYear("yyyy 年"));
        dataMonth.setText(DateUtils.date2Str(new Date(), "MM"));
        //改变加载显示的颜色
        swipe.setColorSchemeColors(getResources().getColor(R.color.text_red), getResources().getColor(R.color.text_red));
        //设置向下拉多少出现刷新
        swipe.setDistanceToTriggerSync(200);
        //设置刷新出现的位置
        swipe.setProgressViewEndTarget(false, 200);
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipe.setRefreshing(false);
                PieChartUtil.setAnimate(mChart);
            }
        });


        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        list = new ArrayList<>();
        adapter = new TallyTypeRankAdapter(getActivity(), list);
        rvList.setAdapter(adapter);

        setReportData();
    }




    private void setReportData() {
        TallyTypeBean typeModel = null;
        if (TYPE) {
            centerTitle.setText("总支出");
            centerImg.setImageResource(R.mipmap.tallybook_output);
            typeModel = TestDataUtil.getTallyTypeBeanOut();
        } else {
            centerTitle.setText("总收入");
            centerImg.setImageResource(R.mipmap.tallybook_input);
            typeModel = TestDataUtil.getTallyTypeBeanIn();
        }
        if (typeModel == null) {
            return;
        }

        cashSurplus.setText(typeModel.getSurplus());
        cashCompared.setText(typeModel.getScale());
        centerMoney.setText(getMoneyStr(typeModel.getTotal()));
        tMoneyBeanList = typeModel.getT_money();

        ArrayList<PieEntry> entries = new ArrayList<PieEntry>();
        ArrayList<Integer> colors = new ArrayList<Integer>();

        if (tMoneyBeanList != null && tMoneyBeanList.size() > 0) {
            layoutTypedata.setVisibility(View.VISIBLE);
            for (int i = 0; i < tMoneyBeanList.size(); i++) {
                float scale = tMoneyBeanList.get(i).getAffect_money() / typeModel.getTotal();
                float value = (scale < 0.06f) ? 0.06f : scale;
                entries.add(new PieEntry(value, PieChartUtil.getTypeDrawable(tMoneyBeanList.get(i).getType())));
                colors.add(Color.parseColor(tMoneyBeanList.get(i).getBack_color()));
            }
            setNoteData(0);
        } else {//无数据时的显示
            layoutTypedata.setVisibility(View.GONE);
            entries.add(new PieEntry(1f));
            colors.add(0xffAAAAAA);
        }

        PieChartUtil.setPieChartData(mChart, entries, colors);
    }

    /**
     * 点击饼状图上区域后相应的数据设置
     * @param index
     */
    private void setNoteData(int index){
        report_type = tMoneyBeanList.get(index).getType();
        type_name = tMoneyBeanList.get(index).getTypename();
        back_color = tMoneyBeanList.get(index).getBack_color();
        if (TYPE) {
            money.setText("-"+ getMoneyStr(tMoneyBeanList.get(index).getAffect_money()));
        }else {
            money.setText("+"+ getMoneyStr(tMoneyBeanList.get(index).getAffect_money()));
        }
        title.setText(type_name);
        rankTitle.setText(type_name + "排行榜");
        circleBg.setImageDrawable(new ColorDrawable(Color.parseColor(back_color)));
        circleImg.setImageDrawable(PieChartUtil.getTypeDrawable(report_type));

        list.clear();
        for(int i = 0; i < 3; i++){
            list.add(type_name + i);
        }
        adapter.setmDatas(list);
        adapter.notifyDataSetChanged();
    }



    @Override
    public void onValueSelected(Entry e, Highlight h) {
        if (e == null)
            return;
        int entryIndex = (int) h.getX();
        PieChartUtil.setRotationAngle(mChart, entryIndex);
        setNoteData(entryIndex);
    }


    @Override
    public void onNothingSelected() {
        Log.i("PieChart", "nothing selected");
    }


    @OnClick({R.id.layout_center, R.id.layout_data, R.id.item_type, R.id.item_other})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layout_center:

                if(TYPE){
                    TYPE = false;
                }else{
                    TYPE = true;
                }
                setReportData();

                break;
            case R.id.layout_data:
                //时间选择器
                new TimePickerView.Builder(getActivity(), new TimePickerView.OnTimeSelectListener() {
                    @Override
                    public void onTimeSelect(Date date, View v) {//选中事件回调
                        dataYear.setText(DateUtils.date2Str(date, "yyyy 年"));
                        dataMonth.setText(DateUtils.date2Str(date, "MM"));

                        PieChartUtil.setAnimate(mChart);
                    }
                })
                        .setRangDate(null, Calendar.getInstance())
                        .setType(new boolean[]{true, true, false, false, false, false})
                        .build()
                        .show();
                break;
            case R.id.item_type:
                break;
            case R.id.item_other:
                break;
        }
    }


    private String getMoneyStr(double money) {
        return FormatUtils.MyDecimalFormat("##,###,###.##", money);
    }

}
