package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.text.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startSimpleTextExample(view: View) {
        startActivity(Intent(this, TextActivity::class.java))
    }
    fun startCustomTextExample(view: View) {
        startActivity(Intent(this, CustomTextActivity::class.java))
    }

    fun startZoomableExample(view: View) {
        startActivity(Intent(this, ZoomableActivity::class.java))
    }
    fun startVerticalScrollableExample(view: View) {
        startActivity(Intent(this, VerticalScrollableActivity::class.java))
    }

    fun startHorizontalScrollableExample(view: View) {
        startActivity(Intent(this, HorizontalScrollableActivity::class.java))
    }
    fun starLoadImageExample(view: View) {
        startActivity(Intent(this, ImageActivity::class.java))
    }

    fun startAlertDialogExample(view: View) {
        startActivity(Intent(this, AlertDialogActivity::class.java))
    }
    fun startButtonsExample(view: View) {
        startActivity(Intent(this, ButtonActivity::class.java))
    }

    fun startStateExample(view: View) {
        startActivity(Intent(this, StateActivity::class.java))
    }

    fun startStackExample(view: View) {
        startActivity(Intent(this, StackActivity::class.java))
    }



    fun startMaterialDesignExample(view: View) {
        startActivity(Intent(this, MaterialActivity::class.java))
    }
    fun startCoroutineFlowExample(view: View) {
        startActivity(Intent(this, CoroutineFlowActivity::class.java))
    }
    fun startLiveDataExample(view: View) {
        startActivity(Intent(this, LiveDataActivity::class.java))
    }
    fun startConstraintLayoutExample(view: View) {
        startActivity(Intent(this, ConstraintLayoutActivity::class.java))
    }


}

/*
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyState()
        }
    }
}
@Composable
fun showCard() {
    Cardview("name")
}

@Composable
fun showButton() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(20.dp)
    ) {
        Button(onClick = {
           // Toast.makeText(this, "You clicked the Button.", Toast.LENGTH_LONG).show()
        }) {
            Text("Submit Request")
        }
    }
}

//Normal Textview Widget with Font
@Composable
fun TextFont() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            "Hello World",
            fontSize = 20.sp,
            fontWeight = FontWeight.Thin
        )
        Text(
            "Hello World",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraLight
        )
        Text(
            "Hello World",
            fontSize = 20.sp,
            fontWeight = FontWeight.Light
        )
        Text(
            "Hello World",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal
        )
        Text(
            "Hello World",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            "Hello World",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            "Hello World",
            fontSize = 20.sp,
            fontWeight = FontWeight.W900
        )
        Text(
            "Hello World",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            "Hello World",
            fontSize = 20.sp,
            fontWeight = FontWeight.Black
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultTextFieldPreview() {
    MyApplicationTheme {
        TextField("Android")
    }
}


//Normal TextField Widget
@Composable
fun TextField(name: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        var text by remember { mutableStateOf(name) }
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Label") }
        )
    }
}


@Composable
fun Cardview(name:String){
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        CardContent(name)
    }
}
@Composable
private fun CardContent(name: String) {
    var expanded by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .padding(12.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(12.dp)
        ) {
            Text(text = "Hello, ")
            Text(
                text = name,
                style = MaterialTheme.typography.h4.copy(
                    fontWeight = FontWeight.ExtraBold
                )
            )
            if (expanded) {
                Text(
                    text = ("Composem ipsum color sit lazy, " +
                            "padding theme elit, sed do bouncy. ").repeat(4),
                )
            }
        }
        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                contentDescription = if (expanded) {
                    stringResource(R.string.show_less)
                } else {
                    stringResource(R.string.show_more)
                }

            )
        }
    }
}

private val Icons.Filled.ExpandMore: ImageVector
    get() {
        if (_expandMore != null) {
            return _expandMore!!
        }
        _expandMore = materialIcon(name = "Filled.ExpandMore") {
            materialPath {
                moveTo(16.59f, 8.59f)
                lineTo(12.0f, 13.17f)
                lineTo(7.41f, 8.59f)
                lineTo(6.0f, 10.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(6.0f, -6.0f)
                close()
            }
        }
        return _expandMore!!
    }

private var _expandMore: ImageVector? = null

private val Icons.Filled.ExpandLess: ImageVector
    get() {
        if (_expandLess != null) {
            return _expandLess!!
        }
        _expandLess = materialIcon(name = "Filled.ExpandLess") {
            materialPath {
                moveTo(12.0f, 8.0f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.0f, 10.83f)
                lineToRelative(4.59f, 4.58f)
                lineTo(18.0f, 14.0f)
                close()
            }
        }
        return _expandLess!!
    }

private var _expandLess: ImageVector? = null


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        TextFont()
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreviewRecyclerview(){
    MyState()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewButton(){
    MyApplicationTheme {
        showButton()
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultCard() {
    MyApplicationTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth().fillMaxHeight(), content = {
                Card(elevation = 4.dp, modifier = Modifier.padding(all = 10.dp)) {
                    Column(modifier = Modifier.padding(all = 10.dp)) {
                        Text("AB CDE", fontWeight = FontWeight.W700)
                        Text("+0 12345678")
                        Text("XYZ city.", color = Color.Gray)
                    }
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultRow() {
    MyApplicationTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth(), content = {
                Row {
                    Text("AB CDE", fontWeight = FontWeight.W700, modifier = Modifier.padding(10.dp))
                    Text("+0 12345678", modifier = Modifier.padding(10.dp))
                    Text("XYZ city.", color = Color.Gray, modifier = Modifier.padding(10.dp))
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultColumn() {
    MyApplicationTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth(), content = {
                Column() {
                    Text("AB CDE", fontSize = 25.sp)
                    Text("+0 12345678")
                    Text("Lives in XYZ city.", color = Color.Gray)
                }
            }
        )
    }
}

//State in Compose
@Composable
private fun MyState() {
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }
    if (shouldShowOnboarding) {
         RecyclerView(onContinueClicked = { shouldShowOnboarding = false })
    } else {
        Greetings()
    }
}


@Composable
private fun Greetings(names: List<String> = List(20) { "$it" } ) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = names) { name ->
            Cardview(name = name)
        }
    }
}

@Composable
private fun RecyclerView(onContinueClicked: () -> Unit) {
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("RecyclerView")
            Button(
                modifier = Modifier.padding(vertical = 24.dp),
                onClick = onContinueClicked
            ) {
                Text("Continue")
            }
        }
    }
}
*/
