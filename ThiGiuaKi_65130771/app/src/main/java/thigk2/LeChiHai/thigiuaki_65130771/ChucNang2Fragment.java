package thigk2.LeChiHai.thigiuaki_65130771;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChucNang2Fragment extends Fragment {

    public ChucNang2Fragment() {
        // Required empty public constructor
    }


    public static ChucNang2Fragment newInstance(String param1, String param2) {
        ChucNang2Fragment fragment = new ChucNang2Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        dsTenTinhThanhVN.add("Bình Định");
        dsTenTinhThanhVN.add("Bình Thuật");
        dsTenTinhThanhVN.add("Lê Chí Hải");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau2 = inflater.inflate(R.layout.fragment_chuc_nang2, container, false);
        ArrayAdapter<String> adapterTinhThanhVN;
        adapterTinhThanhVN = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN);
        // Bước 3: Gắn vào điều khiển hiển thị ListView
        //B3.1 Tìm
        ListView lvTinhThanhVN = findViewById(R.id.);
        //B3.2 Gắn
        lvTinhThanhVN.setAdapter(adapterTinhThanhVN);
        //B3.3 lắng nghe và xử lý sự kiện user tương tác



        return viewCau2;
    }
}