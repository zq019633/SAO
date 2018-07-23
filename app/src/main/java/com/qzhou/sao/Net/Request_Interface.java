package com.qzhou.sao.Net;


import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.Bean.Tou.CommentResponse;
import com.qzhou.sao.Bean.Tou.NewsDetail;
import com.qzhou.sao.Bean.Tou.ResultResponse;
import com.qzhou.sao.Bean.Tou.TouResponseBean;
import com.qzhou.sao.Bean.TouBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;

public interface Request_Interface {

    //请求 轮播图
    @GET("index.php/Home/Api/getData")
    Observable<HomeData> getVerfcationGet();


    //http://ic.snssdk.com/2/article/v25/stream/?count=20&min_behot_time=1504621638&bd_latitude=4.9E-324&bd_longitude=4.9E-324&bd_loc_time=1504622133&loc_mode=5&loc_time=1504564532&latitude=35.00125&longitude=113.56358166666665&city=%E7%84%A6%E4%BD%9C&lac=34197&cid=23201&iid=14534335953&device_id=38818211465&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SM-E7000&os_api=19&os_version=4.4.2&uuid=357698010742401&openudid=74f06d2f9d8c9664
    //https://www.toutiao.com/search_content/?offset=0&format=json&keyword=%E8%A7%86%E9%A2%91&autoload=true&count=20&cur_tab=1&from=search_tab
    @GET("search_content/?offset=0&format=json&keyword=视频&autoload=true&count=20&cur_tab=1&from=search_tab")
    Observable<TouBean> getTouVideo();


    @GET("search_content/?offset=0&format=json&keyword=视频&autoload=true&count=20&cur_tab=1&from=search_tab")
    Observable<TouBean> getTouVideoLordMore();


    //头条实时数据
    //http://is.snssdk.com/api/news/feed/v62/?refer=1&count=20&loc_mode=4&device_id=34960436458&iid=13136511752&category=&min_behot_time=1531725369&last_refresh_sub_entrance_interval=1531726528

    @GET("api/news/feed/v62/?refer=1&count=20&loc_mode=4&device_id=34960436458&iid=13136511752")
    Observable<TouResponseBean> getTouData(@Query("category") String category,@Query("min_behot_time") long lastTime, @Query("last_refresh_sub_entrance_interval") long currentTime);


    @GET("article/v2/tab_comments/")
    Observable<CommentResponse> getComment(@Query("group_id") String groupId, @Query("item_id") String itemId, @Query("offset") int offset, @Query("count") int count);




//
//    @Headers({
//            "Content-Type:application/x-www-form-urlencoded; charset=UTF-8",
//            "Cookie:PHPSESSIID=334267171504; _ga=GA1.2.646236375.1499951727; _gid=GA1.2.951962968.1507171739; Hm_lvt_e0a6a4397bcb500e807c5228d70253c8=1507174305;Hm_lpvt_e0a6a4397bcb500e807c5228d70253c8=1507174305; _gat=1",
//            "Origin:http://toutiao.iiilab.com"
//
//    })

    @GET
    Observable<ResultResponse<NewsDetail>> getTouNewsDetatil(@Url String url);




}
