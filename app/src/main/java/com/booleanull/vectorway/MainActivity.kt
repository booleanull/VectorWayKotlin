package com.booleanull.vectorway

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.booleanull.vectorway.posts.NewsFragment
import com.booleanull.vectorway.posts.Post
import com.booleanull.vectorway.posts.PostAdapter

class MainActivity : AppCompatActivity() {

    val posts: List<Post> = ArrayList<Post>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentNews : Fragment = NewsFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager
            .beginTransaction()
            .replace(R.id.contentFragment, fragmentNews)
            .commit()

        val postAdapter : PostAdapter = PostAdapter(posts)

        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.adapter = postAdapter
    }
}