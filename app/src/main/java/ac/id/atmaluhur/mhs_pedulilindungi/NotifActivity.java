package ac.id.atmaluhur.mhs_pedulilindungi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotifActivity extends AppCompatActivity {

    private Button backNotf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif);

        backNotf = findViewById(R.id.btnBackHis);
        backNotf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NotifActivity.this,dasbord_Activity.class);
                startActivity(i);
            }
        });

    }
}