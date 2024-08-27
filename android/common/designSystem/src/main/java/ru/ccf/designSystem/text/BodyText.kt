package ru.ccf.designSystem.text

import androidx.annotation.StringRes
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign

/**
 * [BodyText] is text for Body
 *
 * @param textRes resource on text, which will be displayed
 * @param isLarge true or false, depends on size of body
 *
 * @author Egor Danilov
 */
@Composable
fun BodyText(
    @StringRes textRes: Int,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    textAlign: TextAlign = TextAlign.Start,
    isLarge: Boolean = false,
    maxLines: Int? = null
) = BaseBodyText(
    text = stringResource(textRes),
    modifier = modifier,
    color = color,
    textAlign = textAlign,
    isLarge = isLarge,
    maxLines = maxLines
)

/**
 * [bodyText] is text for title
 *
 * @param text string with text, which will be displayed
 * @param isLarge true or false, depends on size of body
 *
 * @author Egor Danilov
 */
@Composable
fun BodyText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    textAlign: TextAlign = TextAlign.Start,
    isLarge: Boolean = false,
    maxLines: Int? = null
) = BaseBodyText(
    text = text,
    modifier = modifier,
    color = color,
    textAlign = textAlign,
    isLarge = isLarge,
    maxLines = maxLines
)

/**
 * [BaseBodyText] - base realization of [BodyText]
 *
 * @param text string with text, which will be displayed
 * @param isLarge true or false, depends on size of body
 *
 * @author Egor Danilov
 */
@Composable
private fun BaseBodyText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    textAlign: TextAlign = TextAlign.Start,
    isLarge: Boolean = false,
    maxLines: Int? = null
) = Text(
    text = text,
    style = if (isLarge) {
        MaterialTheme.typography.bodyMedium
    } else {
        MaterialTheme.typography.bodySmall
    },
    modifier = modifier,
    color = color,
    textAlign = textAlign,
    maxLines = maxLines ?: Int.MAX_VALUE
)
