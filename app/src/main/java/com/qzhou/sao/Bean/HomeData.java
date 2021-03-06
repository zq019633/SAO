package com.qzhou.sao.Bean;

import java.util.List;

public class HomeData {


    /**
     * code : 200
     * message : 请求成功
     * banner : [{"id":"1","type":"0","picurl":"http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg","pictext":"好好学习","piccontent":null},{"id":"2","type":"0","picurl":"http://ww4.sinaimg.cn/large/006uZZy8jw1faic259ohaj30ci08c74r.jpg","pictext":"天天向上","piccontent":null},{"id":"3","type":"0","picurl":"http://ww4.sinaimg.cn/large/006uZZy8jw1faic2b16zuj30ci08cwf4.jpg","pictext":"热爱劳动","piccontent":null},{"id":"4","type":"0","picurl":"http://ww4.sinaimg.cn/large/006uZZy8jw1faic2e7vsaj30ci08cglz.jpg","pictext":"不搞对象","piccontent":null}]
     * goods : [{"id":"1","type":"2","picurl":"https://gd4.alicdn.com/imgextra/i4/380101244/TB2qUNua4mI.eBjy0FlXXbgkVXa_!!380101244.jpg","title":"男版羽绒服","date":"今天天气好晴朗","istop":"1","content":"今天天气好晴朗","author":"周强","price":"788"},{"id":"2","type":"2","picurl":"https://gd2.alicdn.com/imgextra/i2/380101244/TB2HHzZdNmJ.eBjy0FhXXbBdFXa_!!380101244.jpg","title":"女版羽绒服","date":"大小适中","istop":"1","content":"绝对好评","author":"张三","price":"888"},{"id":"3","type":"2","picurl":"https://gd1.alicdn.com/imgextra/i1/380101244/TB2REFwa9qJ.eBjy1zbXXbx8FXa_!!380101244.jpg","title":"手机","date":null,"istop":null,"content":null,"author":"里斯","price":"799"},{"id":"4","type":"2","picurl":"https://gd4.alicdn.com/imgextra/i4/380101244/TB2Ye4taZeK.eBjSszgXXczFpXa_!!380101244.jpg","title":"电脑","date":null,"istop":null,"content":null,"author":"王五","price":"888"},{"id":"5","type":"2","picurl":"https://gd4.alicdn.com/imgextra/i4/380101244/TB2qUNua4mI.eBjy0FlXXbgkVXa_!!380101244.jpg","title":"房产","date":null,"istop":null,"content":null,"author":"周强","price":"541"},{"id":"6","type":"2","picurl":"https://gd4.alicdn.com/imgextra/i4/380101244/TB2qUNua4mI.eBjy0FlXXbgkVXa_!!380101244.jpg","title":"冰箱","date":null,"istop":null,"content":null,"author":"赵六","price":"352"},{"id":"7","type":"2","picurl":"https://gd2.alicdn.com/imgextra/i2/380101244/TB2HHzZdNmJ.eBjy0FhXXbBdFXa_!!380101244.jpg","title":"彩电","date":null,"istop":null,"content":null,"author":"赵四","price":"40"},{"id":"8","type":"2","picurl":"https://gd4.alicdn.com/imgextra/i4/380101244/TB2Ye4taZeK.eBjSszgXXczFpXa_!!380101244.jpg","title":"洗衣机","date":null,"istop":null,"content":null,"author":"王三","price":"30"},{"id":"9","type":"2","picurl":"https://gd4.alicdn.com/imgextra/i4/380101244/TB2qUNua4mI.eBjy0FlXXbgkVXa_!!380101244.jpg","title":"世界杯","date":null,"istop":null,"content":null,"author":"王晓明","price":"19"}]
     * homeData : [{"id":"1","name":null,"picurl":"https://img.alicdn.com/i3/1865005016582328322/TB2JOZGgUhnpuFjSZFEXXX0PFXa_!!0-juitemmedia.jpg_200x200.jpg","price":null,"catatory":null,"title":"非常大牌"},{"id":"2","name":null,"picurl":"https://img.alicdn.com/i2/1789605013657704257/TB1j9S1PFXXXXbWaXXXXXXXXXXX_!!0-tejia.jpg_200x200.jpg","price":null,"catatory":null,"title":"全球精选"},{"id":"3","name":null,"picurl":"https://img.alicdn.com/tps/TB1qA5nPFXXXXXjXpXXXXXXXXXX-320-320.jpg_200x200.jpg","price":null,"catatory":null,"title":"量贩优选"},{"id":"4","name":null,"picurl":"https://img.alicdn.com/tps/TB1CbnsOXXXXXbLapXXXXXXXXXX-80-80.jpg_200x200.jpg","price":null,"catatory":null,"title":"聚名品"}]
     */

    private int code;
    private String message;
    private List<BannerBean> banner;
    private List<GoodsBean> goods;
    private List<HomeDataBean> homeData;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<BannerBean> getBanner() {
        return banner;
    }

    public void setBanner(List<BannerBean> banner) {
        this.banner = banner;
    }

    public List<GoodsBean> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsBean> goods) {
        this.goods = goods;
    }

    public List<HomeDataBean> getHomeData() {
        return homeData;
    }

    public void setHomeData(List<HomeDataBean> homeData) {
        this.homeData = homeData;
    }

    public static class BannerBean {
        /**
         * id : 1
         * type : 0
         * picurl : http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg
         * pictext : 好好学习
         * piccontent : null
         */

        private String id;
        private String type;
        private String picurl;
        private String pictext;
        private Object piccontent;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public String getPictext() {
            return pictext;
        }

        public void setPictext(String pictext) {
            this.pictext = pictext;
        }

        public Object getPiccontent() {
            return piccontent;
        }

        public void setPiccontent(Object piccontent) {
            this.piccontent = piccontent;
        }
    }

    public static class GoodsBean {
        /**
         * id : 1
         * type : 2
         * picurl : https://gd4.alicdn.com/imgextra/i4/380101244/TB2qUNua4mI.eBjy0FlXXbgkVXa_!!380101244.jpg
         * title : 男版羽绒服
         * date : 今天天气好晴朗
         * istop : 1
         * content : 今天天气好晴朗
         * author : 周强
         * price : 788
         */

        private String id;
        private String type;
        private String picurl;
        private String title;
        private String date;
        private String istop;
        private String content;
        private String author;
        private String price;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getIstop() {
            return istop;
        }

        public void setIstop(String istop) {
            this.istop = istop;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }

    public static class HomeDataBean {
        /**
         * id : 1
         * name : null
         * picurl : https://img.alicdn.com/i3/1865005016582328322/TB2JOZGgUhnpuFjSZFEXXX0PFXa_!!0-juitemmedia.jpg_200x200.jpg
         * price : null
         * catatory : null
         * title : 非常大牌
         */

        private String id;
        private Object name;
        private String picurl;
        private Object price;
        private Object catatory;
        private String title;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public Object getPrice() {
            return price;
        }

        public void setPrice(Object price) {
            this.price = price;
        }

        public Object getCatatory() {
            return catatory;
        }

        public void setCatatory(Object catatory) {
            this.catatory = catatory;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
