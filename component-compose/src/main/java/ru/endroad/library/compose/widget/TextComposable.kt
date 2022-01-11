package ru.endroad.library.compose.widget

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import ru.endroad.library.compose.theme.MaterialColor.Gray
import ru.endroad.library.compose.theme.s600

@Composable
fun TitleText(
	text: String,
	modifier: Modifier = Modifier,
	color: Color = Color.Unspecified,
	textAlign: TextAlign? = null,
) = Text(
	text = text,
	modifier = modifier,
	color = color,
	style = MaterialTheme.typography.h6,
	textAlign = textAlign,
)

@Composable
fun PrimaryText(
	text: String,
	modifier: Modifier = Modifier,
	color: Color = Color.Unspecified,
	textAlign: TextAlign? = null,
) = Text(
	text = text,
	modifier = modifier,
	color = color,
	style = MaterialTheme.typography.body1,
	textAlign = textAlign,
)

@Composable
fun PrimaryBoldText(
	text: String,
	modifier: Modifier = Modifier,
	color: Color = Color.Unspecified,
	textAlign: TextAlign? = null,
) = Text(
	text = text,
	modifier = modifier,
	color = color,
	style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Bold),
	textAlign = textAlign,
)

@Composable
fun SecondaryText(
	text: String,
	modifier: Modifier = Modifier,
	color: Color = Color.Unspecified,
	textAlign: TextAlign? = null,
) = Text(
	text = text,
	modifier = modifier,
	color = color,
	style = MaterialTheme.typography.body2,
	textAlign = textAlign,
)

@Composable
fun CaptionText(
	text: String,
	modifier: Modifier = Modifier,
	color: Color = Gray.s600, //TODO вынести в кастомную палитру
	textAlign: TextAlign? = null,
) = Text(
	text = text,
	modifier = modifier,
	color = color,
	style = MaterialTheme.typography.caption,
	textAlign = textAlign,
)

@Composable
fun ActionText(
	text: String,
	modifier: Modifier = Modifier,
	color: Color = Color.Unspecified,
	textAlign: TextAlign? = null,
) = Text(
	text = text,
	modifier = modifier,
	color = color,
	style = MaterialTheme.typography.button,
	textAlign = textAlign,
)
