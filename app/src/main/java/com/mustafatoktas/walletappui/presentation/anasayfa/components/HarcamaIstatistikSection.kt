package com.mustafatoktas.walletappui.presentation.anasayfa.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafatoktas.walletappui.R
import com.mustafatoktas.walletappui.common.getRandomRenk
import com.mustafatoktas.walletappui.ui.WalletAppUITheme
import me.bytebeats.views.charts.bar.BarChart
import me.bytebeats.views.charts.bar.BarChartData
import me.bytebeats.views.charts.bar.render.label.SimpleLabelDrawer
import me.bytebeats.views.charts.bar.render.label.SimpleLabelDrawer.DrawLocation
import me.bytebeats.views.charts.bar.render.xaxis.SimpleXAxisDrawer
import me.bytebeats.views.charts.bar.render.yaxis.SimpleYAxisDrawer


@Composable
fun HarcamaIStatistikSection(
    modifier: Modifier = Modifier
) {

    Text(
        modifier = modifier,
        text = "Spending Statistics",
        fontFamily = Font(R.font.play).toFontFamily(),
        fontSize = 25.sp
    )

    Chart(modifier = modifier)
}

@Composable
fun Chart(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.height(220.dp),
    ) {
        BarChart(
            modifier = modifier,
            barChartData = BarChartData(bars = spendingByDay),
            xAxisDrawer = SimpleXAxisDrawer(
                axisLineColor = MaterialTheme.colorScheme.onBackground.copy(0.2f),
                axisLineThickness = 2.dp
            ),
            yAxisDrawer = SimpleYAxisDrawer(
                labelTextColor = MaterialTheme.colorScheme.onBackground.copy(0.7f),
                axisLineColor = MaterialTheme.colorScheme.onBackground.copy(0.1f),
                drawLabelEvery = 3,
                labelValueFormatter = {
                    "$ ${it.toInt()}"
                }
            ),
            labelDrawer = SimpleLabelDrawer(
                drawLocation = DrawLocation.Outside,
                labelTextSize = 15.sp,
                labelTextColor = MaterialTheme.colorScheme.onBackground.copy(0.7f)
            )
        )
    }
}

val spendingByDay = listOf(
    BarChartData.Bar(
        label = "Aug 1",
        value = 80f,
        color = getRandomRenk(50),
    ),
    BarChartData.Bar(
        label = "Aug 2",
        value = 123f,
        color = getRandomRenk(50),
    ),
    BarChartData.Bar(
        label = "Aug 3",
        value = 204f,
        color = getRandomRenk(50),
    ),
    BarChartData.Bar(
        label = "Aug 4",
        value = 34f,
        color = getRandomRenk(50),
    ),
    BarChartData.Bar(
        label = "Aug 5",
        value = 74f,
        color = getRandomRenk(50),
    )
)

@Preview(showBackground = true)
@Composable
private fun HarcamaIStatistikSectionPreview() {
    WalletAppUITheme {
        HarcamaIStatistikSection()
    }
}