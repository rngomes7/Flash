package theflash.flash;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import android.util.Log;


/**
 * Created by rickygomes on 4/28/15.
 */
public class myImport extends Activity implements View.OnClickListener {
    Button newImport;
    Button back_button;
    TextView name;
    private String newDeck;
    private String title;
    File file;
    FileOutputStream outputStream;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.myimport);

        newImport = (Button) findViewById(R.id.deck_import);
        back_button = (Button) findViewById(R.id.back_button);

        name = (TextView) findViewById(R.id.deck_name);

        newImport.setOnClickListener(this);
        back_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.deck_import: {
                BufferedReader input = null;
                File file = null;
                try {
                    file = new File(getCacheDir(), "MyCache");

                    input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    String line;
                    StringBuffer buffer = new StringBuffer();
                    while ((line = input.readLine()) != null) {
                        buffer.append(line);
                    }

                    //Log.d(TAG, buffer.toString()); // i have no fucking clue what tag is or how this code works
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            case R.id.back_button: {
                finish();
                break;
            }

        }
    }
}
