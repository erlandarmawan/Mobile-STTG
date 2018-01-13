package uas.ppb.mobile_sttg;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class about extends AppCompatActivity {
    GridLayout maingrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


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
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("http://m.facebook.com/dharmaone"));
                        startActivity(intent);
                    }
                    else if (finalI==1)
                    {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("http://m.facebook.com/rosyid5"));
                        startActivity(intent);
                    }
                    else if (finalI==2)
                    {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("http://m.facebook.com/rivan.mulyana"));
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
