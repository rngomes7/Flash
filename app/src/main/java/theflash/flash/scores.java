package theflash.flash;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by rickygomes on 4/27/15.
 */
public class scores extends Activity implements View.OnClickListener
{
    Button back_button;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scores);
        back_button = (Button) findViewById(R.id.back_button);
        back_button.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.back_button:
            {
                finish();
                break;
            }
        }
    }


}

