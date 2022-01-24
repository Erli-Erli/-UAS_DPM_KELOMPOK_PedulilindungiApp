package ac.id.atmaluhur.mhs_pedulilindungi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_Activity extends AppCompatActivity {
    private Button Btnlogin,LinkDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);


        LinkDaftar = findViewById(R.id.btnRegister);
        Btnlogin = findViewById(R.id.btnlogin);
        Btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login_Activity.this, dasbord_Activity.class );
                startActivity(i);
            }
        });
        LinkDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login_Activity.this,Register_Activity.class);
                startActivity(i);
            }
        });
    }
}