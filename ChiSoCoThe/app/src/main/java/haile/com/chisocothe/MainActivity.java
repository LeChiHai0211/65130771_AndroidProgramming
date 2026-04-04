package haile.com.chisocothe;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void TinhChiSo(View view){
        EditText edtCN = (EditText) findViewById(R.id.idCanNang);
        EditText edtCC = (EditText) findViewById(R.id.idChieuCao);
        EditText edtKQ = (EditText) findViewById(R.id.idKetQua);

        String strCN = edtCN.getText().toString();
        String strCC = edtCC.getText().toString();

        float fCN = Float.parseFloat(strCN);
        float fCC = Float.parseFloat(strCC);

        //Tinh toan
        Float BMI = (float) (fCN / Math.pow(fCC, 2));


        String strBMI = String.valueOf(BMI);
        if(BMI < 18.5){
            edtKQ.setText("Gầy");
        } else if (BMI >= 18.5 && BMI <= 22.9) {
            edtKQ.setText("Hoàn hảo");
        }else if (BMI >= 23 && BMI <25){
            edtKQ.setText("Thừa cân");
        }else {
            edtKQ.setText("Béo phì rồi đớt ít thôi!");
        }
    }

}