package es.davidpob99.ContadorPocha;

import android.app.FragmentManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TresFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TresFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TresFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    //Declaración de componentes:

    Button  Abtn1, Abtn2, Abtn3, Abtn4, Abtn5, Abtn6, Abtn7, Abtn8,
            Abtn9, Abtn10, Abtn11, Abtn12, Abtn101, Abtn102, Abtn103, Abtn104, Abtn105, Abtn106, Abtn107, Abtn108,
            Abtn109, Abtn1010, Abtn1011, Abtn1012, Abtn201, Abtn202, Abtn203, Abtn204, Abtn205, Abtn206, Abtn207, Abtn208,
            Abtn209, Abtn2010, Abtn2011, Abtn2012;
    TextView tx, tx1, tx2;
    EditText et, et1, et2;
    Button Areset;
    int j1=0, j2=0, j3=0;
    String jug1, jug2, jug3;

    public TresFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TresFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TresFragment newInstance(String param1, String param2) {
        TresFragment fragment = new TresFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tres, container, false);
        tx = (TextView) rootView.findViewById(R.id.AtextView1);
        tx1 = (TextView) rootView.findViewById(R.id.AtextView101);
        tx2 = (TextView) rootView.findViewById(R.id.AtextView201);

        et = (EditText) rootView.findViewById(R.id.AeditText);
        et1 = (EditText) rootView.findViewById(R.id.AeditText101);
        et2 = (EditText) rootView.findViewById(R.id.AeditText201);

        Abtn1 = (Button) rootView.findViewById(R.id.Abutton1);
        Abtn1.setOnClickListener(this);
        Abtn2 = (Button) rootView.findViewById(R.id.Abutton2);
        Abtn2.setOnClickListener(this);
        Abtn3 = (Button) rootView.findViewById(R.id.Abutton3);
        Abtn3.setOnClickListener(this);
        Abtn4 = (Button) rootView.findViewById(R.id.Abutton4);
        Abtn4.setOnClickListener(this);
        Abtn5 = (Button) rootView.findViewById(R.id.Abutton5);
        Abtn5.setOnClickListener(this);
        Abtn6 = (Button) rootView.findViewById(R.id.Abutton6);
        Abtn6.setOnClickListener(this);
        Abtn7 = (Button) rootView.findViewById(R.id.Abutton7);
        Abtn7.setOnClickListener(this);
        Abtn8 = (Button) rootView.findViewById(R.id.Abutton8);
        Abtn8.setOnClickListener(this);
        Abtn9 = (Button) rootView.findViewById(R.id.Abutton9);
        Abtn9.setOnClickListener(this);
        Abtn10 = (Button) rootView.findViewById(R.id.Abutton10);
        Abtn10.setOnClickListener(this);
        Abtn11 = (Button) rootView.findViewById(R.id.Abutton11);
        Abtn11.setOnClickListener(this);
        Abtn12 = (Button) rootView.findViewById(R.id.Abutton12);
        Abtn12.setOnClickListener(this);


        Abtn101 = (Button) rootView.findViewById(R.id.Abutton101);
        Abtn101.setOnClickListener(this);
        Abtn102 = (Button) rootView.findViewById(R.id.Abutton102);
        Abtn102.setOnClickListener(this);
        Abtn103 = (Button) rootView.findViewById(R.id.Abutton103);
        Abtn103.setOnClickListener(this);
        Abtn104 = (Button) rootView.findViewById(R.id.Abutton104);
        Abtn104.setOnClickListener(this);
        Abtn105 = (Button) rootView.findViewById(R.id.Abutton105);
        Abtn105.setOnClickListener(this);
        Abtn106 = (Button) rootView.findViewById(R.id.Abutton106);
        Abtn106.setOnClickListener(this);
        Abtn107 = (Button) rootView.findViewById(R.id.Abutton107);
        Abtn107.setOnClickListener(this);
        Abtn108 = (Button) rootView.findViewById(R.id.Abutton108);
        Abtn108.setOnClickListener(this);
        Abtn109 = (Button) rootView.findViewById(R.id.Abutton109);
        Abtn109.setOnClickListener(this);
        Abtn1010 = (Button) rootView.findViewById(R.id.Abutton1010);
        Abtn1010.setOnClickListener(this);
        Abtn1011 = (Button) rootView.findViewById(R.id.Abutton1011);
        Abtn1011.setOnClickListener(this);
        Abtn1012 = (Button) rootView.findViewById(R.id.Abutton1012);
        Abtn1012.setOnClickListener(this);

        Abtn201 = (Button) rootView.findViewById(R.id.Abutton201);
        Abtn201.setOnClickListener(this);
        Abtn202 = (Button) rootView.findViewById(R.id.Abutton202);
        Abtn202.setOnClickListener(this);
        Abtn203 = (Button) rootView.findViewById(R.id.Abutton203);
        Abtn203.setOnClickListener(this);
        Abtn204 = (Button) rootView.findViewById(R.id.Abutton204);
        Abtn204.setOnClickListener(this);
        Abtn205 = (Button) rootView.findViewById(R.id.Abutton205);
        Abtn205.setOnClickListener(this);
        Abtn206 = (Button) rootView.findViewById(R.id.Abutton206);
        Abtn206.setOnClickListener(this);
        Abtn207 = (Button) rootView.findViewById(R.id.Abutton207);
        Abtn207.setOnClickListener(this);
        Abtn208 = (Button) rootView.findViewById(R.id.Abutton208);
        Abtn208.setOnClickListener(this);
        Abtn209 = (Button) rootView.findViewById(R.id.Abutton209);
        Abtn209.setOnClickListener(this);
        Abtn2010 = (Button) rootView.findViewById(R.id.Abutton2010);
        Abtn2010.setOnClickListener(this);
        Abtn2011 = (Button) rootView.findViewById(R.id.Abutton2011);
        Abtn2011.setOnClickListener(this);
        Abtn2012 = (Button) rootView.findViewById(R.id.Abutton2012);
        Abtn2012.setOnClickListener(this);

        Areset = (Button) rootView.findViewById(R.id.Areset);
        Areset.setOnClickListener(this);

        SharedPreferences prefsTres = this.getActivity().getSharedPreferences("prefs3", Context.MODE_PRIVATE);
        int jugador1 = prefsTres.getInt("jugador1", 0);
        int jugador2 = prefsTres.getInt("jugador2", 0);
        int jugador3 = prefsTres.getInt("jugador3", 0);

        String nombre1 = prefsTres.getString("nombre1", "");
        String nombre2 = prefsTres.getString("nombre2", "");
        String nombre3 = prefsTres.getString("nombre3", "");

        if(jugador1!=0|jugador2!=0|jugador3!=0){
            j1=jugador1;
            j2=jugador2;
            j3=jugador3;

            jug1=String.valueOf(j1);
            tx.setText(jug1);
            jug2=String.valueOf(j2);
            tx1.setText(jug2);
            jug3=String.valueOf(j3);
            tx2.setText(jug3);

            et.setText(nombre1);
            et1.setText(nombre2);
            et2.setText(nombre3);

            Toast toast =
                    Toast.makeText(getActivity().getApplicationContext(),
                            "Se han restaurado los datos de la partida anterior", Toast.LENGTH_SHORT);
            toast.show();
        }else{
            j1=0;
            j2=0;
            j3=0;
        }

        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }

    }

    @Override
    public void onResume(){
        super.onResume();
        SharedPreferences prefsTres = this.getActivity().getSharedPreferences("prefs3", Context.MODE_PRIVATE);
        int jugador1 = prefsTres.getInt("jugador1", 0);
        int jugador2 = prefsTres.getInt("jugador2", 0);
        int jugador3 = prefsTres.getInt("jugador3", 0);

        String nombre1 = prefsTres.getString("nombre1", "");
        String nombre2 = prefsTres.getString("nombre2", "");
        String nombre3 = prefsTres.getString("nombre3", "");

        if(jugador1!=0|jugador2!=0|jugador3!=0){
            j1=jugador1;
            j2=jugador2;
            j3=jugador3;

            jug1=String.valueOf(j1);
            tx.setText(jug1);
            jug2=String.valueOf(j2);
            tx1.setText(jug2);
            jug3=String.valueOf(j3);
            tx2.setText(jug3);

            et.setText(nombre1);
            et1.setText(nombre2);
            et2.setText(nombre3);
        }

    }

    @Override
    public void onPause(){
        super.onPause();
        SharedPreferences prefsTres = this.getActivity().getSharedPreferences("prefs3", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefsTres.edit();
        editor.putInt("jugador1", j1);
        editor.putInt("jugador2", j2);
        editor.putInt("jugador3", j3);
        editor.putString("nombre1", et.getText().toString());
        editor.putString("nombre2", et1.getText().toString());
        editor.putString("nombre3", et2.getText().toString());
        editor.commit();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        super.onDestroyView();
        SharedPreferences prefsTres = this.getActivity().getSharedPreferences("prefs3", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefsTres.edit();
        editor.putInt("jugador1", j1);
        editor.putInt("jugador2", j2);
        editor.putInt("jugador3", j3);
        editor.putString("nombre1", et.getText().toString());
        editor.putString("nombre2", et1.getText().toString());
        editor.putString("nombre3", et2.getText().toString());
        editor.commit();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Abutton1:
                j1 = j1 + 3;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton2:
                j1 = j1 + 4;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton3:
                j1 = j1 + 5;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton4:
                j1 = j1 + 6;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton5:
                j1 = j1 + 7;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton6:
                j1 = j1 + 8;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton7:
                j1 = j1 - 3;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton8:
                j1 = j1 - 4;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton9:
                j1 = j1 - 5;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton10:
                j1 = j1 - 6;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton11:
                j1 = j1 - 7;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton12:
                j1 = j1 - 8;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Abutton101:
                j2 = j2 + 3;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton102:
                j2 = j2 + 4;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton103:
                j2 = j2 + 5;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton104:
                j2 = j2 + 6;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton105:
                j2 = j2 + 7;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton106:
                j2 = j2 + 8;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton107:
                j2 = j2 - 3;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton108:
                j2 = j2 - 4;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton109:
                j2 = j2 - 5;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton1010:
                j2 = j2 - 6;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton1011:
                j2 = j2 - 7;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton1012:
                j2 = j2 - 8;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Abutton201:
                j3 = j3 + 3;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton202:
                j3 = j3 + 4;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton203:
                j3 = j3 + 5;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton204:
                j3 = j3 + 6;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton205:
                j3 = j3 + 7;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton206:
                j3 = j3 + 8;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton207:
                j3 = j3 - 3;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton208:
                j3 = j3 - 4;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton209:
                j3 = j3 - 5;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton2010:
                j3 = j3 - 6;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton2011:
                j3 = j3 - 7;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Abutton2012:
                j3 = j3 - 8;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Areset:
                j1 = 0;
                j2 = 0;
                j3 = 0;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

