package io.github.takusan23.motionlayoutswipefixframelayoutexample_backdrop.DataClass

import android.graphics.drawable.Drawable

/** [io.github.takusan23.motionlayoutswipefixframelayoutexample_backdrop.Adapter.ListAdapter]で使うデータクラス */
data class ListData(
    val title: String,
    val description: String,
    val drawable: Drawable?
)