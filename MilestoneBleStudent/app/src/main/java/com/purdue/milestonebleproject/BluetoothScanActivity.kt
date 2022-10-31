package com.purdue.milestonebleproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.purdue.milestonebleproject.adapter.ItemClickListener
import com.purdue.milestonebleproject.adapter.MainRecyclerViewAdapter

/**
 * BluetoothScanActivity
 * THIS IS FOR STUDENT USES. PLEASE REFER PROVIDED STEP-BY-STEP MANUAL TO COMPLETE THE CODE.
 *
 * @author Your Name (email Address)
 */

@SuppressLint("MissingPermission")
class BluetoothScanActivity : AppCompatActivity(), ItemClickListener {

    // Permission Launcher

    // Required Permissions (BLUETOOTH)

    // RecyclerView Adapter (DO NOT MODIFY THIS LINE)
    private val mRecyclerViewAdapter = MainRecyclerViewAdapter(this)

    // Main Bluetooth Adapter

    // Bluetooth Device Scanning
    // Variable for BLE scanning
    private var scanning: Boolean = false


    // Scan Callback object that BluetoothLeScanner would use.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bluetooth_scan)


        // ----------------------------------------------------------------------------------------
        // DO NOT MODIFY CODE BELOW
        val mRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = mRecyclerViewAdapter
        // ----------------------------------------------------------------------------------------
    }


    // Handler Related
    private val SCAN_PERIOD = 10000L        // Scanning Timeout Period

    // Function for Start Scanning available BLE devices nearby.
    fun scanLeDevice() {

    }





    // DO NOT MODIFY THE CODE BELOW HERE.
    // --------------------------------------------------------------------------------------------

    override fun onResume() {
        super.onResume()
        scanning = true
        scanLeDevice()
    }

    override fun onPause() {
        super.onPause()
        scanning = false
        scanLeDevice()
    }

    override fun onDestroy() {
        super.onDestroy()
        scanning = false
        scanLeDevice()
    }

    override fun onClick(v: View, position: Int) {
        onPause()
        // Get device name from Recycler view item
        val name = mRecyclerViewAdapter.bluetoothDevice[position].name ?: "Unknown Device"
        val address = mRecyclerViewAdapter.bluetoothDevice[position].address

        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("DEVICE_NAME", name)
        intent.putExtra("DEVICE_ADDRESS", address)

        startActivity(intent)
    }

    // --------------------------------------------------------------------------------------------

}