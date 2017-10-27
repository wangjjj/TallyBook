package com.cocoon.jay.tallybook.fragment;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cocoon.jay.tallybook.R;
import com.cocoon.jay.tallybook.activity.TallyBookNoteActivity;
import com.cocoon.jay.tallybook.adapter.TallyDetailAdapter;
import com.cocoon.jay.tallybook.bean.TallyDetailBean;
import com.cocoon.jay.tallybook.stickyheader.StickyHeaderGridLayoutManager;
import com.cocoon.jay.tallybook.utils.DateUtils;
import com.cocoon.jay.tallybook.utils.TestDataUtil;

import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 记账本--明细
 */
public class MenuFirstFragment extends BaseFragment {


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
    @BindView(R.id.rv_list)
    RecyclerView rvList;
    @BindView(R.id.swipe)
    SwipeRefreshLayout swipe;
    @BindView(R.id.float_btn)
    FloatingActionButton floatBtn;
    Unbinder unbinder;


    private static final int SPAN_SIZE = 1;
    private StickyHeaderGridLayoutManager mLayoutManager;
    private TallyDetailAdapter adapter;
    private List<TallyDetailBean.DaylistBean> list;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_menu_first;
    }


    @Override
    protected void initEventAndData() {

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
                setTestData();//恢复了假数据
            }
        });

        mLayoutManager = new StickyHeaderGridLayoutManager(SPAN_SIZE);
        mLayoutManager.setHeaderBottomOverlapMargin(5);

        // Workaround RecyclerView limitation when playing remove animations. RecyclerView always
        // puts the removed item on the top of other views and it will be drawn above sticky header.
        // The only way to fix this, abandon remove animations :(
        rvList.setItemAnimator(new DefaultItemAnimator() {
            @Override
            public boolean animateRemove(RecyclerView.ViewHolder holder) {
                dispatchRemoveFinished(holder);
                return false;
            }
        });
        rvList.setLayoutManager(mLayoutManager);
        adapter = new TallyDetailAdapter(mContext, list);
        rvList.setAdapter(adapter);
        //test data---------------
        setTestData();
    }


    private void setTestData() {
        TallyDetailBean data = TestDataUtil.getTallyDetailBean();
        list = data.getDaylist();
        adapter.setmDatas(list);
        adapter.notifyAllSectionsDataSetChanged();//需调用此方法刷新
    }


    @OnClick(R.id.float_btn)
    public void onViewClicked() {
        Intent intent = new Intent(getContext(),TallyBookNoteActivity.class);
        startActivity(intent);
    }
}
