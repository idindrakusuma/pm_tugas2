package com.indra.hello.intentsample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPhoneDialler = (Button)this.findViewById(R.id.dialler);
        btnPhoneDialler.setOnClickListener(new PhoneDiallerListener());

        Button btnOBrowser = (Button)this.findViewById(R.id.browser);
        btnOBrowser.setOnClickListener(new OpenBrowser());

        Button btnOgallery = (Button)this.findViewById(R.id.gallery);
        btnOgallery.setOnClickListener(new OpenGallery());
    }

    protected class PhoneDiallerListener implements View.OnClickListener{

        @Override
        public void onClick(View v){
            Intent iPhoneDialler = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:089522248642"));
            startActivity(iPhoneDialler);
        }
    }

    protected class OpenBrowser implements View.OnClickListener{
        @Override
        public void onClick(View v){
            String theUrl = "http://indrakusuma.web.id";
            Intent bukaBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse(theUrl));
            startActivity(bukaBrowser);
        }
    }

    protected class OpenGallery implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent oGallery = new Intent();
            oGallery.setType("images/pictures/*");
            oGallery.setAction(Intent.ACTION_GET_CONTENT);
            startActivity(oGallery);
        }
    }
}
