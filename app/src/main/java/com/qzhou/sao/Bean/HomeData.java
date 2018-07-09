package com.qzhou.sao.Bean;

import java.util.List;

public class HomeData {


    /**
     * code : 200
     * message : 请求成功
     * banner : [{"id":"1","type":"0","picurl":"http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg","pictext":"好好学习","piccontent":null},{"id":"2","type":"0","picurl":"http://ww4.sinaimg.cn/large/006uZZy8jw1faic259ohaj30ci08c74r.jpg","pictext":"天天向上","piccontent":null},{"id":"3","type":"0","picurl":"http://ww4.sinaimg.cn/large/006uZZy8jw1faic2b16zuj30ci08cwf4.jpg","pictext":"热爱劳动","piccontent":null},{"id":"4","type":"0","picurl":"http://ww4.sinaimg.cn/large/006uZZy8jw1faic2e7vsaj30ci08cglz.jpg","pictext":"不搞对象","piccontent":null}]
     * news : [{"id":"1","type":"2","picurl":"1","title":"今天天气好晴朗","date":"今天天气好晴朗","istop":"1","content":"今天天气好晴朗","author":"周强"}]
     */

    private int code;
    private String message;
    private List<BannerBean> banner;
    private List<NewsBean> news;

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

    public List<NewsBean> getNews() {
        return news;
    }

    public void setNews(List<NewsBean> news) {
        this.news = news;
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

    public static class NewsBean {
        /**
         * id : 1
         * type : 2
         * picurl : 1
         * title : 今天天气好晴朗
         * date : 今天天气好晴朗
         * istop : 1
         * content : 今天天气好晴朗
         * author : 周强
         */

        private String id;
        private String type;
        private String picurl;
        private String title;
        private String date;
        private String istop;
        private String content;
        private String author;

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
    }
}
