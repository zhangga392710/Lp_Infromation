package com.example.zga.api;

import com.example.zga.bean.UserBean;

import retrofit2.http.GET;
import rx.Observable;

/**
 * @author z`guo`an on 2017/4/13 15:18
 */

public interface Api {

    @GET("api.php")
    Observable<UserBean> getData();

}
