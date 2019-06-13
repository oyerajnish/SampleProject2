package in.ac.scaledrone.sampleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "in.ac.sharda.EXTRA_TEXT";

    TextView txt2, txt4, txt6, txt8, txt10;
    EditText txt3, txt5, txt7, txt9, txt11;
    Button Submit;
    RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        /*
        txt2=(TextView)findViewById(R.id.txt2);

        txt4=(TextView)findViewById(R.id.txt2);
        txt6=(TextView)findViewById(R.id.txt2);
        txt8=(TextView)findViewById(R.id.txt2);
        txt10=(TextView)findViewById(R.id.txt2); */

        txt3=(EditText)findViewById(R.id.txt3);
        txt5=(EditText)findViewById(R.id.txt5);
        txt7=(EditText)findViewById(R.id.txt7);
        txt9=(EditText)findViewById(R.id.txt9);
        txt11=(EditText)findViewById(R.id.txt11);
        Submit=(Button)findViewById(R.id.btnSubmit);
        group=(RadioGroup)findViewById(R.id.group);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txt31 = txt3.getText().toString();
                String txt51 = txt5.getText().toString();
                String txt71 = txt7.getText().toString();
                String txt91 = txt9.getText().toString();
                String txt111 = txt11.getText().toString();

                if (TextUtils.isEmpty(txt31)){
                    txt3.setError("Enter First name");
                }
                else if(TextUtils.isEmpty(txt51)){
                    txt5.setError("Enter Last Name");
                }
                else if(TextUtils.isEmpty(txt71)){
                    txt7.setError("Enter Mobile No.");
                }
                else if(TextUtils.isEmpty(txt91)){
                    txt9.setError("Enter Email Id");
                }
                else if(TextUtils.isEmpty(txt111)){
                    txt11.setError("Enter Password");
                }
                else{
                    Intent intent3 = new Intent(ThirdActivity.this, SecondActivity.class);
                    intent3.putExtra(EXTRA_TEXT, txt31);
                    startActivity(intent3);

                }
            }
        });

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton btn=(RadioButton)findViewById(checkedId);

                Toast.makeText(ThirdActivity.this, btn.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}