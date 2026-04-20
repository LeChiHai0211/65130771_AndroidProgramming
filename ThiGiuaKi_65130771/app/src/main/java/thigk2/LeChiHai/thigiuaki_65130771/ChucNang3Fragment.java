package thigk2.LeChiHai.thigiuaki_65130771;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ChucNang3Fragment extends Fragment {
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    //Khai báo các biến đại diện cho các view tương ứng
    RecyclerView recyclerViewLandScape;

    public ChucNang3Fragment() {
        // Required empty public constructor
    }

    public static ChucNang3Fragment newInstance(String param1, String param2) {
        ChucNang3Fragment fragment = new ChucNang3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        list.add(new LandScape("daodiepson", "Đảo Điệp Sơn"));
        list.add(new LandScape("vinhvanphong", "Vịnh Vân Phong"));
        list.add(new LandScape("hontam", "Hòn Tằm"));
        list.add(new LandScape("daobinhba", "Đảo Bình Ba"));
        list.add(new LandScape("damnhaphu", "Đầm Nha Phu"));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_chuc_nang3, container, false);
        recyclerViewLandScape = viewCau3.findViewById(R.id.recycChucNang3);
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