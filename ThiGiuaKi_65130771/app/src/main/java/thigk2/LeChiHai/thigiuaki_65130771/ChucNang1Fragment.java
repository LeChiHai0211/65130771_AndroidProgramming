package thigk2.LeChiHai.thigiuaki_65130771;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChucNang1Fragment extends Fragment {
    EditText edtChieuDai, edtChieuRong, edtKetQua;
    Button btnTinh;

    public ChucNang1Fragment() {
        // Required empty public constructor
    }

    public static ChucNang1Fragment newInstance(String param1, String param2) {
        ChucNang1Fragment fragment = new ChucNang1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau1 = inflater.inflate(R.layout.fragment_chuc_nang1, container, false);

        // Ánh xạ các view
        edtChieuDai = viewCau1.findViewById(R.id.edtChieuDai);
        edtChieuRong = viewCau1.findViewById(R.id.edtChieuRong);
        edtKetQua = viewCau1.findViewById(R.id.edtKetQua);
        btnTinh = viewCau1.findViewById(R.id.btnTinh);

        // Xóa text mặc định nếu cần (vì trong layout đang để android:text="Name")
        edtChieuDai.setText("");
        edtChieuRong.setText("");
        edtKetQua.setText("");

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strDai = edtChieuDai.getText().toString();
                String strRong = edtChieuRong.getText().toString();

                if (strDai.isEmpty() || strRong.isEmpty()) {
                    Toast.makeText(getContext(), "Vui lòng nhập đầy đủ chiều dài và chiều rộng", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double chieuDai = Double.parseDouble(strDai);
                    double chieuRong = Double.parseDouble(strRong);

                    double chuVi = (chieuDai + chieuRong) * 2;

                    edtKetQua.setText(String.valueOf(chuVi));
                } catch (NumberFormatException e) {
                    Toast.makeText(getContext(), "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return viewCau1;
    }
}