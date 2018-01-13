package uas.ppb.mobile_sttg;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jurusan extends AppCompatActivity {
    Button informatika,industri, sipil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jurusan);
        informatika = (Button)findViewById(R.id.informatika);
        industri = (Button)findViewById(R.id.industri);
        sipil = (Button)findViewById(R.id.sipil);
        informatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://informatika.sttgarut.ac.id/"));
                startActivity(intent);
            }
        });
        industri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://industri.sttgarut.ac.id/"));
                startActivity(intent);
            }
        });
        sipil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://sipil.sttgarut.ac.id/"));
                startActivity(intent);
            }
        });
    }
}
