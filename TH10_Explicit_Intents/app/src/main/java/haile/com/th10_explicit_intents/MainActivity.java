package haile.com.th10_explicit_intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
    public void ChuyenManHinh(View v){
        //Tạo 1 đối tượng Intent
        //Tham số thức hai của hàm tạo này lè tên Activity (màn hình ) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this ,ManHinhThu2.class);

        startActivity(iManHinhKhac);
    }
}