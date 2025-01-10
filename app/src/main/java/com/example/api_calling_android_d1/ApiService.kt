package com.example.api_calling_android_d1

import com.example.api_calling_android_d1.models.AlbumModel
import com.example.api_calling_android_d1.models.CommentsModel
import com.example.api_calling_android_d1.models.PhotosModel
import com.example.api_calling_android_d1.models.PostsModel
import com.example.api_calling_android_d1.models.ToDoModel
import com.example.api_calling_android_d1.models.UsersModel
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

    fun getPhotosList(): Observable<List<PhotosModel>>


    @GET("todos")

    fun getToDoList(): Observable<List<ToDoModel>>


    @GET("users")

    fun getUsersList(): Observable<List<UsersModel>>


}