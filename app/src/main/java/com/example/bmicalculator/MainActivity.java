package com.example.bmicalculator;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.LinearLayout;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        TextView result;
        EditText edtweight,edtheightft,edtheightIn;
        Button btn;
        LinearLayout llMain;

        edtweight = findViewById(R.id.edtweight);
        edtheightft = findViewById(R.id.edtheightft);
        edtheightIn = findViewById(R.id.edtheightIn);
        btn = findViewById(R.id.btn);
        result = findViewById(R.id.result);
        llMain =findViewById(R.id.llMain);


        EditText finalEdtweight = edtweight;
        EditText finalEdtweight1 = edtweight;
        EditText finalEdtweight2 = edtweight;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt =  Integer.parseInt(edtweight.getText().toString());
                int ft = Integer.parseInt(edtheightft.getText().toString());
                int In = Integer.parseInt(edtheightIn.getText().toString());

                int totalIn = ft*12 + In;
                double totalcm = totalIn*2.53;
                double totalM = totalcm/100;
                double bmi = wt/(totalM*totalM);
                if(bmi>25){
                    result.setText("you are overweight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.ow));
                }
                else if(bmi<18){
                    result.setText("you are underweight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.uw));
                }
                else{
                    result.setText("you are healthy");
                    llMain.setBackgroundColor(getResources().getColor(R.color.hw));
                }
            }
        });





    }
}