package ru.endroad.library.compose.extension

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast

fun Context.setClipboard(label: String, text: String) {
	val clip = ClipData.newPlainText(label, text)

	val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
	clipboardManager?.setPrimaryClip(clip)

	Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}
