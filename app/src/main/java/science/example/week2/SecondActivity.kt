package science.example.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class SecondActivity : AppCompatActivity() {

    private val TAG = "Second Activity"
    private var button_alert_dialog: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button_alert_dialog = findViewById<View>(R.id.button_alert_dialog) as Button
        button_alert_dialog?.setOnClickListener {

            val builder = AlertDialog.Builder(this)

            builder.setTitle("Важное сообщение!")
                .setMessage("Это AlertDialog!")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton("ОК, молодец") {
                        dialog, id ->  dialog.cancel()
                    Toast.makeText(this, "AlertDialog закрыт!", Toast.LENGTH_SHORT).show()
                }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()

        } ?: throw IllegalStateException("Activity cannot be null")

        Log.i(TAG, "onCreate() called")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() called")
    }

}