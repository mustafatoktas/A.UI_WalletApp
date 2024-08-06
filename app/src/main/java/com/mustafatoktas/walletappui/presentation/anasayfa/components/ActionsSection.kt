package com.mustafatoktas.walletappui.presentation.anasayfa.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.ArrowUpward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafatoktas.walletappui.R
import com.mustafatoktas.walletappui.ui.WalletAppUITheme


@Composable
fun ActionsSection(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        ActionItem(
            ikon = Icons.Rounded.ArrowUpward,
            text = "Send",
            renk = Color.Red.copy(0.35f),
        )

        ActionItem(
            ikon = Icons.Rounded.ArrowDownward,
            text = "Receive",
            renk = Color.Green.copy(0.4f),
        )

        ActionItem(
            ikon = Icons.Outlined.GridView,
            text = "More",
            renk = Color.Gray.copy(0.4f),
        )
    }
}

@Composable
fun ActionItem(
    modifier: Modifier = Modifier,
    ikon: ImageVector,
    text: String,
    renk: Color,
) {
    Column(
        modifier = modifier
            .clickable {},
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .background(renk),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = ikon,
                contentDescription = text,
                tint = Color.Black,
                modifier = Modifier.size(27.dp),
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = text,
            fontFamily = Font(R.font.play).toFontFamily(),
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 16.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ActionsSectionPreview() {
    WalletAppUITheme {
        ActionsSection()
    }
}