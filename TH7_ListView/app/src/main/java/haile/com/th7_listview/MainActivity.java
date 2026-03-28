package haile.com.th7_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

    //Hiển thự dữ liệu  lên ListView
    //B1 Cần có dữ liệu
    //Ở bài này hard-code dữ liệu trực tiếp
    //Cần biến phù hợp để chứa dữ liệu
        ArrayList<String> dsTenTinhThanhVN;
        dsTenTinhThanhVN = new ArrayList<String>(); //Tạo thể hiện cụ thể, xin mới
        //Them du lieu o day (Dung ra phai doc du lieu tu nguon
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đà Nẵng");
        dsTenTinhThanhVN.add("Khánh Hòa");
        dsTenTinhThanhVN.add("Kiên Giang");
        dsTenTinhThanhVN.add("Cần Thơ");
        dsTenTinhThanhVN.add("Bình Dương");
    //Buoc 2 Tạo Adapter
        ArrayAdapter<String> adapterTinhThanhVN;
        adapterTinhThanhVN = new ArrayAdapter<String>(this,
                                                                android.R.layout.simple_list_item_1,
                                                                    dsTenTinhThanhVN);
        // Bước 3: Gắn vào điều khiển hiển thị ListView
        //B3.1 Tìm
        ListView lvTinhThanhVN = findViewById(R.id.lvDanhSachTT);
        //B3.2 Gắn
        lvTinhThanhVN.setAdapter(adapterTinhThanhVN);
        //B3.3 lắng nghe và xử lý sự kiện user tương tác


    }
}