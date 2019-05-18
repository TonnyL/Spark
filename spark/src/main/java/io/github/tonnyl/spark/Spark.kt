package io.github.tonnyl.spark

import android.graphics.drawable.AnimationDrawable
import android.view.View
import androidx.annotation.DrawableRes

/**
 * Create a background animation like instagram.
 *
 * @param view View to be animated.
 * @param animList Gradient drawable resource id.
 * @param duration Total animation duration in millisecond.
 */
data class Spark(
        val view: View,
        @DrawableRes val animList: Int,
        val duration: Int = 4000
) {

    private var _backgroundAnimationDrawable: AnimationDrawable? = null

    /**
     * Start the gradient animation any time you want.
     */
    fun startAnimation() {
        view.setBackgroundResource(animList)
        _backgroundAnimationDrawable = view.background as? AnimationDrawable
                ?: throw IllegalStateException("View's background is not AnimationDrawable")

        _backgroundAnimationDrawable?.setEnterFadeDuration(duration)
        _backgroundAnimationDrawable?.setExitFadeDuration(duration)

        view.background = _backgroundAnimationDrawable
        view.post {
            _backgroundAnimationDrawable?.start()
        }
    }

    /**
     * Stop the gradient animation any time you want.
     */
    fun stopAnimation() {
        if (_backgroundAnimationDrawable?.isRunning == true) {
            _backgroundAnimationDrawable?.stop()
        }
    }

    companion object {

        @JvmField
        val ANIM_GREEN_PURPLE = R.drawable.anim_green_purple

        @JvmField
        val ANIM_BLUE_PURPLE = R.drawable.anim_blue_purple

        @JvmField
        val ANIM_RED_PURPLE = R.drawable.anim_red_purple

    }

}