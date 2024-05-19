package com.example.jetprofile

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)) {
                        // Profile pic
                        Image(painter = painterResource(id = R.drawable.img_profile),
                            contentDescription = "Profile picture",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp)))

                        Spacer(modifier = Modifier.height(20.dp))

                        // Name
                        Text(
                            text = "ABC DEFG",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        // Occupation
                        Text(
                            text = "Employess",
                            color = Color.Gray,
                            fontSize = 16.sp,
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        Column(horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxWidth(),) {
                            // Employer
                            Text(
                                text = "BINGGGG",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold,
                           )
                            Spacer(modifier = Modifier.height(10.dp))
                            // Department
                            Text(text = "GTPGTP",
                                color = Color.Gray,
                                fontSize = 16.sp)

                        }
                    }
                }
            }
        }
    }
}
