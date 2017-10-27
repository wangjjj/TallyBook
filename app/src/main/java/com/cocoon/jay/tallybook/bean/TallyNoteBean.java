package com.cocoon.jay.tallybook.bean;

import java.util.List;

/**
 *  记一笔 --- 多个小类别的model
 */

public class TallyNoteBean extends BaseBean{

    /**
     * sortlist : [{"sort_id":"301","uid":"0","sort_name":"偿还费用","sort_img":"/UF/Uploads/Noteimg/blacksort/changhuanfeiyong@2x.png"},{"sort_id":"302","uid":"0","sort_name":"手续费","sort_img":"/UF/Uploads/Noteimg/blacksort/shouxufei@2x.png"},{"sort_id":"303","uid":"0","sort_name":"商城消费","sort_img":"/UF/Uploads/Noteimg/blacksort/shangchengxiaofei@2x.png"},{"sort_id":"304","uid":"0","sort_name":"违约金","sort_img":"/UF/Uploads/Noteimg/blacksort/weiyuejin@2x.png"},{"sort_id":"305","uid":"0","sort_name":"住房","sort_img":"/UF/Uploads/Noteimg/blacksort/zhufang@2x.png"},{"sort_id":"306","uid":"0","sort_name":"办公","sort_img":"/UF/Uploads/Noteimg/blacksort/bangong@2x.png"},{"sort_id":"307","uid":"0","sort_name":"餐饮","sort_img":"/UF/Uploads/Noteimg/blacksort/canyin@2x.png"},{"sort_id":"308","uid":"0","sort_name":"医疗","sort_img":"/UF/Uploads/Noteimg/blacksort/yiliao@2x.png"},{"sort_id":"309","uid":"0","sort_name":"通讯","sort_img":"/UF/Uploads/Noteimg/blacksort/tongxun@2x.png"},{"sort_id":"310","uid":"0","sort_name":"运动","sort_img":"/UF/Uploads/Noteimg/blacksort/yundong@2x.png"},{"sort_id":"311","uid":"0","sort_name":"娱乐","sort_img":"/UF/Uploads/Noteimg/blacksort/yule@2x.png"},{"sort_id":"312","uid":"0","sort_name":"居家","sort_img":"/UF/Uploads/Noteimg/blacksort/jujia@2x.png"},{"sort_id":"313","uid":"0","sort_name":"宠物","sort_img":"/UF/Uploads/Noteimg/blacksort/chongwu@2x.png"},{"sort_id":"314","uid":"0","sort_name":"数码","sort_img":"/UF/Uploads/Noteimg/blacksort/shuma@2x.png"},{"sort_id":"315","uid":"0","sort_name":"捐赠","sort_img":"/UF/Uploads/Noteimg/blacksort/juanzeng@2x.png"},{"sort_id":"316","uid":"0","sort_name":"零食","sort_img":"/UF/Uploads/Noteimg/blacksort/lingshi@2x.png"},{"sort_id":"317","uid":"0","sort_name":"孩子","sort_img":"/UF/Uploads/Noteimg/blacksort/haizi@2x.png"},{"sort_id":"318","uid":"0","sort_name":"长辈","sort_img":"/UF/Uploads/Noteimg/blacksort/zhangbei@2x.png"},{"sort_id":"319","uid":"0","sort_name":"礼物","sort_img":"/UF/Uploads/Noteimg/blacksort/liwu@2x.png"},{"sort_id":"320","uid":"0","sort_name":"学习","sort_img":"/UF/Uploads/Noteimg/blacksort/xuexi@2x.png"},{"sort_id":"321","uid":"0","sort_name":"水果","sort_img":"/UF/Uploads/Noteimg/blacksort/shuiguo@2x.png"},{"sort_id":"322","uid":"0","sort_name":"美容","sort_img":"/UF/Uploads/Noteimg/blacksort/meirong@2x.png"},{"sort_id":"323","uid":"0","sort_name":"维修","sort_img":"/UF/Uploads/Noteimg/blacksort/weixiu@2x.png"},{"sort_id":"324","uid":"0","sort_name":"旅行","sort_img":"/UF/Uploads/Noteimg/blacksort/lvxing@2x.png"},{"sort_id":"325","uid":"0","sort_name":"交通","sort_img":"/UF/Uploads/Noteimg/blacksort/jiaotong@2x.png"},{"sort_id":"326","uid":"0","sort_name":"饮料","sort_img":"/UF/Uploads/Noteimg/blacksort/jiushuiyinliao@2x.png"},{"sort_id":"327","uid":"0","sort_name":"礼金","sort_img":"/UF/Uploads/Noteimg/blacksort/lijin@2x.png"},{"sort_id":"340","uid":"262","sort_name":"添加4","sort_img":"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png"},{"sort_id":"341","uid":"262","sort_name":"添加5","sort_img":"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png"},{"sort_id":"342","uid":"262","sort_name":"添加6","sort_img":"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png"},{"sort_id":"343","uid":"262","sort_name":"卖大米","sort_img":"/UF/Uploads/Noteimg/blacksort/tianjiade@2x.png"}]
     * payinfo : [{"pay_type":"1","pay_name":"现金"},{"pay_type":"3_10","pay_name":"银行卡-尾号4565"},{"pay_type":"3_9","pay_name":"银行卡-尾号4565"},{"pay_type":"3_8","pay_name":"银行卡-尾号4565"},{"pay_type":"3_7","pay_name":"银行卡-尾号4565"},{"pay_type":"3_4","pay_name":"银行卡-尾号5467"},{"pay_type":"3_1","pay_name":"银行卡-尾号7899"},{"pay_type":"4","pay_name":"未分类"}]
     */

    private List<SortlistBean> sortlist;
    private List<PayinfoBean> payinfo;


    public List<SortlistBean> getSortlist() {
        return sortlist;
    }

    public void setSortlist(List<SortlistBean> sortlist) {
        this.sortlist = sortlist;
    }

    public List<PayinfoBean> getPayinfo() {
        return payinfo;
    }

    public void setPayinfo(List<PayinfoBean> payinfo) {
        this.payinfo = payinfo;
    }


    public static class SortlistBean {
        /**
         * sort_id : 301
         * uid : 0
         * sort_name : 偿还费用
         * sort_img : /UF/Uploads/Noteimg/blacksort/changhuanfeiyong@2x.png
         */

        private String sort_id;
        private String uid;
        private String sort_name;
        private String sort_img;
        private boolean selected;

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean select) {
            this.selected = select;
        }

        public String getSort_id() {
            return sort_id;
        }

        public void setSort_id(String sort_id) {
            this.sort_id = sort_id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getSort_name() {
            return sort_name;
        }

        public void setSort_name(String sort_name) {
            this.sort_name = sort_name;
        }

        public String getSort_img() {
            return sort_img;
        }

        public void setSort_img(String sort_img) {
            this.sort_img = sort_img;
        }
    }

    public static class PayinfoBean {
        /**
         * pay_type : 1
         * pay_name : 现金
         */

        private String pay_type;
        private String pay_name;

        public String getPay_type() {
            return pay_type;
        }

        public void setPay_type(String pay_type) {
            this.pay_type = pay_type;
        }

        public String getPay_name() {
            return pay_name;
        }

        public void setPay_name(String pay_name) {
            this.pay_name = pay_name;
        }
    }

}
