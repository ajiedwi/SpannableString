package com.ajiedwi.spannablestring

import android.graphics.Color
import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat

fun TextView.setTextTwoColor(
    first: String,
    second: String
) {
    val firstText = SpannableString(first)
    firstText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.black_text)),
        0,
        firstText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    text = firstText
    val secondText = SpannableString(" $second")
    secondText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.blue)),
        0,
        secondText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    append(secondText)
}

fun TextView.setTextThreeColor(
    first: String,
    second: String,
    third: String
) {
    val firstText = SpannableString(first)
    firstText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.black_text)),
        0,
        firstText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    text = firstText
    val secondText = SpannableString(" $second")
    secondText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.blue)),
        0,
        secondText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    append(secondText)
    val thirdText = SpannableString(" $third")
    thirdText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.red)),
        0,
        thirdText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    append(thirdText)
}

fun TextView.setTextTwoStyle(
    first: String,
    second: String
) {
    val firstText = SpannableString(first)
    firstText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.black_text)),
        0,
        firstText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    text = firstText
    val secondText = SpannableString(" $second")
    secondText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.black_text)),
        0,
        secondText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    secondText.setSpan(
        StyleSpan(Typeface.BOLD),
        0,
        secondText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    append(secondText)
}

fun TextView.setTextTwoStyleColor(
    first: String,
    second: String
) {
    val firstText = SpannableString(first)
    firstText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.black_text)),
        0,
        firstText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    text = firstText
    val secondText = SpannableString(" $second")
    secondText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.blue)),
        0,
        secondText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    secondText.setSpan(
        StyleSpan(Typeface.BOLD),
        0,
        secondText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    append(secondText)
}

fun TextView.setTextClickable(
    first: String,
    second: String,
    onClick: () -> Unit
) {
    val firstText = SpannableString(first)
    firstText.setSpan(
        ForegroundColorSpan(ContextCompat.getColor(context, R.color.black_text)),
        0,
        firstText.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    text = firstText
    append(" ")
    val secondText = SpannableString(second)
    val clickableSpan = object : ClickableSpan(){
        override fun onClick(p0: View) {
            onClick.invoke()
        }

        override fun updateDrawState(ds: TextPaint) {
            super.updateDrawState(ds)
            ds.isUnderlineText = true
        }
    }
    secondText.setSpan(clickableSpan, 0, secondText.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    append(secondText)
    movementMethod = LinkMovementMethod.getInstance()
}
