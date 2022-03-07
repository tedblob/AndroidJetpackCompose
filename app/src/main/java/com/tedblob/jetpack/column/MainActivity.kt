package com.tedblob.jetpack.column

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.tedblob.jetpack.column.ui.theme.JetpackColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackColumnTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    //PasswordTextField()
                    //AutoFocusingText()
                    //MutableStateOfExample()
                    //PasswordBasicTextField()
                    LoadImageFromUrl()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting(name: String? = "") {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)) {

        Text(modifier = Modifier.weight(2f, true), text = "Lorem ipsum text for left")
        Divider(
            color = Color.Red,
            modifier = Modifier
                .fillMaxHeight()
                .width(5.dp),
            startIndent = 2.dp

        )
        Text(modifier = Modifier.weight(2f, true), text = "It is so refreshing today")
    }
}

@Preview
@Composable
fun MultipleColorInText() {
    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
                withStyle(style = SpanStyle(color = Color.LightGray)) {
                    append("Hello")
                }
                append(" World")
            }
            append(" Paragraph")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun ColumnGreeting(name: String? = "") {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .width(IntrinsicSize.Min)) {

        Text(text = "Lorem ipsum text for left")
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .fillMaxWidth(),
            thickness = 1.dp,
            startIndent = 10.dp

        )
        Text(text = "It is so refreshing today")
    }
}

@Preview(showBackground = true)
@Composable
fun RowGreeting(name: String? = "") {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {

        Text("Lorem ipsum")

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Top) {
            Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ArrangeSpaceEvenly(name: String? = "") {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceEvenly) {

        Text("Lorem ipsum1")
        Text("Lorem ipsum2")

        Text("Lorem ipsum3")

    }
}

@Preview(showBackground = true)
@Composable
fun ArrangeSpaceAround(name: String? = "") {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceAround) {

        Text("Lorem ipsum1")
        Text("Lorem ipsum2")

        Text("Lorem ipsum3")

    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldComposable() {

    var text by remember { mutableStateOf("Hello World") }

    TextField(
        value = text,
        onValueChange = { text = it },
        singleLine = true,
        label = { Text("Label") }
    )

}

@Preview(showBackground = true)
@Composable
fun BasicTextFieldSingleLineComposable() {

    var text by remember { mutableStateOf("Hello World") }

    BasicTextField(
        value = text,
        onValueChange = { text = it },
        singleLine = true
    )

}

@Preview(showBackground = true)
@Composable
fun OutlinedTextFieldSingleLineComposable() {

    var text by remember { mutableStateOf("Hello World") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        singleLine = true,
        label = { Text("Label") }
    )

}


@Composable
fun LoadImageFromUrl() {
    /*Box(modifier = Modifier.background(Color.DarkGray).fillMaxSize()) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://tedblob.com/wp-content/uploads/2021/08/cropped-TebBlob_Logo_64.png")
                .crossfade(true)
                .build(),
            contentDescription = stringResource(R.string.image_content_desc),
            contentScale = ContentScale.Crop,
            modifier = Modifier,
            onError = {
                Log.e("MainActivity", "Image loading : " + it.result)
            }
        )
    }*/
    /*AsyncImage(
        model = "https://tedblob.com/wp-content/uploads/2021/09/android.png",
        contentDescription = stringResource(R.string.image_content_desc)
    )*/
        /*AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://wallpaperaccess.com/full/137507.jpg")
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = stringResource(R.string.image_content_desc),
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(64.dp).clip(CircleShape)
        )*/
    Image(
        painter = painterResource(R.drawable.baby_pic),
        contentDescription = stringResource(R.string.image_content_desc),
        contentScale = ContentScale.Crop,            // crop the image
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
            .border(2.dp, Color.DarkGray, CircleShape)// clip to the circle shape
    )
}


@Preview(showBackground = true)
@Composable
fun OutlinedTextFieldComposable() {

    var text by remember { mutableStateOf("12345") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },

        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))


}

@Preview(showBackground = true)
@Composable
fun BasicTextFieldComposable() {

    var text by remember { mutableStateOf("12345") }

    BasicTextField(value = text,
        onValueChange = { text = it },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

}

@Preview(showBackground = true)
@Composable
fun TextFieldNumberType() {

    var text by remember { mutableStateOf("3467") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

}


@Composable
fun PasswordBasicTextField() {
    var password by rememberSaveable { mutableStateOf("") }

    BasicTextField(
        value = password,
        onValueChange = { password = it },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
    )
}

@Composable
fun StyledBasicTextField() {
    var value by remember { mutableStateOf("Hello World") }

    BasicTextField(
        value = value,
        onValueChange = { value = it },
        maxLines = 2,
        textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(20.dp)
    )
}

@Composable
fun AutoFocusingText() {
    val str = "basic"
    var textFieldValue by remember { mutableStateOf(TextFieldValue(str, selection = TextRange(str.length))) }
    val focusRequester = remember { FocusRequester() }
    TextField(
        value = textFieldValue,
        onValueChange = { textFieldValue = it },
        modifier = Modifier.focusRequester(focusRequester)
    )

    //LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    //}
}
@Composable
fun MutableStateOfExample() {
    var value by remember { mutableStateOf("Default value")}
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "User typing: ",
            modifier = Modifier.padding(bottom = 10.dp),
            style = MaterialTheme.typography.h5
        )
        OutlinedTextField(
            value = value,
            onValueChange = { value = it },
            label = { Text("Name") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OutlinedTextFieldNumberType() {

    var text by remember { mutableStateOf("Hello World") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}