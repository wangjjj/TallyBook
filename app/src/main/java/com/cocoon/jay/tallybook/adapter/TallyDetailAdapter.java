package com.cocoon.jay.tallybook.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.cocoon.jay.tallybook.R;
import com.cocoon.jay.tallybook.bean.TallyDetailBean;
import com.cocoon.jay.tallybook.stickyheader.StickyHeaderGridAdapter;
import com.cocoon.jay.tallybook.view.SwipeMenuView;

import java.util.List;

/**
 * 悬浮头部项
 * 可侧滑删除
 */

public class TallyDetailAdapter extends StickyHeaderGridAdapter {

   private Context mContext;

   private String baseUrl = "http://test.huishangsuo.cn";

   private List<TallyDetailBean.DaylistBean> mDatas;

   public void setmDatas(List<TallyDetailBean.DaylistBean> mDatas) {
      this.mDatas = mDatas;
   }

   public TallyDetailAdapter(Context context, List<TallyDetailBean.DaylistBean> datas){
      this.mContext = context;
      this. mDatas = datas;
   }


   @Override
   public int getSectionCount() {
      return mDatas == null ? 0 : mDatas.size();
   }

   @Override
   public int getSectionItemCount(int section) {
      return (mDatas == null || mDatas.get(section).getList() == null) ? 0 : mDatas.get(section).getList().size();
   }

   @Override
   public StickyHeaderGridAdapter.HeaderViewHolder onCreateHeaderViewHolder(ViewGroup parent, int headerType) {
      final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_header, parent, false);
      return new MyHeaderViewHolder(view);
   }

   @Override
   public ItemViewHolder onCreateItemViewHolder(ViewGroup parent, int itemType) {
      final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_item, parent, false);
      return new MyItemViewHolder(view);
   }

   @Override
   public void onBindHeaderViewHolder(HeaderViewHolder viewHolder, int section) {
      final MyHeaderViewHolder holder = (MyHeaderViewHolder)viewHolder;
      holder.header_date.setText(mDatas.get(section).getTime());
      holder.header_money.setText(mDatas.get(section).getMoney());
   }

   @Override
   public void onBindItemViewHolder(ItemViewHolder viewHolder, final int section, final int position) {
      final MyItemViewHolder holder = (MyItemViewHolder)viewHolder;
      final String label = mDatas.get(section).getList().get(position).getTypename();
      holder.item_title.setText(label);
      Glide.with(mContext).load(baseUrl + mDatas.get(section).getList().get(position).getImg()).into( holder.item_img);
      holder.item_money.setText(mDatas.get(section).getList().get(position).getAffect_money());
      if (mDatas.get(section).getList().get(position).getId().startsWith("sys")){
         holder.mSwipeMenuView.setSwipeEnable(false);//sys系统的不做删除
      }else {
         holder.mSwipeMenuView.setSwipeEnable(true);
      }
      holder.item_delete.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            final int section = getAdapterPositionSection(holder.getAdapterPosition());
            final int offset = getItemSectionOffset(section, holder.getAdapterPosition());

            mDatas.get(section).getList().remove(offset);
            notifySectionItemRemoved(section, offset);
            Toast.makeText(holder.item_delete.getContext(), "删除--"+label, Toast.LENGTH_SHORT).show();
         }
      });
      holder.item_layout.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Toast.makeText(holder.item_layout.getContext(), "点击--"+label, Toast.LENGTH_SHORT).show();
         }
      });
   }

   public static class MyHeaderViewHolder extends HeaderViewHolder {
      TextView header_date;
      TextView header_money;

      MyHeaderViewHolder(View itemView) {
         super(itemView);
         header_date = (TextView) itemView.findViewById(R.id.header_date);
         header_money = (TextView) itemView.findViewById(R.id.header_money);
      }
   }

   public static class MyItemViewHolder extends ItemViewHolder {
      TextView item_title;
      TextView item_money;
      Button item_delete;
      ImageView item_img;
      RelativeLayout item_layout;
      SwipeMenuView mSwipeMenuView;

      MyItemViewHolder(View itemView) {
         super(itemView);
         item_title = (TextView) itemView.findViewById(R.id.item_title);
         item_money = (TextView) itemView.findViewById(R.id.item_money);
         item_delete = (Button) itemView.findViewById(R.id.item_delete);
         item_img = (ImageView) itemView.findViewById(R.id.item_img);
         item_layout = (RelativeLayout) itemView.findViewById(R.id.item_layout);
         mSwipeMenuView = (SwipeMenuView) itemView.findViewById(R.id.swipe_menu);
      }
   }
}
