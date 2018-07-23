package com.qzhou.sao.UI.Activity;

import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.nukc.stateview.StateView;
import com.qzhou.sao.Base.BaseActicity;
import com.qzhou.sao.Bean.Tou.News;
import com.qzhou.sao.Bean.Tou.NewsDetail;
import com.qzhou.sao.Bean.Tou.ResultResponse;
import com.qzhou.sao.Net.NetWork;
import com.qzhou.sao.R;

import rx.Observer;

public class WebViewActivity  extends BaseActicity{

    private WebView mWebView;
    private String article_url;
    private News detatil;
    private String content;

    @Override
    protected void initData(StateView mStateView) {
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        String itemId = detatil.item_id;
        StringBuffer urlSb = new StringBuffer("http://m.toutiao.com/i");
        urlSb.append(itemId).append("/info/");
        String url = urlSb.toString();//http://m.toutiao.com/i6412427713050575361/info/

       NetWork.getTouNewsDetatil(url, new Observer<ResultResponse<NewsDetail>>() {
           @Override
           public void onCompleted() {

           }

           @Override
           public void onError(Throwable e) {

           }

           @Override
           public void onNext(ResultResponse<NewsDetail> newsDetailResultResponse) {
               content = newsDetailResultResponse.data.content;
               String htmlPart1 = "<!DOCTYPE HTML html>\n" +
                       "<head><meta charset=\"utf-8\"/>\n" +
                       "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, user-scalable=no\"/>\n" +
                       "</head>\n" +
                       "<body>\n" +
                       "<style> \n" +
                       "img{width:100%!important;height:auto!important}\n" +
                       " </style>";
               String htmlPart2 = "</body></html>";

               String html = htmlPart1 + content + htmlPart2;



               mWebView.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);

           }
       });

    }
    @Override
    public void onBackPressed() {
        if (mWebView.canGoBack())
            mWebView.goBack();
        else
            super.onBackPressed();
    }


    @Override
    protected void initView() {

        detatil = (News) getIntent().getSerializableExtra("detatil");
        mWebView = findView(R.id.webView);


    }

    @Override
    protected int intiLayout() {
        return R.layout.activity_webview;
    }
}
