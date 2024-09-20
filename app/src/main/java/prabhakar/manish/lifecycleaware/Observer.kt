package prabhakar.manish.lifecycleaware

import android.app.usage.UsageEvents
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun oncreaete(){
        Log.d("Observer","Observer onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onstart(){
        Log.d("Observer","Observer onStart")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onresume(){
        Log.d("Observer","Observer onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onpause(){
        Log.d("Observer","Observer onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onstop(){
        Log.d("Observer","Observer onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun ondestroy(){
        Log.d("Observer","Observer onDestroy")
    }
}