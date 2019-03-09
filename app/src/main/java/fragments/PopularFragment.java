package fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kbz.hms.readerapp.R;
import com.kbz.hms.readerapp.adapters.FeatureAdapter;
import com.kbz.hms.readerapp.adapters.PopularAdapter;

public class PopularFragment extends Fragment {

    public static PopularFragment newInstance() {

        return new PopularFragment();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_popular, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rv_popular);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        PopularAdapter popularAdapter = new PopularAdapter();
        recyclerView.setAdapter(popularAdapter);

        return view;
    }
}
