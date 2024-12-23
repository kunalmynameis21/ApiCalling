package com.example.api_calling_android_d1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val button1 = findViewById<Button>(R.id.toapi)
        button1.setOnClickListener{
            val retrofit= Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiService::class.java).getToDoList()

            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it[0].userId}", Toast.LENGTH_LONG).show()
                }

        }

        val button2 = findViewById<Button>(R.id.coapi)
        button2.setOnClickListener{
            val retrofit= Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiService::class.java).getCommentsList()

            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it[0].email}", Toast.LENGTH_LONG).show()
                }

        }

        val buttonn = findViewById<Button>(R.id.albapi)
        buttonn.setOnClickListener{
            val retrofit= Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiService::class.java).getAlbumsList()

            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it[0].id}", Toast.LENGTH_LONG).show()
                }

        }

        val button4 = findViewById<Button>(R.id.phapi)
        button4.setOnClickListener{
            val retrofit= Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiService::class.java).getPhotosList()

            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it[0].id}", Toast.LENGTH_LONG).show()
                }

        }

        val button5 = findViewById<Button>(R.id.usapi)
        button5.setOnClickListener{
            val retrofit= Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiService::class.java).getUsersList()

            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it[0].name}", Toast.LENGTH_LONG).show()
                }

        }

        val button6 = findViewById<Button>(R.id.poapi)
        button6.setOnClickListener{
            val retrofit= Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiService::class.java).getPostsList()

            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it[0].id}", Toast.LENGTH_LONG).show()
                }

        }


    }
}