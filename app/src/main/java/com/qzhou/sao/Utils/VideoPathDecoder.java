package com.qzhou.sao.Utils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.qzhou.sao.UI.Activity.VideoDetailActivity;

public abstract class VideoPathDecoder {




    @SuppressLint("JavascriptInterface")
    public void decodePath(VideoDetailActivity context, String url) {
        Log.e("zq","解析的url:"+url);
//
//        url="http://www.365yg.com/a6578601858724528644/#mid=99184236658";
        WebView webView = new WebView(context);
        WebSettings settings = webView.getSettings();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.requestFocus();
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);

        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                //跑js
               addJs(view);
               Log.e("zq",""+"我跑完了");
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
            }
        });

        ParseRelation relation = new ParseRelation(new IGetParamsListener() {
            @Override
            public void onGetPath(String path) {
//                Log.e("zq","url："+path);

                success(path);



            }
        });
        webView.addJavascriptInterface(relation, "zq");
    }

    public abstract void success(String url);

    private void addJs(WebView webView) {
        webView.loadUrl("javascript:window.zq.onGetPath(document.getElementsByTagName(\'video\')[0].src)");
    }

    class ParseRelation {
        IGetParamsListener listener;
        public ParseRelation(IGetParamsListener listener) {
            this.listener=listener;
        }

        @JavascriptInterface
        public void onGetPath(String path) {
            //回掉到这个类中的 路径

            Log.e("zq","js 调用的安卓方法:"+path);
            listener.onGetPath(path);
        }
    }

    public interface IGetParamsListener{
        void onGetPath(String path);
    }
}




