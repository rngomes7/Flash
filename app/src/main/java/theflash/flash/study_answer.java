package theflash.flash;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rickygomes on 4/28/15.
 */
public class study_answer extends Activity implements View.OnClickListener
{
    private TextView answer;
    private Button back_button;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_ans);

        answer = (TextView) findViewById(R.id.answer_input);
        back_button = (Button) findViewById(R.id.back_button);
        back_button.setOnClickListener(this);

        initializeTextViews();
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

    private void initializeTextViews()
    {
        String myanswer = getIntent().getExtras().getString(study.answer2);
        answer.setText(myanswer);
    }

}
