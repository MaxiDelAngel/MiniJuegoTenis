package mdao.primerparcial_22515

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun JuegoPreview() {
    var resultadoJ1 by remember { mutableStateOf("0") }
    var resultadoJ2 by remember { mutableStateOf("0") }
    var ganador by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.background(Color.White)
            .wrapContentSize()
    ) {
        // PRIMERA PARTE DEL JUEGO
        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(Color.White)
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.wrapContentSize(),
                horizontalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Column(
                    modifier = Modifier
                        .width(70.dp)
                        .height(203.dp)
                        .background(Color.Green)
                ) {}
                Column(
                    verticalArrangement = Arrangement.spacedBy(2.dp),
                ) {
                    Row(
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .background(Color.Green)
                    ) {}
                    Row(
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .background(Color.Green)
                    ) {}
                }
                Column(
                    modifier = Modifier
                        .width(70.dp)
                        .height(203.dp)
                        .background(Color.Green)
                ) {}
            }

            Divider(
                color = Color.Gray,
                thickness = 5.dp,
                modifier = Modifier.fillMaxWidth()
            )

            Row(
                modifier = Modifier.wrapContentSize(),
                horizontalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Column(
                    modifier = Modifier
                        .width(70.dp)
                        .height(203.dp)
                        .background(Color.Green)
                ) {}
                Column(
                    verticalArrangement = Arrangement.spacedBy(2.dp),
                ) {
                    Row(
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .background(Color.Green)
                    ) {}
                    Row(
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .background(Color.Green)
                    ) {}
                }
                Column(
                    modifier = Modifier
                        .width(70.dp)
                        .height(203.dp)
                        .background(Color.Green)
                ) {}
            }
        }
        // SEGUNDA PARTE DEL JUEGO
        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(Color.White)
                .padding(10.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.player_one),
                        contentDescription = "logo",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(100.dp),
                        contentScale = ContentScale.Fit
                    )
                    Text(
                        text = "Jannik",
                        fontSize = 25.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 110.dp)
                    )
                }
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(horizontal = 5.dp)
                ) {
                    Text(text = "VS",fontSize = 20.sp, fontWeight = FontWeight.Bold,)
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.player_two),
                        contentDescription = "logo",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(100.dp),
                        contentScale = ContentScale.Fit
                    )
                    Text(
                        text = "Minion",
                        fontSize = 25.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 110.dp)
                    )
                }
            } // Nombres e imagen de los jugadores

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                ,
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)
                    ) {
                        IconButton(
                            onClick = {
                                if (resultadoJ1.toInt() == 0) {
                                    resultadoJ1 = "0"
                                } else if (resultadoJ1.toInt() >= 15 && resultadoJ1.toInt() < 30) {
                                    resultadoJ1 = (resultadoJ1.toInt() - 15).toString()
                                } else if (resultadoJ1.toInt() >= 30 && resultadoJ1.toInt() < 40) {
                                    resultadoJ1 = (resultadoJ1.toInt() - 15).toString()
                                } else if (resultadoJ1.toInt() >= 40) {
                                    resultadoJ1 = (resultadoJ2.toInt() - 10).toString()
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.restar),
                                contentDescription = "resta",
                                modifier = Modifier.size(50.dp),
                                contentScale = ContentScale.Fit,
                            )
                        }

                        Text(
                            text = resultadoJ1,
                            fontSize = 25.sp,
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .weight(1f)
                        )

                        IconButton(
                            onClick = {
                                if (resultadoJ1.toInt() == 0) {
                                    resultadoJ1 = (resultadoJ1.toInt() + 15).toString()
                                } else if (resultadoJ1.toInt() >= 15 && resultadoJ1.toInt() < 30) {
                                    resultadoJ1 = (resultadoJ1.toInt() + 15).toString()
                                } else if (resultadoJ1.toInt() >= 30 && resultadoJ1.toInt() < 40) {
                                    resultadoJ1 = (resultadoJ1.toInt() + 10).toString()
                                } else if (resultadoJ1.toInt() >= 40) {
                                    resultadoJ1 = "SET"
                                    ganador = "Jannik defiende su titulo"
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.sumar),
                                contentDescription = "sumar",
                                modifier = Modifier.size(50.dp),
                                contentScale = ContentScale.Fit,
                            )
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)
                    ) {
                        IconButton(
                            onClick = {
                                if (resultadoJ2.toInt() == 0) {
                                    resultadoJ2 = "0"
                                } else if (resultadoJ2.toInt() >= 15 && resultadoJ2.toInt() < 30) {
                                    resultadoJ2 = (resultadoJ2.toInt() - 15).toString()
                                } else if (resultadoJ2.toInt() >= 30 && resultadoJ2.toInt() < 40) {
                                    resultadoJ2 = (resultadoJ2.toInt() - 15).toString()
                                } else if (resultadoJ2.toInt() >= 40) {
                                    resultadoJ2 = (resultadoJ2.toInt() - 10).toString()
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.restar),
                                contentDescription = "resta",
                                modifier = Modifier.size(50.dp),
                                contentScale = ContentScale.Fit,
                            )
                        }

                        Text(
                            text = resultadoJ2,
                            fontSize = 25.sp,
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .weight(1f)
                        )

                        IconButton(
                            onClick = {
                                if (resultadoJ2.toInt() == 0) {
                                    resultadoJ2 = (resultadoJ1.toInt() + 15).toString()
                                } else if (resultadoJ2.toInt() >= 15 && resultadoJ2.toInt() < 30) {
                                    resultadoJ2 = (resultadoJ2.toInt() + 15).toString()
                                } else if (resultadoJ2.toInt() >= 30 && resultadoJ2.toInt() < 40) {
                                    resultadoJ2 = (resultadoJ2.toInt() + 10).toString()
                                } else if (resultadoJ2.toInt() >= 40) {
                                    resultadoJ2 = "SET"
                                    ganador = "Bob es el nuevo Campeon"
                                }
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.sumar),
                                contentDescription = "sumar",
                                modifier = Modifier.size(50.dp),
                                contentScale = ContentScale.Fit,
                            )
                        }
                    }
                }
            } // MARCADOR
        }

        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(Color.White)
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = ganador, fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
            }
        }
    }
}


