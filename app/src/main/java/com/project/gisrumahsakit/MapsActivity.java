package com.project.GISRumahSakit;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in palu and move the camera
        LatLng palu = new LatLng(-0.913488, 119.861552);
        //Custom Marker
        int tinggi = 120;
        int lebar = 80;
        BitmapDrawable bitmapStart = (BitmapDrawable)getResources().getDrawable(R.drawable.carvector);
        Bitmap s = bitmapStart.getBitmap();
        Bitmap markerStart = Bitmap.createScaledBitmap(s, lebar, tinggi, false);

        mMap.addMarker(new MarkerOptions().position(palu).title("Marker Tempat Tinggal").icon(BitmapDescriptorFactory.fromBitmap(markerStart)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palu, 13.5f));

        LatLng rswoodward = new LatLng(-0.904638, 119.871593);
        mMap.addMarker(new MarkerOptions().position(rswoodward).title("Rumah Sakit Woodward"));


        LatLng rsbudiagung = new LatLng(-0.907123, 119.873928);
        mMap.addMarker(new MarkerOptions().position(rsbudiagung).title("Rumah Sakit Budi Agung"));


        LatLng rswirabuana = new LatLng(-0.895920, 119.887575);
        mMap.addMarker(new MarkerOptions().position(rswirabuana).title("Rumah Sakit Wirabuana"));

        LatLng rsusisaljufri = new LatLng(-0.903657, 119.857618);
        mMap.addMarker(new MarkerOptions().position(rsusisaljufri).title("Rumah Sakit Umum Sis Aljufri"));


        LatLng rssamaritan = new LatLng(-0.925947, 119.880795);
        mMap.addMarker(new MarkerOptions().position(rssamaritan).title("Rumah Sakit Samaritan"));


        LatLng rsbhayangkara = new LatLng(-0.889195, 119.867864);
        mMap.addMarker(new MarkerOptions().position(rsbhayangkara).title("Rumah Sakit Bhayangkara Palu"));


        LatLng rsundata = new LatLng(-0.857944, 119.884020);
        mMap.addMarker(new MarkerOptions().position(rsundata).title("Rumah Sakit UNDATA"));


        LatLng rsanutapura = new LatLng(0.900054, 119.849314);
        mMap.addMarker(new MarkerOptions().position(rsanutapura).title("Rumah Sakit Anutapura"));


        mMap.addPolyline(new PolylineOptions().add(
                palu,
                new LatLng(-0.913388, 119.861663),
                new LatLng(-0.913396, 119.863055),
                new LatLng(-0.912190, 119.863187),
                new LatLng(-0.911565, 119.863228),
                new LatLng(-0.908883, 119.863315),
                new LatLng(-0.908387, 119.863350),
                new LatLng(-0.908039, 119.863305),
                new LatLng(-0.905540, 119.863471),
                new LatLng(-0.905471, 119.862693),
                new LatLng(-0.904667, 119.860030),
                new LatLng(-0.904384, 119.858878),
                new LatLng(-0.904381, 119.858879),
                new LatLng(-0.904022, 119.857663),
                new LatLng(-0.903656, 119.857796),
                rsusisaljufri
                ).width(10)
                .color(Color.GREEN)
        );
    }
}