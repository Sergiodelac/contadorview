package edu.utvt.contadorviewmodel.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import edu.utvt.contadorviewmodel.components.CurrentValueCounter
import edu.utvt.contadorviewmodel.viewmodels.CountViewModel

@Composable
fun CountView(viewModel: CountViewModel) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CurrentValueCounter(viewModel.count.value)


        CustomFloatingActionButton(
            contentDescription = "Incrementar Contador",
            onClick = { viewModel.increment() },
            icon = Icons.Default.Done
        )


        CustomFloatingActionButton(
            modifier = Modifier.padding(top = 16.dp),
            contentDescription = "Decrementar Contador",
            onClick = { viewModel.decrement() },
            icon = Icons.Default.Delete
        )
    }
}

@Composable
fun CustomFloatingActionButton(
    modifier: Modifier = Modifier,
    contentDescription: String = "Default",
    onClick: () -> Unit = {},
    icon: ImageVector
) {
    ExtendedFloatingActionButton(
        modifier = modifier,
        onClick = { onClick() },
    ) {
        Icon(imageVector = icon, contentDescription = null)
        Text(text = contentDescription)
    }
}





