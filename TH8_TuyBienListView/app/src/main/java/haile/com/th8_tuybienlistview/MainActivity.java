package haile.com.th8_tuybienlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tìm ListView
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);

        //Chuẩn bị dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<>();
        dsMonAn.add(new  MonAn ("Cơm gà", 30000, "Cơm nhảo, thịt khô, khó ăn.",R.drawable.comga));
        dsMonAn.add(new  MonAn ("Bánh xèo tháp bà", 60000, "Bánh cứng, không giòn, khó tiêu sau khi ăn.",R.drawable.banhxeo));
        dsMonAn.add(new  MonAn ("Gỏi cuốn đèn xanh đèn đỏ", 70000, "Bánh trán cứng, thịt nát.",R.drawable.goicuon));
        dsMonAn.add(new  MonAn ("Phở bò", 25000, "Ngon,rẻ.",R.drawable.phobo));

        //
        MonAnAddapter addapter = new MonAnAddapter(this,dsMonAn);
        lvDSMonAn.setAdapter(addapter);

        // Bắt sự kiện
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Lấy phần tử được chọn
                MonAn monAnChon = dsMonAn.get(i);
                // thực hiện công việc được yêu cầu với View
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT);
            }
        });
    }
}