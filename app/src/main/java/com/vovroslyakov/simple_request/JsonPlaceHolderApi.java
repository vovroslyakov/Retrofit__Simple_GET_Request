package com.vovroslyakov.simple_request;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPost();

    @GET("posts/2/comments")
    Call<List<Comment>> getComments();



}
