package thigk2.LeChiHai.thigiuaki_65130771;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ChucNang1Fragment extends Fragment {

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
        return viewCau1;
    }
}