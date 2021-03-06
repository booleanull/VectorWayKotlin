package com.booleanull.vectorway.posts
data class Post (
    val id : Int = 0,
    val title : String = "Title",
    val text : String = "Some text",
    val date : String = "Date",
    val site : String = "",
    val way : Int = 0,
    val level : Int = 0) : ViewInPost {

    override fun getViewId(): Int {
        return id_post
    }
}