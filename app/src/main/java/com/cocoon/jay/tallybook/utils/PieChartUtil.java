package com.cocoon.jay.tallybook.utils;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.cocoon.jay.tallybook.MyApplication;
import com.cocoon.jay.tallybook.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.MPPointF;

import java.util.ArrayList;

/**
 * 记账本饼状图
 */

public class PieChartUtil {

    /**
     * 初始化饼状图
     * @param mChart
     */
    public static void initPieChart(PieChart mChart){
        mChart.setUsePercentValues(true);
        mChart.getDescription().setEnabled(false);
        mChart.setExtraOffsets(5, 10, 5, 5);
        mChart.setDragDecelerationFrictionCoef(0.95f);
        mChart.setDrawHoleEnabled(true);
        mChart.setHoleColor(Color.WHITE);
        mChart.setTransparentCircleColor(Color.WHITE);
        mChart.setTransparentCircleAlpha(110);
        mChart.setHoleRadius(58f);
        mChart.setTransparentCircleRadius(61f);
        mChart.setDrawCenterText(true);
//        mChart.setRotationAngle(0);
        // enable rotation of the chart by touch
        mChart.setRotationEnabled(false);
        mChart.setHighlightPerTapEnabled(true);
        // add a selection listener
        // mChart.spin(2000, 0, 360);
        Legend l = mChart.getLegend();
        l.setEnabled(false);
    }





    /**
     * 设置饼状图数据
     * @param mChart
     * @param entries
     * @param colors
     */
    public static void setPieChartData(PieChart mChart, ArrayList<PieEntry> entries, ArrayList<Integer> colors){

        PieDataSet dataSet = new PieDataSet(entries, "Election Results");

        dataSet.setDrawIcons(true);
        dataSet.setSliceSpace(3f);
        dataSet.setIconsOffset(new MPPointF(0, 1));
        dataSet.setSelectionShift(5f);

        dataSet.setColors(colors);
        //dataSet.setSelectionShift(0f);
        PieData data = new PieData(dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11f);
        data.setValueTextColor(Color.TRANSPARENT);
//        data.setValueTypeface(mTfLight);
        mChart.setData(data);
        // undo all highlights
        mChart.highlightValues(null);


        setStartAngle(mChart);
        setAnimate(mChart);
    }



    /**
     * 设置初始角度
     * @param mChart
     */
    public static void setStartAngle(PieChart mChart){
        //--------------设置初始角度----------------------
        float[] mDrawAngles = mChart.getDrawAngles();
        float offset = mDrawAngles[0] / 2;
        mChart.setRotationAngle(90 - offset);
    }



    /**
     * 设置初始旋转动画
     * @param mChart
     */
    public static void setAnimate(PieChart mChart){
        //--------------设置动画----------------------
        mChart.animateY(1000, Easing.EasingOption.EaseInOutQuad);
        mChart.invalidate();
    }




    /**
     * 设置点击相应区域旋转角度
     * @param mChart
     * @param entryIndex
     */
    public static void setRotationAngle(PieChart mChart, int entryIndex){

        float[] mDrawAngles = mChart.getDrawAngles();

//        float offset = mDrawAngles[entryIndex] / 2;
//        Log.e("TAG",
//                "offset=============" + offset);
        Log.e("TAG",
                "rotationAngle==========" + mChart.getRotationAngle());

//--------------初始角度----------------------
        float inAngle = 90 - mDrawAngles[0] / 2;

        switch (entryIndex){
            case 0:
                mChart.setRotationAngle(inAngle);
                break;
            case 1:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] / 2));
                break;
            case 2:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] / 2));
                break;
            case 3:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] / 2));
                break;
            case 4:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] / 2));
                break;
            case 5:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] / 2));
                break;
            case 6:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] / 2));
                break;
            case 7:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] + mDrawAngles[7] / 2));
                break;
            case 8:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] + mDrawAngles[7] + mDrawAngles[8] / 2));
                break;
            case 9:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] + mDrawAngles[7] + mDrawAngles[8] + mDrawAngles[9] / 2));
                break;
            case 10:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] + mDrawAngles[7] + mDrawAngles[8] + mDrawAngles[9] + mDrawAngles[10] / 2));
                break;
            case 11:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] + mDrawAngles[7] + mDrawAngles[8] + mDrawAngles[9] + mDrawAngles[10] + mDrawAngles[11] / 2));
                break;
            case 12:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] + mDrawAngles[7] + mDrawAngles[8] + mDrawAngles[9] + mDrawAngles[10] + mDrawAngles[11] + mDrawAngles[12] / 2));
                break;
            case 13:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] + mDrawAngles[7] + mDrawAngles[8] + mDrawAngles[9] + mDrawAngles[10] + mDrawAngles[11] + mDrawAngles[12] + mDrawAngles[13] / 2));
                break;
            case 14:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] + mDrawAngles[7] + mDrawAngles[8] + mDrawAngles[9] + mDrawAngles[10] + mDrawAngles[11] + mDrawAngles[12] + mDrawAngles[13] + mDrawAngles[14] / 2));
                break;
            case 15:
                mChart.setRotationAngle(inAngle - (mDrawAngles[0] / 2 + mDrawAngles[1] + mDrawAngles[2] + mDrawAngles[3] + mDrawAngles[4] + mDrawAngles[5] + mDrawAngles[6] + mDrawAngles[7] + mDrawAngles[8] + mDrawAngles[9] + mDrawAngles[10] + mDrawAngles[11] + mDrawAngles[12] + mDrawAngles[13] + mDrawAngles[14] + mDrawAngles[15] / 2));
                break;
            default:
                break;
        }

        mChart.invalidate();
}


    /**
     * 根据服务器返回的type设置与之相对应的本地图片
     * @param type
     * @return
     */
    public static Drawable getTypeDrawable(int type){
        Drawable drawable = null;
        switch (type){
            case 18: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_shouxufei);break;
            case 30: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_changhuanfeiyong);break;
            case 241: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_shangchengxiaofei);break;
            case 235: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_weiyuejin);break;
            //收入
            case 94: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_fanxian);break;
            case 95: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_fanxian);break;
            case 246:drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_yongjinjiangli);break;
            case 78: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_ewaishouyi);break;
            case 98: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_zijinbuchang);break;
            case 28: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_lixi);break;
            //支出：301偿还费用 302手续费 303商城消费 304违约金 305住房 306办公 307餐饮 308医疗 309通讯 310运动
            //311娱乐 312居家 313宠物 314数码 315捐赠 316零食   317孩子  318长辈  319 礼物
            //320学习 321水果 322美容 323维修  324旅行  325交通 326饮料 327礼金
            case 301: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_changhuanfeiyong);break;
            case 302: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_shouxufei);break;
            case 303: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_shangchengxiaofei);break;
            case 304: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_weiyuejin);break;
            case 305: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_zhufang);break;
            case 306: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_bangong);break;
            case 307: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_canyin);break;
            case 308: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_yiliao);break;
            case 309: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_tongxun);break;
            case 310: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_yundong);break;
            case 311: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_yule);break;
            case 312: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_jujia);break;
            case 313: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_chongwu);break;
            case 314: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_shuma);break;
            case 315: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_juanzeng);break;
            case 316: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_lingshi);break;
            case 317: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_haizi);break;
            case 318: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_zhangbei);break;
            case 319: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_liwu);break;
            case 320: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_xuexi);break;
            case 321: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_shuiguo);break;
            case 322: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_meirong);break;
            case 323: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_weixiu);break;
            case 324: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_lvxing);break;
            case 325: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_jiaotong);break;
            case 326: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_jiushuiyinliao);break;
            case 327: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_lijin);break;
            // 收入 328礼金 329加息  330佣金奖励 331额外收益 332资金补偿 333利息 334返现 335兼职 336其他
            case 328: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_lijin);break;
            case 329: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_jiaxi);break;
            case 330: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_yongjinjiangli);break;
            case 331: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_ewaishouyi);break;
            case 332: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_zijinbuchang);break;
            case 333: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_lixi);break;
            case 334: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_fanxian);break;
            case 335: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_jianzhi);break;
            case 336: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_qita);break;
            default: drawable = MyApplication.application.getResources().getDrawable(R.mipmap.type_qita);break;
        }
        return drawable;
    }


}
