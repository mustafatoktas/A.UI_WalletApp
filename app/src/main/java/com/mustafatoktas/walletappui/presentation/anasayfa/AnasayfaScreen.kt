package com.mustafatoktas.walletappui.presentation.anasayfa

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.mustafatoktas.walletappui.presentation.anasayfa.components.ActionsSection
import com.mustafatoktas.walletappui.presentation.anasayfa.components.AnasayfaToolbar
import com.mustafatoktas.walletappui.presentation.anasayfa.components.CardSection
import com.mustafatoktas.walletappui.presentation.anasayfa.components.HarcamaIStatistikSection
import com.mustafatoktas.walletappui.presentation.anasayfa.components.HarcamaSection


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnasayfaScreen(
    modifier: Modifier = Modifier
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    )

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            AnasayfaToolbar(
                modifier = Modifier.fillMaxWidth(),
                scrollBehavior = scrollBehavior
            )
        }
    ) { paddingValues ->
        Column(
            modifier = modifier
                .verticalScroll(rememberScrollState())
                .padding(paddingValues)
        ) {

            Spacer(modifier = Modifier.height(30.dp))

            CardSection(
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            ActionsSection(modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(40.dp))

            HarcamaSection(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 22.dp)
            )

            Spacer(modifier = Modifier.height(40.dp))

            HarcamaIStatistikSection(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 22.dp)
            )

            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}