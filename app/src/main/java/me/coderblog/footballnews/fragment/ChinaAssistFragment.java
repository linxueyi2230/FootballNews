package me.coderblog.footballnews.fragment;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import me.coderblog.footballnews.global.Http;
import me.coderblog.footballnews.util.Utils;

/**
 * 中超助攻榜Fragment
 */
public class ChinaAssistFragment extends BaseAssistFragment {
    @Override
    public void loadDataFromServer() {
        //创建请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(Utils.getContext());
        //创建请求
        StringRequest stringRequest = new StringRequest(Http.URL_ASSIST_CHINA, this, this);
        //将请求添加到请求队列
        requestQueue.add(stringRequest);
    }
}
