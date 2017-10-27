package com.cocoon.jay.tallybook.utils;

import com.cocoon.jay.tallybook.bean.TallyAccountBean;
import com.cocoon.jay.tallybook.bean.TallyDetailBean;
import com.cocoon.jay.tallybook.bean.TallyNoteBean;
import com.cocoon.jay.tallybook.bean.TallyTypeBean;
import com.google.gson.Gson;

/**
 * Created by Administrator on 2017/10/24 0024.
 */

public class TestDataUtil {


    //明细假数据
    public static TallyDetailBean getTallyDetailBean(){
        String str= "{\n" +
                "    \"status\":1,\n" +
                "    \"t_income\":\"88,929.42\",\n" +
                "    \"t_outcome\":\"18,270.36\",\n" +
                "    \"daylist\":[\n" +
                "        {\n" +
                "            \"time\":\"27日-星期五\",\n" +
                "            \"money\":\"支出：18268.00 收入：0.00\",\n" +
                "            \"list\":[\n" +
                "                {\n" +
                "                    \"id\":\"185\",\n" +
                "                    \"affect_money\":\"-25.00\",\n" +
                "                    \"typename\":\"餐饮\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listout/canyin@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"184\",\n" +
                "                    \"affect_money\":\"-3600.00\",\n" +
                "                    \"typename\":\"餐饮\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listout/canyin@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"183\",\n" +
                "                    \"affect_money\":\"-12.00\",\n" +
                "                    \"typename\":\"餐饮\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listout/canyin@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"182\",\n" +
                "                    \"affect_money\":\"-6999.00\",\n" +
                "                    \"typename\":\"餐饮\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listout/canyin@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"171\",\n" +
                "                    \"affect_money\":\"-300.00\",\n" +
                "                    \"typename\":\"发侄子的红包\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listout/tianjiade@2x.png\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"time\":\"24日-星期二\",\n" +
                "            \"money\":\"支出：0.00 收入：88888.00\",\n" +
                "            \"list\":[\n" +
                "                {\n" +
                "                    \"id\":\"89\",\n" +
                "                    \"affect_money\":\"+88888.00\",\n" +
                "                    \"typename\":\"返现\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/fanxian@2x.png\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"time\":\"20日-星期五\",\n" +
                "            \"money\":\"支出：0.00 收入：37.11\",\n" +
                "            \"list\":[\n" +
                "                {\n" +
                "                    \"id\":\"sys_17701\",\n" +
                "                    \"affect_money\":\"+0.03\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17699\",\n" +
                "                    \"affect_money\":\"+0.15\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17683\",\n" +
                "                    \"affect_money\":\"+0.03\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17681\",\n" +
                "                    \"affect_money\":\"+0.15\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17662\",\n" +
                "                    \"affect_money\":\"+0.03\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17660\",\n" +
                "                    \"affect_money\":\"+0.18\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17475\",\n" +
                "                    \"affect_money\":\"+20.40\",\n" +
                "                    \"typename\":\"投标成功待收利息\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/lixi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17476\",\n" +
                "                    \"affect_money\":\"+0.90\",\n" +
                "                    \"typename\":\"vip待收利息\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/lixi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17478\",\n" +
                "                    \"affect_money\":\"+3.42\",\n" +
                "                    \"typename\":\"投标成功待收利息\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/lixi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17479\",\n" +
                "                    \"affect_money\":\"+0.18\",\n" +
                "                    \"typename\":\"vip待收利息\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/lixi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17462\",\n" +
                "                    \"affect_money\":\"+9.63\",\n" +
                "                    \"typename\":\"投标成功待收利息\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/lixi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17463\",\n" +
                "                    \"affect_money\":\"+0.54\",\n" +
                "                    \"typename\":\"vip待收利息\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/lixi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17465\",\n" +
                "                    \"affect_money\":\"+1.38\",\n" +
                "                    \"typename\":\"投标成功待收利息\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/lixi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17466\",\n" +
                "                    \"affect_money\":\"+0.09\",\n" +
                "                    \"typename\":\"vip待收利息\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/lixi@2x.png\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"time\":\"16日-星期一\",\n" +
                "            \"money\":\"支出：0.00 收入：0.60\",\n" +
                "            \"list\":[\n" +
                "                {\n" +
                "                    \"id\":\"sys_17437\",\n" +
                "                    \"affect_money\":\"+0.15\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17428\",\n" +
                "                    \"affect_money\":\"+0.20\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17416\",\n" +
                "                    \"affect_money\":\"+0.20\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\":\"sys_17418\",\n" +
                "                    \"affect_money\":\"+0.05\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"time\":\"13日-星期五\",\n" +
                "            \"money\":\"支出：0.00 收入：0.43\",\n" +
                "            \"list\":[\n" +
                "                {\n" +
                "                    \"id\":\"sys_17400\",\n" +
                "                    \"affect_money\":\"+0.18\",\n" +
                "                    \"typename\":\"vip额外收益\",\n" +
                "                    \"img\":\"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        return new Gson().fromJson(str, TallyDetailBean.class);
    }


    //类别报表支出假数据
    public static TallyTypeBean getTallyTypeBeanOut(){
        String str= "{\n" +
                "    \"status\":1,\n" +
                "    \"total\":9973,\n" +
                "    \"surplus\":\"-1,090.60\",\n" +
                "    \"scale\":\"--\",\n" +
                "    \"t_money\":[\n" +
                "        {\n" +
                "            \"affect_money\":2000,\n" +
                "            \"type\":\"319\",\n" +
                "            \"typename\":\"礼物\",\n" +
                "            \"back_color\":\"#ffb073\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\":520,\n" +
                "            \"type\":\"325\",\n" +
                "            \"typename\":\"交通\",\n" +
                "            \"back_color\":\"#ff7f02\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\":600,\n" +
                "            \"type\":\"305\",\n" +
                "            \"typename\":\"住房\",\n" +
                "            \"back_color\":\"#f8984f\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\":600,\n" +
                "            \"type\":\"315\",\n" +
                "            \"typename\":\"捐赠\",\n" +
                "            \"back_color\":\"#f87953\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\":656,\n" +
                "            \"type\":\"308\",\n" +
                "            \"typename\":\"医疗\",\n" +
                "            \"back_color\":\"#ffb073\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\":800,\n" +
                "            \"type\":\"312\",\n" +
                "            \"typename\":\"居家\",\n" +
                "            \"back_color\":\"#db7b32\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\":1200,\n" +
                "            \"type\":\"303\",\n" +
                "            \"typename\":\"商城消费\",\n" +
                "            \"back_color\":\"#ff7f02\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\":1340,\n" +
                "            \"type\":\"320\",\n" +
                "            \"typename\":\"学习\",\n" +
                "            \"back_color\":\"#f8984f\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\":2000,\n" +
                "            \"type\":\"317\",\n" +
                "            \"typename\":\"孩子\",\n" +
                "            \"back_color\":\"#f87953\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\":257,\n" +
                "            \"type\":\"0\",\n" +
                "            \"typename\":\"杂项\",\n" +
                "            \"back_color\":\"#db7b32\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        return new Gson().fromJson(str, TallyTypeBean.class);
    }




    //类别报表收入假数据
    public static TallyTypeBean getTallyTypeBeanIn(){
        String str= "{\n" +
                "    \"status\": 1,\n" +
                "    \"total\": 8882.4,\n" +
                "    \"surplus\": \"-1,590.60\",\n" +
                "    \"scale\": \"-\",\n" +
                "    \"t_money\": [\n" +
                "        {\n" +
                "            \"affect_money\": 4616.86,\n" +
                "            \"type\": 28,\n" +
                "            \"typename\": \"投标成功待收利息\",\n" +
                "            \"back_color\": \"#6783fd\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\": 1481.89,\n" +
                "            \"type\": \"331\",\n" +
                "            \"typename\": \"额外收益\",\n" +
                "            \"back_color\": \"#8da3fd\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\": 830,\n" +
                "            \"type\": \"335\",\n" +
                "            \"typename\": \"兼职\",\n" +
                "            \"back_color\": \"#6884f9\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\": 800,\n" +
                "            \"type\": \"332\",\n" +
                "            \"typename\": \"资金补偿\",\n" +
                "            \"back_color\": \"#8096f5\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\": 600,\n" +
                "            \"type\": \"328\",\n" +
                "            \"typename\": \"礼金\",\n" +
                "            \"back_color\": \"#6e82db\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"affect_money\": 553.65,\n" +
                "            \"type\": \"0\",\n" +
                "            \"typename\": \"杂项\",\n" +
                "            \"back_color\": \"#6783fd\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        return new Gson().fromJson(str, TallyTypeBean.class);
    }



    //记一笔支出假数据
    public static TallyNoteBean getTallyNoteBeanOut(){
        String str= "{\n" +
                "    \"status\":1,\n" +
                "    \"sortlist\":[\n" +
                "        {\n" +
                "            \"sort_id\":\"301\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"偿还费用\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/changhuanfeiyong@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"302\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"手续费\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/shouxufei@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"303\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"商城消费\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/shangchengxiaofei@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"304\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"违约金\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/weiyuejin@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"305\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"住房\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/zhufang@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"306\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"办公\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/bangong@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"307\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"餐饮\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/canyin@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"308\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"医疗\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/yiliao@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"309\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"通讯\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tongxun@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"310\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"运动\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/yundong@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"311\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"娱乐\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/yule@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"312\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"居家\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/jujia@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"313\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"宠物\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/chongwu@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"314\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"数码\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/shuma@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"315\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"捐赠\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/juanzeng@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"316\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"零食\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/lingshi@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"317\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"孩子\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/haizi@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"318\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"长辈\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/zhangbei@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"319\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"礼物\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/liwu@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"320\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"学习\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/xuexi@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"321\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"水果\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/shuiguo@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"322\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"美容\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/meirong@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"323\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"维修\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/weixiu@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"324\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"旅行\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/lvxing@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"325\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"交通\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/jiaotong@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"326\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"饮料\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/jiushuiyinliao@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"327\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"礼金\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/lijin@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"346\",\n" +
                "            \"uid\":\"262\",\n" +
                "            \"sort_name\":\"吃啊\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"351\",\n" +
                "            \"uid\":\"262\",\n" +
                "            \"sort_name\":\"xxx\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"356\",\n" +
                "            \"uid\":\"262\",\n" +
                "            \"sort_name\":\"爱情\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"357\",\n" +
                "            \"uid\":\"262\",\n" +
                "            \"sort_name\":\"新年快乐\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"359\",\n" +
                "            \"uid\":\"262\",\n" +
                "            \"sort_name\":\"阿卡丽\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"0\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"添加\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjia@2x.png\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"payinfo\":[\n" +
                "        {\n" +
                "            \"pay_type\":\"1\",\n" +
                "            \"pay_name\":\"现金\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_28\",\n" +
                "            \"pay_name\":\"银行卡-尾号8566\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_22\",\n" +
                "            \"pay_name\":\"银行卡-尾号1111\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_10\",\n" +
                "            \"pay_name\":\"银行卡-尾号4565\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        return new Gson().fromJson(str, TallyNoteBean.class);
    }


    //记一笔收入假数据
    public static TallyNoteBean getTallyNoteBeanIn(){
        String str= "{\n" +
                "    \"status\":1,\n" +
                "    \"sortlist\":[\n" +
                "        {\n" +
                "            \"sort_id\":\"328\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"礼金\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/lijin@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"329\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"加息\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/jiaxi@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"330\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"佣金奖励\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/yongjinjiangli@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"331\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"额外收益\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/ewaishouyi@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"332\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"资金补偿\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/zijinbuchang@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"333\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"利息\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/lixi@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"334\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"返现\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/fanxian@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"335\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"兼职\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/jianzhi@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"336\",\n" +
                "            \"uid\":\"262\",\n" +
                "            \"sort_name\":\"其他\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"339\",\n" +
                "            \"uid\":\"262\",\n" +
                "            \"sort_name\":\"添加3\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"348\",\n" +
                "            \"uid\":\"262\",\n" +
                "            \"sort_name\":\"吃饭\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"sort_id\":\"0\",\n" +
                "            \"uid\":\"0\",\n" +
                "            \"sort_name\":\"添加\",\n" +
                "            \"sort_img\":\"/UF/Uploads/Noteimg/blacksort/tianjia@2x.png\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"payinfo\":[\n" +
                "        {\n" +
                "            \"pay_type\":\"1\",\n" +
                "            \"pay_name\":\"现金\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_29\",\n" +
                "            \"pay_name\":\"银行卡-尾号8888\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_28\",\n" +
                "            \"pay_name\":\"银行卡-尾号8566\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_10\",\n" +
                "            \"pay_name\":\"银行卡-尾号4565\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_9\",\n" +
                "            \"pay_name\":\"银行卡-尾号4565\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_8\",\n" +
                "            \"pay_name\":\"银行卡-尾号4565\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_7\",\n" +
                "            \"pay_name\":\"银行卡-尾号4563\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_4\",\n" +
                "            \"pay_name\":\"银行卡-尾号5467\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"3_1\",\n" +
                "            \"pay_name\":\"银行卡-尾号7899\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"pay_type\":\"4\",\n" +
                "            \"pay_name\":\"未分类\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        return new Gson().fromJson(str, TallyNoteBean.class);
    }



    //我的账户假数据
    public static TallyAccountBean getTallyAccountBean(){
        String str= "{\n" +
                "    \"status\":1,\n" +
                "    \"total_in\":\"88,929.06\",\n" +
                "    \"total_out\":\"130,848.00\",\n" +
                "    \"list\":[\n" +
                "        {\n" +
                "            \"type\":\"1\",\n" +
                "            \"img\":\"/UF/Uploads/Noteimg/cash@2x.png\",\n" +
                "            \"name\":\"现金\",\n" +
                "            \"num\":\"\",\n" +
                "            \"income\":\"+88888.00\",\n" +
                "            \"outcome\":\"-130846.00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\":\"2\",\n" +
                "            \"img\":\"/UF/Uploads/Noteimg/account@2x.png\",\n" +
                "            \"name\":\"账户余额\",\n" +
                "            \"num\":\"\",\n" +
                "            \"income\":\"+41.06\",\n" +
                "            \"outcome\":\"-2.00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\":\"3_1\",\n" +
                "            \"img\":\"/UF/Uploads/Noteimg/bank@2x.png\",\n" +
                "            \"name\":\"银行卡\",\n" +
                "            \"num\":\"尾号7899\",\n" +
                "            \"income\":\"+0.00\",\n" +
                "            \"outcome\":\"-0.00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\":\"3_4\",\n" +
                "            \"img\":\"/UF/Uploads/Noteimg/bank@2x.png\",\n" +
                "            \"name\":\"银行卡\",\n" +
                "            \"num\":\"尾号5467\",\n" +
                "            \"income\":\"+0.00\",\n" +
                "            \"outcome\":\"-0.00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\":\"3_7\",\n" +
                "            \"img\":\"/UF/Uploads/Noteimg/bank@2x.png\",\n" +
                "            \"name\":\"银行卡\",\n" +
                "            \"num\":\"尾号4563\",\n" +
                "            \"income\":\"+0.00\",\n" +
                "            \"outcome\":\"-0.00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\":\"3_8\",\n" +
                "            \"img\":\"/UF/Uploads/Noteimg/bank@2x.png\",\n" +
                "            \"name\":\"银行卡\",\n" +
                "            \"num\":\"尾号4565\",\n" +
                "            \"income\":\"+0.00\",\n" +
                "            \"outcome\":\"-0.00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\":\"3_9\",\n" +
                "            \"img\":\"/UF/Uploads/Noteimg/bank@2x.png\",\n" +
                "            \"name\":\"银行卡\",\n" +
                "            \"num\":\"尾号4565\",\n" +
                "            \"income\":\"+0.00\",\n" +
                "            \"outcome\":\"-0.00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"type\":\"4\",\n" +
                "            \"img\":\"/UF/Uploads/Noteimg/other@2x.png\",\n" +
                "            \"name\":\"未分类\",\n" +
                "            \"num\":\"\",\n" +
                "            \"income\":\"+0.00\",\n" +
                "            \"outcome\":\"-0.00\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        return new Gson().fromJson(str, TallyAccountBean.class);
    }





}
