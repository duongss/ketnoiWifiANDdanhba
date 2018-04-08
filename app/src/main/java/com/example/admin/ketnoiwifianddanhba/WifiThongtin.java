package com.example.admin.ketnoiwifianddanhba;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WifiThongtin extends AppCompatActivity {
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textwifi);
        button=findViewById(R.id.buttonwifi);

    }

    public void hienthi(View view) {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
String rSid=wifiInfo.getBSSID();
int spped = wifiInfo.getLinkSpeed();
String ssid =wifiInfo.getSSID();
int netid= wifiInfo.getNetworkId();
textView.setText(" SSID :" + ssid +"\n SPEED :"+spped+"\n Streng:"+rSid + "\n NEtID:"+netid);
    }
}
