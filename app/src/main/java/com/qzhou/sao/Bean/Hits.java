package com.qzhou.sao.Bean;


    public class Hits {
        private String video_url;

        private String title;

        private String detail_schema;

        private int digg_count;

        private String large_thumbnail_url;

        private int play_count;

        private String thumbnail_url;

        private String group_id;

        public void setVideo_url(String video_url){
            this.video_url = video_url;
        }
        public String getVideo_url(){
            return this.video_url;
        }
        public void setTitle(String title){
            this.title = title;
        }
        public String getTitle(){
            return this.title;
        }
        public void setDetail_schema(String detail_schema){
            this.detail_schema = detail_schema;
        }
        public String getDetail_schema(){
            return this.detail_schema;
        }
        public void setDigg_count(int digg_count){
            this.digg_count = digg_count;
        }
        public int getDigg_count(){
            return this.digg_count;
        }
        public void setLarge_thumbnail_url(String large_thumbnail_url){
            this.large_thumbnail_url = large_thumbnail_url;
        }
        public String getLarge_thumbnail_url(){
            return this.large_thumbnail_url;
        }
        public void setPlay_count(int play_count){
            this.play_count = play_count;
        }
        public int getPlay_count(){
            return this.play_count;
        }
        public void setThumbnail_url(String thumbnail_url){
            this.thumbnail_url = thumbnail_url;
        }
        public String getThumbnail_url(){
            return this.thumbnail_url;
        }
        public void setGroup_id(String group_id){
            this.group_id = group_id;
        }
        public String getGroup_id(){
            return this.group_id;
        }

    }