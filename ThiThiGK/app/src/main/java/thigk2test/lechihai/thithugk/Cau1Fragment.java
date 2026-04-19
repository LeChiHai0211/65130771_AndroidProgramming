package thigk2test.lechihai.thithugk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {
    EditText editText_SoKm;
    EditText editText_Som;
    Button btnChuyen;


    public Cau1Fragment() {
        // Required empty public constructor
    }

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
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
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        //Tìm điều khiển trong viewCau1
        editText_Som = viewCau1.findViewById(R.id.edtSom);
        editText_SoKm = viewCau1.findViewById(R.id.edtSokm);
        btnChuyen = viewCau1.findViewById(R.id.btnDoi);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strMet = editText_Som.getText().toString();
                String strkm = editText_SoKm.getText().toString();
                // Nếu nhập mét thì đổi sang km
                if (!strMet.isEmpty() && strkm.isEmpty()) {
                    double m = Double.parseDouble(strMet);
                    double km = m / 1000;
                    editText_SoKm.setText(String.valueOf(km));
                }

                // Nếu nhập km thì đổi sang mét
                else if (!strkm.isEmpty() && strMet.isEmpty()) {
                    double km = Double.parseDouble(strkm);
                    double m = km * 1000;
                    editText_Som.setText(String.valueOf(m));
                }

                // Nếu nhập cả 2 ô
                else if (!strMet.isEmpty() && !strkm.isEmpty()) {
                    Toast.makeText(getActivity(),
                            "Chỉ nhập 1 ô để chuyển đổi!",
                            Toast.LENGTH_SHORT).show();
                }

                // Nếu chưa nhập gì
                else {
                    Toast.makeText(getActivity(),
                            "Vui lòng nhập dữ liệu!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        return viewCau1;
    }
}