package com.example.mike.picturemania;

import android.app.WallpaperManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    ImageView imageView,imageView2,imageView3,imageView4,imageView5,
            imageView6,imageView7,imageView8,imageView9 ;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          imageView = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView7 = (ImageView)findViewById(R.id.imageView7);
        imageView8 = (ImageView)findViewById(R.id.imageView8);
        imageView9 = (ImageView)findViewById(R.id.imageView9);
        button =(Button)findViewById(R.id.button);
        button.setEnabled(false);



        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (isSelected(imageView)) {

                    Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();

                } else if (isSelected(imageView2)) {

                    Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();

                } else if (isSelected(imageView3)) {
                    Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();

                }
                else if (isSelected(imageView4)) {
                    Toast.makeText(getApplicationContext(),"4",Toast.LENGTH_SHORT).show();

                }
                else if (isSelected(imageView5)) {
                    Toast.makeText(getApplicationContext(),"5",Toast.LENGTH_SHORT).show();

                }
                else if (isSelected(imageView6)) {
                    Toast.makeText(getApplicationContext(),"6",Toast.LENGTH_SHORT).show();

                }
                else if (isSelected(imageView7)) {
                    Toast.makeText(getApplicationContext(),"7",Toast.LENGTH_SHORT).show();

                }
                else if (isSelected(imageView8)) {
                    Toast.makeText(getApplicationContext(),"8",Toast.LENGTH_SHORT).show();

                }
                else if (isSelected(imageView9)) {
                    Toast.makeText(getApplicationContext(),"9",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    private boolean isSelected(View iv){
        Drawable background = iv.getBackground();
        if(background != null)

        return true;
        else
            return false;

    }


    @Override
    public void onClick(View v) {
        if (isSelected(v))
        {
            v.setBackground(null);
            button.setEnabled(false);

            return;
        }else {

            button.setEnabled(true);
        }

        Drawable highlight = getResources().getDrawable(R.drawable.highlight);

        switch (v.getId()){
            case R.id.imageView :
                imageView.setBackground(highlight);
                imageView2.setBackground(null);
                imageView3.setBackground(null);
                imageView4.setBackground(null);
                imageView5.setBackground(null);
                imageView6.setBackground(null);
                imageView7.setBackground(null);
                imageView8.setBackground(null);
                imageView9.setBackground(null);

                break;

            case R.id.imageView2 :
                imageView2.setBackground(highlight);
                imageView.setBackground(null);
                imageView3.setBackground(null);
                imageView4.setBackground(null);
                imageView5.setBackground(null);
                imageView6.setBackground(null);
                imageView7.setBackground(null);
                imageView8.setBackground(null);
                imageView9.setBackground(null);

                break;

            case R.id.imageView3 :
                imageView3.setBackground(highlight);
                imageView.setBackground(null);
                imageView2.setBackground(null);
                imageView4.setBackground(null);
                imageView5.setBackground(null);
                imageView6.setBackground(null);
                imageView7.setBackground(null);
                imageView8.setBackground(null);
                imageView9.setBackground(null);
                break;


            case R.id.imageView4 :
                imageView4.setBackground(highlight);
                imageView.setBackground(null);
                imageView3.setBackground(null);
                imageView2.setBackground(null);
                imageView5.setBackground(null);
                imageView6.setBackground(null);
                imageView7.setBackground(null);
                imageView8.setBackground(null);
                imageView9.setBackground(null);
                break;

            case R.id.imageView5 :
                imageView5.setBackground(highlight);
                imageView.setBackground(null);
                imageView3.setBackground(null);
                imageView4.setBackground(null);
                imageView2.setBackground(null);
                imageView6.setBackground(null);
                imageView7.setBackground(null);
                imageView8.setBackground(null);
                imageView9.setBackground(null);
                break;

            case R.id.imageView6 :
                imageView6.setBackground(highlight);
                imageView.setBackground(null);
                imageView3.setBackground(null);
                imageView4.setBackground(null);
                imageView5.setBackground(null);
                imageView2.setBackground(null);
                imageView7.setBackground(null);
                imageView8.setBackground(null);
                imageView9.setBackground(null);
                break;

            case R.id.imageView7 :
                imageView7.setBackground(highlight);
                imageView.setBackground(null);
                imageView3.setBackground(null);
                imageView4.setBackground(null);
                imageView5.setBackground(null);
                imageView6.setBackground(null);
                imageView2.setBackground(null);
                imageView8.setBackground(null);
                imageView9.setBackground(null);
                break;

            case R.id.imageView8 :
                imageView8.setBackground(highlight);
                imageView.setBackground(null);
                imageView3.setBackground(null);
                imageView4.setBackground(null);
                imageView5.setBackground(null);
                imageView6.setBackground(null);
                imageView7.setBackground(null);
                imageView2.setBackground(null);
                imageView9.setBackground(null);
                break;

            case R.id.imageView9 :
                imageView9.setBackground(highlight);
                imageView.setBackground(null);
                imageView3.setBackground(null);
                imageView4.setBackground(null);
                imageView5.setBackground(null);
                imageView6.setBackground(null);
                imageView7.setBackground(null);
                imageView8.setBackground(null);
                imageView2.setBackground(null);
                break;



        }
    }
}
