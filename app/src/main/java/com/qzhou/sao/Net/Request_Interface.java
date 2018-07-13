package com.qzhou.sao.Net;


import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.Bean.TouBean;

import retrofit2.http.GET;
import rx.Observable;

public interface Request_Interface {

    //请求 轮播图
    @GET("index.php/Home/Api/getData")
    Observable<HomeData> getVerfcationGet();


    //http://ic.snssdk.com/2/article/v25/stream/?count=20&min_behot_time=1504621638&bd_latitude=4.9E-324&bd_longitude=4.9E-324&bd_loc_time=1504622133&loc_mode=5&loc_time=1504564532&latitude=35.00125&longitude=113.56358166666665&city=%E7%84%A6%E4%BD%9C&lac=34197&cid=23201&iid=14534335953&device_id=38818211465&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SM-E7000&os_api=19&os_version=4.4.2&uuid=357698010742401&openudid=74f06d2f9d8c9664

    @GET("search_content/?offset=0&format=json&keyword=视频&autoload=true&count=20&cur_tab=1&from=search_tab")
    Observable<TouBean> getTouVideo();




}
