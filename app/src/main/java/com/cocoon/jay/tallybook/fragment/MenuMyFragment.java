package com.cocoon.jay.tallybook.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cocoon.jay.tallybook.R;
import com.cocoon.jay.tallybook.adapter.TallyAccountAdapter;
import com.cocoon.jay.tallybook.bean.TallyAccountBean;
import com.cocoon.jay.tallybook.utils.DateUtils;
import com.cocoon.jay.tallybook.utils.TestDataUtil;

import java.util.Date;
import java.util.List;

import butterknife.BindView;

/**
 * 记账本--我的账户
 */
public class MenuMyFragment extends BaseFragment {


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


    private TallyAccountAdapter adapter;
    private List<TallyAccountBean.ListBean> list;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_menu_my;
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
            }
        });

        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new TallyAccountAdapter(getActivity(), list);
        adapter.setmListener(new TallyAccountAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
            }
        });
        rvList.setAdapter(adapter);
        //test data---------------
        setTestData();
    }


    private void setTestData() {
        TallyAccountBean data = TestDataUtil.getTallyAccountBean();
        list = data.getList();
        adapter.setmDatas(list);
        adapter.notifyDataSetChanged();
    }


}
