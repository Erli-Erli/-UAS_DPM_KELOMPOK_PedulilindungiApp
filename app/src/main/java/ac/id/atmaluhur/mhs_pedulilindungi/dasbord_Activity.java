package ac.id.atmaluhur.mhs_pedulilindungi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dasbord_Activity extends AppCompatActivity {

    private Button cekLink,notiff,settingg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasbord2);

        settingg = findViewById(R.id.setting);
        notiff = findViewById(R.id.notif);
        cekLink = findViewById(R.id.cekTest);
        cekLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dasbord_Activity.this,RiwayatActivity.class);
                startActivity(i);
            }
        });
        notiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dasbord_Activity.this,NotifActivity.class);
                startActivity(i);
            }
        });
        settingg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dasbord_Activity.this,ProfileActivity.class);
                startActivity(i);
            }
        });

         }
}

