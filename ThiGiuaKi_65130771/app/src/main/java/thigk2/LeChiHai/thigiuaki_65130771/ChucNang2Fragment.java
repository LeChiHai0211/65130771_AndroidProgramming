package thigk2.LeChiHai.thigiuaki_65130771;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ChucNang2Fragment extends Fragment {

    ArrayList<String> dsTenTinhThanhVN;

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
        dsTenTinhThanhVN = new ArrayList<String>();
        //Thêm dữ liệu
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đà Nẵng");
        dsTenTinhThanhVN.add("Khánh Hòa");
        dsTenTinhThanhVN.add("Kiên Giang");
        dsTenTinhThanhVN.add("Cần Thơ");
        dsTenTinhThanhVN.add("Bình Dương");
        dsTenTinhThanhVN.add("Bình Định");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Lê Chí Hải");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau2 = inflater.inflate(R.layout.fragment_chuc_nang2, container, false);

        // Tạo Adapter
        ArrayAdapter<String> adapterTinhThanhVN = new ArrayAdapter<String>(
                getContext(),
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN
        );

        // Ánh xạ ListView từ layout
        ListView lvTinhThanhVN = viewCau2.findViewById(R.id.lvDanhSachTT);

        // Gắn adapter vào ListView
        lvTinhThanhVN.setAdapter(adapterTinhThanhVN);

        // Lắng nghe và xử lý sự kiện khi nhấn vào item
        lvTinhThanhVN.setOnItemClickListener((parent, view, position, id) -> {
            String tenTinh = dsTenTinhThanhVN.get(position);
            Toast.makeText(getContext(), "Bạn chọn: " + tenTinh, Toast.LENGTH_SHORT).show();
        });

        return viewCau2;
    }
}