package android.autocrypt.coronamap.ui

import android.autocrypt.coronamap.R
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class CircleProgressBar constructor(
    context: Context, attrs: AttributeSet?
): AppCompatImageView(context, attrs) {
    private var mProgress: Float
    private val arcRect: RectF = RectF()
    private val paint: Paint = Paint().apply {
        color = Color.CYAN
        isAntiAlias = true
        strokeWidth = 5f
        style = Paint.Style.STROKE
    }

    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CircleProgressBarAttr,
            0, 0).apply {
            try {
                mProgress = getFloat(R.styleable.CircleProgressBarAttr_progress, 0f)
            } finally {
                recycle()
            }
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        arcRect.set(
            5f,
            5f,
            width.toFloat() - 5,
            height.toFloat() - 5
        )
        canvas?.drawArc(arcRect, START_PROGRESS, mProgress, false, paint)
    }

    fun setProgress(progress: Float) {
        this.mProgress = progress
        invalidate()
    }

    companion object {
        const val START_PROGRESS = 180f
        const val END_ARC_VALUE = 360f
    }
}