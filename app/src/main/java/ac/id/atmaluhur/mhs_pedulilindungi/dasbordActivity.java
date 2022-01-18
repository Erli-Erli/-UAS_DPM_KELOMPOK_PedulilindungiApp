package ac.id.atmaluhur.mhs_pedulilindungi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dasbordActivity extends AppCompatActivity {

    private Button btnRiwayat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasbord);


        btnRiwayat = findViewById (R.id.btnarrow);
        btnRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dasbordActivity.this,RiwayatActivity.class );
                startActivity(i);

            }
        });
    }
}