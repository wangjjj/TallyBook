package com.cocoon.jay.tallybook.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cocoon.jay.tallybook.R;

import java.util.List;


public class TallyTypeRankAdapter extends RecyclerView.Adapter<TallyTypeRankAdapter.ViewHolder>{

    private Context mContext;
    private LayoutInflater mInflater;
    private List<String> mDatas;

    public void setmDatas(List<String> mDatas) {
        this.mDatas = mDatas;
    }

    public TallyTypeRankAdapter(Context context, List<String> datas){
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this. mDatas = datas;
    }


    @Override
    public int getItemCount() {
        return (mDatas== null) ? 0 : mDatas.size();
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_tallytype_rank, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.rank.setText(position+1+"");
        holder.title.setText(mDatas.get(position).toString());
        holder.money.setText(String.valueOf(Math.ceil(Math.random() * 100)));

    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView title;
        private TextView money;
        private TextView rank;

        public ViewHolder(View view){
            super(view);

            title = (TextView) view.findViewById(R.id.title);
            money = (TextView) view.findViewById(R.id.money);
            rank = (TextView) view.findViewById(R.id.rank);

        }


        @Override
        public void onClick(View view) {
            switch (view.getId()) {
            }
        }
    }

}
