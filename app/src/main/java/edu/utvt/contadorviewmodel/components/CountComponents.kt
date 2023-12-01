package edu.utvt.contadorviewmodel.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.FloatingActionButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CurrentValueCounter(counter: Int){
    Text(
        text = "$counter",
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.padding(bottom = 20.dp)
    )
}

@Composable
fun CustomFloatingActionButton(
    modifier: Modifier = Modifier.padding(10.dp),
    contentDescription: String = "Default",
    elevation: FloatingActionButtonElevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(
        5.dp
    ),
    onClick: () -> Unit = {}
){
    ExtendedFloatingActionButton(
        modifier = modifier,
        onClick = { onClick() },
        elevation = elevation
    ) {
        Icon(imageVector = Icons.Default.Add, contentDescription = contentDescription)
        Text(text = contentDescription)
    }
}