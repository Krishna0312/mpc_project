package example.com.cropc

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import example.com.cropc.R
import java.io.IOException
import java.io.InputStream


class InformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
        try {
            val sh = getSharedPreferences("plantinfo", MODE_PRIVATE)
            val s1 = sh.getString("result", "")
            if (s1 != null) {
                Log.e("read data", s1)
                val s2 = s1.replace("\\s".toRegex(), "")
                val ris: InputStream = assets.open(s2+".txt")
                // We guarantee that the available method returns the total
                // size of the asset...  of course, this does mean that a single
                // asset can't be more than 2 gigs.
                val size: Int = ris.available()

                // Read the entire asset into a local byte buffer.
                val buffer = ByteArray(size)
                ris.read(buffer)
                ris.close()

                // Convert the buffer into a string.
                val text = String(buffer)

                // Finally stick the string into the text view.
                // Replace with whatever you need to have the text into.
                val tv: TextView = findViewById(R.id.plantinfo)
                tv.text = text
            }




        } catch (e: IOException) {
            // Should never happen!
            throw RuntimeException(e)
        }
    }
}