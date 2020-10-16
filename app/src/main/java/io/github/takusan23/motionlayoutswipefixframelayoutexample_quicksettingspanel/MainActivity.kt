package io.github.takusan23.motionlayoutswipefixframelayoutexample_quicksettingspanel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import io.github.takusan23.motionlayoutswipefixframelayoutexample_backdrop.Adapter.ListAdapter
import io.github.takusan23.motionlayoutswipefixframelayoutexample_backdrop.DataClass.ListData
import io.github.takusan23.motionlayoutswipefixframelayoutexample_quicksettingspanel.Adapter.AppListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val appList = arrayListOf<ListData>()
        val apps = arrayListOf(
            Pair("設定", R.drawable.ic_outline_settings_24),
            Pair("地図", R.drawable.ic_outline_map_24),
            Pair("ブラウザ", R.drawable.ic_baseline_public_24),
            Pair("電話帳", R.drawable.ic_outline_account_box_24),
        )
        repeat(20) {
            val random = Random.nextInt(0, apps.size)
            appList.add(ListData(apps[random].first, apps[random].first, getDrawable(apps[random].second)))
        }
        activity_main_recyclerview.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(this@MainActivity, 4)
            adapter = AppListAdapter(appList)
        }


    }
}