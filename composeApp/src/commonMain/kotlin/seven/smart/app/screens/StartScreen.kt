package seven.smart.app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import org.jetbrains.compose.resources.painterResource
import scheduler.composeapp.generated.resources.Res
import scheduler.composeapp.generated.resources.scheduleadd_image
import scheduler.composeapp.generated.resources.smart_person
import seven.smart.app.navigation.Screens

@Composable
fun StartScreen(navController: NavHostController) {
    Box(Modifier.background(Color.White).fillMaxSize()) {
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
            //Top Row
            Row(
                modifier = Modifier.fillMaxWidth().weight(0.2F),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(//#336193
                    //#38a7e7
                    text = "Smart Task Scheduler",
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        brush = Brush.verticalGradient(
                            colors = listOf(Color(0xFF336193), Color(0xFF38a7e7))
                        )
                    )
                )
            }

            //Middle Row
            Column(
                modifier = Modifier.fillMaxWidth().weight(0.7F),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = painterResource(Res.drawable.smart_person),
                    contentDescription = null,
                    modifier = Modifier.size(400.dp, 400.dp)
                )
                Text(
                    text = "Schedule tasks effortlessly.",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }


            //Bottom Row
            Row(
                modifier = Modifier.fillMaxWidth().weight(0.2F),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                Image(
                    painterResource(Res.drawable.scheduleadd_image),
                    null,
                    modifier = Modifier.size(60.dp).padding(0.dp, 0.dp, 20.dp, 20.dp)
                        .clickable(onClick = {
                            navController.navigate(Screens.Home.name)
                        })
                )
            }
        }
    }
}