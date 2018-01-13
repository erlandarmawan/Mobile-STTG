package uas.ppb.mobile_sttg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class ListMenu extends AppCompatActivity {
    GridLayout maingrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);


        maingrid = (GridLayout) findViewById(R.id.maingrid);

        setSingleEvent(maingrid);
    }

    private void setSingleEvent(GridLayout maingrid) {

        for (int i = 0; i < maingrid.getChildCount(); i++) {

            CardView cardView = (CardView)maingrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (finalI==0)
                    {
                        Intent intent = new Intent(ListMenu.this,profil.class);
                        startActivity(intent);
                    }
                    else if (finalI==1)
                    {
                        Intent intent = new Intent(ListMenu.this,jurusan.class);
                        startActivity(intent);
                    }
                    else if (finalI==2)
                    {
                        Intent intent = new Intent(ListMenu.this,pendaftaran.class);
                        startActivity(intent);
                    }
                    else if (finalI==3)
                    {
                        Intent intent = new Intent(ListMenu.this,fasilitas.class);
                        startActivity(intent);
                    }
                    else if (finalI==4)
                    {
                        Intent intent = new Intent(ListMenu.this,about.class);
                        startActivity(intent);
                    }
                    else if (finalI==5)
                    {
                        finish();
                    }
                }
            });
        }
    }
}

