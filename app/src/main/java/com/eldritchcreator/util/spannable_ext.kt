package com.eldritchcreator.util

import android.content.Context
import android.text.Spannable
import android.text.SpannableString
import android.text.TextPaint
import android.text.TextUtils
import android.text.style.BackgroundColorSpan
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.text.style.ImageSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StrikethroughSpan
import android.text.style.StyleSpan
import android.text.style.SubscriptSpan
import android.text.style.SuperscriptSpan
import android.text.style.URLSpan
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat

fun spannable(vararg te: SpannableString) : SpannableString {
    var spannable = SpannableString("")

    te.forEach {
        spannable += it
    }

    return spannable
}

private fun span(s: CharSequence, vararg spans: Any): SpannableString {
    val spannable =
        if (s is String) SpannableString(s)
        else (s as? SpannableString) ?: SpannableString("")

    spans.forEach {
        spannable.setSpan(it, 0, spannable.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }

    return spannable
}

operator fun SpannableString.plus(s: SpannableString) = SpannableString(TextUtils.concat(this, s))
operator fun SpannableString.plus(s: String) = SpannableString(TextUtils.concat(this, s))

fun normal(s: CharSequence) = span(s, SpannableString(s))
fun bold(s: CharSequence) = span(s, StyleSpan(android.graphics.Typeface.BOLD))
fun italic(s: CharSequence) = span(s, StyleSpan(android.graphics.Typeface.ITALIC))
fun underline(s: CharSequence) = span(s, UnderlineSpan())
fun strike(s: CharSequence) = span(s, StrikethroughSpan())
fun sup(s: CharSequence) = span(s, SuperscriptSpan())
fun sub(s: CharSequence) = span(s, SubscriptSpan())
fun size(size: Float, s: CharSequence) = span(s, RelativeSizeSpan(size))
fun color(color: Int, s: CharSequence) = span(s, ForegroundColorSpan(color))
fun background(color: Int, s: CharSequence) = span(s, BackgroundColorSpan(color))
fun url(url: String, s: CharSequence) = span(s, URLSpan(url))
fun colorBold(s: CharSequence, color: Int) = span(
    s,
    ForegroundColorSpan(color),
    StyleSpan(android.graphics.Typeface.BOLD)
)

fun image(textView: TextView, resourceId: Int): SpannableString {
    val drawable =
        ContextCompat.getDrawable(textView.context, resourceId) ?: throw IllegalStateException()
    val ratio = drawable.intrinsicHeight.toDouble() / textView.lineHeight.toDouble()
    val width = drawable.intrinsicWidth.toDouble() / ratio

    drawable.setBounds(0, 0, width.toInt(), textView.lineHeight)

    return span(
        " ",
        ImageSpan(drawable, ImageSpan.ALIGN_BOTTOM)
    )
}

fun clickable(context: Context, s: CharSequence, color: Int, id: Int = 0, func: (Int) -> Unit) =
    span(s,
        object : ClickableSpan() {
            override fun onClick(widget: View) {
                func(id)
            }

            override fun updateDrawState(ds: TextPaint) {
                ds.color = ContextCompat.getColor(context, color)
            }
        })