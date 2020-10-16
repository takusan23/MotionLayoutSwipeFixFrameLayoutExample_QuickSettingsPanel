package io.github.takusan23.motionlayoutswipefixframelayoutexample_quicksettingspanel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.github.takusan23.motionlayoutswipefixframelayoutexample_backdrop.Adapter.ListAdapter
import io.github.takusan23.motionlayoutswipefixframelayoutexample_backdrop.DataClass.ListData
import kotlinx.android.synthetic.main.fragment_quick_setting.*

class QuickSettingPanelFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_quick_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val notificationList = arrayListOf<ListData>()
        val notifications = arrayListOf("新しいメッセージ", "システムの更新", "番組開始", "ふぁぼ通知", "明日は晴れ")
        repeat(20) {
            notificationList.add(ListData("通知", notifications.random(), requireContext().getDrawable(R.drawable.ic_outline_notifications_active_24)))
        }
        quick_setting_recyclerview.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ListAdapter(notificationList)
        }

        swipe_fix_framelayout.apply {
            allowIdList.add(R.id.start)
            allowIdList.add(R.id.end)
            swipeTargetView = quick_setting_panel_notification_drag
            motionLayout = fragment_quick_motionlayout
        }

    }

}