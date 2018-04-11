package com.kuncham.karimullagroup;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ContactUs extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng ll = new LatLng(16.541813, 80.607618);
        mMap.addMarker(new MarkerOptions().position(new LatLng(16.541813, 80.607618)).title("Karimulla Sha Enterprises"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ll));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ll,16));
        MarkerOptions mo=new MarkerOptions();
        mo.position(ll);
        mo.title("Karimulla Sha Enterprises");
        mo.snippet("ROAD RAMRAJ NAGAR, Kabela, RR Nagar, Vijayawada, Andhra Pradesh 520012");
        mMap.addMarker(mo);
    }
}
