package nz.co.t3cs.t3amwod

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class T3AMWOD_WATCH : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t3amwod__watch)

        // Enables Always-on
        setAmbientEnabled()
    }
}
