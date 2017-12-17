package com.example.pavan.multilanguagesupport;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView textviw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textviw=(TextView)findViewById(R.id.textviw);
    }

    public void hindi(View v)
    {
        setLocal("hi_IN");
    }
    public void Spanish(View v)
    {
        setLocal("es_ES");
    }
    public void French(View v)
    {
        setLocal("fr_BE");
    }
    public void English(View v)
    {
        setLocal("en_U");
    }

    private void setLocal(String strLocal)
    {
        Locale locale = new Locale(strLocal);//("en_US");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getResources().updateConfiguration(config, null);
        textviw.setText(getResources().getString(R.string.hello_world));
    }
}
