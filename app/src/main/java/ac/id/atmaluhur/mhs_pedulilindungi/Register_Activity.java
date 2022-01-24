package ac.id.atmaluhur.mhs_pedulilindungi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_Activity extends AppCompatActivity {

    private Button btnRegister,LinkLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        LinkLogin = findViewById(R.id.LinkLogin);
        btnRegister = findViewById(R.id.btnRegisterr);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (Register_Activity.this, login_Activity.class);
                startActivity(i);
            }
        });

        LinkLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (Register_Activity.this, login_Activity.class);
                startActivity(i);
            }
        });
    }
}