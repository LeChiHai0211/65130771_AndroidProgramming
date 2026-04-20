package thigk2.LeChiHai.thigiuaki_65130771;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ChucNang3Fragment extends Fragment {

    private String mParam1;
    private String mParam2;

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

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_chuc_nang3, container, false);
        return viewCau3;
    }
}