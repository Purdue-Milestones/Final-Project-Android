package com.purdue.milestonebleproject

import android.content.*
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

/**
 * MainActivity
 * THIS IS FOR STUDENT USES. PLEASE REFER PROVIDED STEP-BY-STEP MANUAL TO COMPLETE THE CODE.
 *
 * @author Your Name (email Address)
 */

class MainActivity : AppCompatActivity() {

    // Permission Checker


    // List of required permissions


    // Device Info
    private var deviceName: String? = null
    private var deviceAddress: String? = null

    // Service Connection Status


    // Binding Service


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (!packageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {
            Toast.makeText(this, "BLE is not available on your device", Toast.LENGTH_LONG).show()
            finish()
        }

        // Ask user to get necessary permission


        // Check selected device information


        // ----------------------------------------------------------------------------------------
        // DO NOT MODIFY THIS CODE
        findViewById<Button>(R.id.searchDeviceBtn).setOnClickListener {
            startActivity(Intent(this, BluetoothScanActivity::class.java))
        }
        // ----------------------------------------------------------------------------------------
    }

    // Broadcast Receiver


    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()

    }


    // Gatt Service Intent Filter


}