package com.cocoon.jay.tallybook.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/23 0023.
 */

public class TallyDetailBean extends BaseBean {


    /**
     * t_income : 41.42
     * t_outcome : 212.36
     * daylist : [{"time":"23日-星期一","money":"支出：210.00 收入：0.00","list":[{"id":"80","affect_money":"-69.00","typename":"嗯嗯","img":"/UF/Uploads/Noteimg/listout/shangchengxiaofei@2x.png"},{"id":"78","affect_money":"-6.00","typename":"不不back","img":"/UF/Uploads/Noteimg/listout/canyin@2x.png"},{"id":"76","affect_money":"-3.00","typename":"偿还费用","img":"/UF/Uploads/Noteimg/listout/changhuanfeiyong@2x.png"},{"id":"81","affect_money":"-66.00","typename":"长辈","img":"/UF/Uploads/Noteimg/listout/zhangbei@2x.png"},{"id":"79","affect_money":"-3.00","typename":"餐饮","img":"/UF/Uploads/Noteimg/listout/canyin@2x.png"},{"id":"77","affect_money":"-63.00","typename":"偿还费用","img":"/UF/Uploads/Noteimg/listout/changhuanfeiyong@2x.png"}]},{"time":"20日-星期五","money":"支出：0.00 收入：37.11","list":[{"id":"sys_17701","affect_money":"+0.03","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17699","affect_money":"+0.15","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17683","affect_money":"+0.03","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17681","affect_money":"+0.15","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17660","affect_money":"+0.18","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17662","affect_money":"+0.03","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17479","affect_money":"+0.18","typename":"vip待收利息","img":"/UF/Uploads/Noteimg/listin/lixi@2x.png"},{"id":"sys_17475","affect_money":"+20.40","typename":"投标成功待收利息","img":"/UF/Uploads/Noteimg/listin/lixi@2x.png"},{"id":"sys_17476","affect_money":"+0.90","typename":"vip待收利息","img":"/UF/Uploads/Noteimg/listin/lixi@2x.png"},{"id":"sys_17478","affect_money":"+3.42","typename":"投标成功待收利息","img":"/UF/Uploads/Noteimg/listin/lixi@2x.png"},{"id":"sys_17465","affect_money":"+1.38","typename":"投标成功待收利息","img":"/UF/Uploads/Noteimg/listin/lixi@2x.png"},{"id":"sys_17466","affect_money":"+0.09","typename":"vip待收利息","img":"/UF/Uploads/Noteimg/listin/lixi@2x.png"},{"id":"sys_17462","affect_money":"+9.63","typename":"投标成功待收利息","img":"/UF/Uploads/Noteimg/listin/lixi@2x.png"},{"id":"sys_17463","affect_money":"+0.54","typename":"vip待收利息","img":"/UF/Uploads/Noteimg/listin/lixi@2x.png"}]},{"time":"16日-星期一","money":"支出：0.00 收入：0.60","list":[{"id":"sys_17437","affect_money":"+0.15","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17428","affect_money":"+0.20","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17416","affect_money":"+0.20","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17418","affect_money":"+0.05","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"}]},{"time":"13日-星期五","money":"支出：0.00 收入：0.43","list":[{"id":"sys_17400","affect_money":"+0.18","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17402","affect_money":"+0.05","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"},{"id":"sys_17391","affect_money":"+0.20","typename":"vip额外收益","img":"/UF/Uploads/Noteimg/listin/ewaishouyi@2x.png"}]}]
     */

    private String t_income;
    private String t_outcome;
    private List<DaylistBean> daylist;

    public String getT_income() {
        return t_income;
    }

    public void setT_income(String t_income) {
        this.t_income = t_income;
    }

    public String getT_outcome() {
        return t_outcome;
    }

    public void setT_outcome(String t_outcome) {
        this.t_outcome = t_outcome;
    }

    public List<DaylistBean> getDaylist() {
        return daylist;
    }

    public void setDaylist(List<DaylistBean> daylist) {
        this.daylist = daylist;
    }

    public static class DaylistBean {
        /**
         * time : 23日-星期一
         * money : 支出：210.00 收入：0.00
         * list : [{"id":"80","affect_money":"-69.00","typename":"嗯嗯","img":"/UF/Uploads/Noteimg/listout/shangchengxiaofei@2x.png"},{"id":"78","affect_money":"-6.00","typename":"不不back","img":"/UF/Uploads/Noteimg/listout/canyin@2x.png"},{"id":"76","affect_money":"-3.00","typename":"偿还费用","img":"/UF/Uploads/Noteimg/listout/changhuanfeiyong@2x.png"},{"id":"81","affect_money":"-66.00","typename":"长辈","img":"/UF/Uploads/Noteimg/listout/zhangbei@2x.png"},{"id":"79","affect_money":"-3.00","typename":"餐饮","img":"/UF/Uploads/Noteimg/listout/canyin@2x.png"},{"id":"77","affect_money":"-63.00","typename":"偿还费用","img":"/UF/Uploads/Noteimg/listout/changhuanfeiyong@2x.png"}]
         */

        private String time;
        private String money;
        private List<ListBean> list;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : 80
             * affect_money : -69.00
             * typename : 嗯嗯
             * img : /UF/Uploads/Noteimg/listout/shangchengxiaofei@2x.png
             */

            private String id;
            private String affect_money;
            private String typename;
            private String img;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getAffect_money() {
                return affect_money;
            }

            public void setAffect_money(String affect_money) {
                this.affect_money = affect_money;
            }

            public String getTypename() {
                return typename;
            }

            public void setTypename(String typename) {
                this.typename = typename;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }
    }
}
