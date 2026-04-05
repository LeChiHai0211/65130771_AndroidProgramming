package haile.com.th10_explicit_intents;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ManHinhThu3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_thu3);

    }
    public void FinalActivity(){
        Intent iTrangChu = new Intent(this, MainActivity.class);
        Intent iTrangThu2 = new Intent(this, ManHinhThu2.class);
        

    }

}