package com.example.gps_android_ocean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val Sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(Sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sydney))

        val Ocean_SP = LatLng(-23.5567607,-46.7331522)
        mMap.addMarker(MarkerOptions().position(Ocean_SP).title("Marker in Ocean SP"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ocean_SP))

        val Ocean_Manaus = LatLng(-3.0926195, -60.0185367)
        mMap.addMarker(MarkerOptions().position(Ocean_Manaus).title("Marker in Ocean Manaus"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ocean_Manaus))
    }
}