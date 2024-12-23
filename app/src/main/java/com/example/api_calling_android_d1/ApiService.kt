package com.example.api_calling_android_d1

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    @GET("posts")

    fun getPostsList(): Observable<List<PostsModel>>


    @GET("comments")

    fun getCommentsList(): Observable<List<CommentsModel>>


    @GET("albums")

    fun getAlbumsList(): Observable<List<AlbumModel>>


    @GET("photos")

    fun getPhotosList(): Observable<List<PostsModel>>


    @GET("todos")

    fun getToDoList(): Observable<List<ToDoModel>>


    @GET("users")

    fun getUsersList(): Observable<List<UsersModel>>


}