package thigk2test.lechihai.thithugk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {
    //Khai Báo biến toàn cục
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    //Khai báo các biến đại diện cho các view tương ứng
    RecyclerView recyclerViewLandScape;

    public Cau3Fragment() {
        // Required empty public constructor
    }

    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        list.add(new LandScape("dinhdoclap", "Đám giỗ 3 que"));
        list.add(new LandScape("hoguum", "Hồ Gươm"));
        list.add(new LandScape("kinhthanhhue", "Kinh Thành Huế"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandScape = viewCau3.findViewById(R.id.recycCau3);
        //Tạo layout manager để đặt bố cục cho Recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);

        //Tạo adapter gắn vào nguồn dữ liệu
        adapter = new LandScapeAdapter(viewCau3.getContext(), list);

        //Gắn adapter vào recycler
        recyclerViewLandScape.setAdapter(adapter);

        return viewCau3;
    }
}