package com.starot.larger.impl

import androidx.recyclerview.widget.RecyclerView


interface OnAfterTransitionListener {

    //加载图片
    fun afterTransitionLoad(isLoadFull: Boolean,holder: RecyclerView.ViewHolder)
}