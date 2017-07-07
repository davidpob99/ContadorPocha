package es.davidpob99.ContadorPocha;

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
 * {@link SeisFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SeisFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SeisFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button Dbtn1, Dbtn2, Dbtn3, Dbtn4, Dbtn5, Dbtn6, Dbtn7, Dbtn8,
            Dbtn9, Dbtn10, Dbtn11, Dbtn12, Dbtn101, Dbtn102, Dbtn103, Dbtn104, Dbtn105, Dbtn106, Dbtn107, Dbtn108,
            Dbtn109, Dbtn1010, Dbtn1011, Dbtn1012, Dbtn201, Dbtn202, Dbtn203, Dbtn204, Dbtn205, Dbtn206, Dbtn207, Dbtn208,
            Dbtn209, Dbtn2010, Dbtn2011, Dbtn2012, Dbtn301, Dbtn302, Dbtn303, Dbtn304, Dbtn305, Dbtn306, Dbtn307, Dbtn308,
            Dbtn309, Dbtn3010, Dbtn3011, Dbtn3012, Dbtn401, Dbtn402, Dbtn403, Dbtn404, Dbtn405, Dbtn406, Dbtn407, Dbtn408,
            Dbtn409, Dbtn4010, Dbtn4011, Dbtn4012, Dbtn501, Dbtn502, Dbtn503, Dbtn504, Dbtn505, Dbtn506, Dbtn507, Dbtn508,
            Dbtn509, Dbtn5010, Dbtn5011, Dbtn5012;
    TextView tx, tx1, tx2, tx3, tx4, tx5;
    EditText et, et1, et2, et3, et4, et5;
    Button Dreset;
    int j1=0, j2=0, j3=0, j4=0, j5=0, j6=0;
    String jug1, jug2, jug3, jug4, jug5, jug6;

    private OnFragmentInteractionListener mListener;

    public SeisFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SeisFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SeisFragment newInstance(String param1, String param2) {
        SeisFragment fragment = new SeisFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_seis, container, false);

        tx = (TextView) rootView.findViewById(R.id.DtextView1);
        tx1 = (TextView) rootView.findViewById(R.id.DtextView101);
        tx2 = (TextView) rootView.findViewById(R.id.DtextView201);
        tx3 = (TextView) rootView.findViewById(R.id.DtextView301);
        tx4 = (TextView) rootView.findViewById(R.id.DtextView401);
        tx5 = (TextView) rootView.findViewById(R.id.DtextView501);

        et = (EditText) rootView.findViewById(R.id.DeditText);
        et1 = (EditText) rootView.findViewById(R.id.DeditText101);
        et2 = (EditText) rootView.findViewById(R.id.DeditText201);
        et3 = (EditText) rootView.findViewById(R.id.DeditText301);
        et4 = (EditText) rootView.findViewById(R.id.DeditText401);
        et5 = (EditText) rootView.findViewById(R.id.DeditText501);

        Dbtn1 = (Button) rootView.findViewById(R.id.Dbutton1);
        Dbtn1.setOnClickListener(this);
        Dbtn2 = (Button) rootView.findViewById(R.id.Dbutton2);
        Dbtn2.setOnClickListener(this);
        Dbtn3 = (Button) rootView.findViewById(R.id.Dbutton3);
        Dbtn3.setOnClickListener(this);
        Dbtn4 = (Button) rootView.findViewById(R.id.Dbutton4);
        Dbtn4.setOnClickListener(this);
        Dbtn5 = (Button) rootView.findViewById(R.id.Dbutton5);
        Dbtn5.setOnClickListener(this);
        Dbtn6 = (Button) rootView.findViewById(R.id.Dbutton6);
        Dbtn6.setOnClickListener(this);
        Dbtn7 = (Button) rootView.findViewById(R.id.Dbutton7);
        Dbtn7.setOnClickListener(this);
        Dbtn8 = (Button) rootView.findViewById(R.id.Dbutton8);
        Dbtn8.setOnClickListener(this);
        Dbtn9 = (Button) rootView.findViewById(R.id.Dbutton9);
        Dbtn9.setOnClickListener(this);
        Dbtn10 = (Button) rootView.findViewById(R.id.Dbutton10);
        Dbtn10.setOnClickListener(this);
        Dbtn11 = (Button) rootView.findViewById(R.id.Dbutton11);
        Dbtn11.setOnClickListener(this);
        Dbtn12 = (Button) rootView.findViewById(R.id.Dbutton12);
        Dbtn12.setOnClickListener(this);


        Dbtn101 = (Button) rootView.findViewById(R.id.Dbutton101);
        Dbtn101.setOnClickListener(this);
        Dbtn102 = (Button) rootView.findViewById(R.id.Dbutton102);
        Dbtn102.setOnClickListener(this);
        Dbtn103 = (Button) rootView.findViewById(R.id.Dbutton103);
        Dbtn103.setOnClickListener(this);
        Dbtn104 = (Button) rootView.findViewById(R.id.Dbutton104);
        Dbtn104.setOnClickListener(this);
        Dbtn105 = (Button) rootView.findViewById(R.id.Dbutton105);
        Dbtn105.setOnClickListener(this);
        Dbtn106 = (Button) rootView.findViewById(R.id.Dbutton106);
        Dbtn106.setOnClickListener(this);
        Dbtn107 = (Button) rootView.findViewById(R.id.Dbutton107);
        Dbtn107.setOnClickListener(this);
        Dbtn108 = (Button) rootView.findViewById(R.id.Dbutton108);
        Dbtn108.setOnClickListener(this);
        Dbtn109 = (Button) rootView.findViewById(R.id.Dbutton109);
        Dbtn109.setOnClickListener(this);
        Dbtn1010 = (Button) rootView.findViewById(R.id.Dbutton1010);
        Dbtn1010.setOnClickListener(this);
        Dbtn1011 = (Button) rootView.findViewById(R.id.Dbutton1011);
        Dbtn1011.setOnClickListener(this);
        Dbtn1012 = (Button) rootView.findViewById(R.id.Dbutton1012);
        Dbtn1012.setOnClickListener(this);

        Dbtn201 = (Button) rootView.findViewById(R.id.Dbutton201);
        Dbtn201.setOnClickListener(this);
        Dbtn202 = (Button) rootView.findViewById(R.id.Dbutton202);
        Dbtn202.setOnClickListener(this);
        Dbtn203 = (Button) rootView.findViewById(R.id.Dbutton203);
        Dbtn203.setOnClickListener(this);
        Dbtn204 = (Button) rootView.findViewById(R.id.Dbutton204);
        Dbtn204.setOnClickListener(this);
        Dbtn205 = (Button) rootView.findViewById(R.id.Dbutton205);
        Dbtn205.setOnClickListener(this);
        Dbtn206 = (Button) rootView.findViewById(R.id.Dbutton206);
        Dbtn206.setOnClickListener(this);
        Dbtn207 = (Button) rootView.findViewById(R.id.Dbutton207);
        Dbtn207.setOnClickListener(this);
        Dbtn208 = (Button) rootView.findViewById(R.id.Dbutton208);
        Dbtn208.setOnClickListener(this);
        Dbtn209 = (Button) rootView.findViewById(R.id.Dbutton209);
        Dbtn209.setOnClickListener(this);
        Dbtn2010 = (Button) rootView.findViewById(R.id.Dbutton2010);
        Dbtn2010.setOnClickListener(this);
        Dbtn2011 = (Button) rootView.findViewById(R.id.Dbutton2011);
        Dbtn2011.setOnClickListener(this);
        Dbtn2012 = (Button) rootView.findViewById(R.id.Dbutton2012);
        Dbtn2012.setOnClickListener(this);

        Dbtn301 = (Button) rootView.findViewById(R.id.Dbutton301);
        Dbtn301.setOnClickListener(this);
        Dbtn302 = (Button) rootView.findViewById(R.id.Dbutton302);
        Dbtn302.setOnClickListener(this);
        Dbtn303 = (Button) rootView.findViewById(R.id.Dbutton303);
        Dbtn303.setOnClickListener(this);
        Dbtn304 = (Button) rootView.findViewById(R.id.Dbutton304);
        Dbtn304.setOnClickListener(this);
        Dbtn305 = (Button) rootView.findViewById(R.id.Dbutton305);
        Dbtn305.setOnClickListener(this);
        Dbtn306 = (Button) rootView.findViewById(R.id.Dbutton306);
        Dbtn306.setOnClickListener(this);
        Dbtn307 = (Button) rootView.findViewById(R.id.Dbutton307);
        Dbtn307.setOnClickListener(this);
        Dbtn308 = (Button) rootView.findViewById(R.id.Dbutton308);
        Dbtn308.setOnClickListener(this);
        Dbtn309 = (Button) rootView.findViewById(R.id.Dbutton309);
        Dbtn309.setOnClickListener(this);
        Dbtn3010 = (Button) rootView.findViewById(R.id.Dbutton3010);
        Dbtn3010.setOnClickListener(this);
        Dbtn3011 = (Button) rootView.findViewById(R.id.Dbutton3011);
        Dbtn3011.setOnClickListener(this);
        Dbtn3012 = (Button) rootView.findViewById(R.id.Dbutton3012);
        Dbtn3012.setOnClickListener(this);

        Dbtn401 = (Button) rootView.findViewById(R.id.Dbutton401);
        Dbtn401.setOnClickListener(this);
        Dbtn402 = (Button) rootView.findViewById(R.id.Dbutton402);
        Dbtn402.setOnClickListener(this);
        Dbtn403 = (Button) rootView.findViewById(R.id.Dbutton403);
        Dbtn403.setOnClickListener(this);
        Dbtn404 = (Button) rootView.findViewById(R.id.Dbutton404);
        Dbtn404.setOnClickListener(this);
        Dbtn405 = (Button) rootView.findViewById(R.id.Dbutton405);
        Dbtn405.setOnClickListener(this);
        Dbtn406 = (Button) rootView.findViewById(R.id.Dbutton406);
        Dbtn406.setOnClickListener(this);
        Dbtn407 = (Button) rootView.findViewById(R.id.Dbutton407);
        Dbtn407.setOnClickListener(this);
        Dbtn408 = (Button) rootView.findViewById(R.id.Dbutton408);
        Dbtn408.setOnClickListener(this);
        Dbtn409 = (Button) rootView.findViewById(R.id.Dbutton409);
        Dbtn409.setOnClickListener(this);
        Dbtn4010 = (Button) rootView.findViewById(R.id.Dbutton4010);
        Dbtn4010.setOnClickListener(this);
        Dbtn4011 = (Button) rootView.findViewById(R.id.Dbutton4011);
        Dbtn4011.setOnClickListener(this);
        Dbtn4012 = (Button) rootView.findViewById(R.id.Dbutton4012);
        Dbtn4012.setOnClickListener(this);

        Dbtn501 = (Button) rootView.findViewById(R.id.Dbutton501);
        Dbtn501.setOnClickListener(this);
        Dbtn502 = (Button) rootView.findViewById(R.id.Dbutton502);
        Dbtn502.setOnClickListener(this);
        Dbtn503 = (Button) rootView.findViewById(R.id.Dbutton503);
        Dbtn503.setOnClickListener(this);
        Dbtn504 = (Button) rootView.findViewById(R.id.Dbutton504);
        Dbtn504.setOnClickListener(this);
        Dbtn505 = (Button) rootView.findViewById(R.id.Dbutton505);
        Dbtn505.setOnClickListener(this);
        Dbtn506 = (Button) rootView.findViewById(R.id.Dbutton506);
        Dbtn506.setOnClickListener(this);
        Dbtn507 = (Button) rootView.findViewById(R.id.Dbutton507);
        Dbtn507.setOnClickListener(this);
        Dbtn508 = (Button) rootView.findViewById(R.id.Dbutton508);
        Dbtn508.setOnClickListener(this);
        Dbtn509 = (Button) rootView.findViewById(R.id.Dbutton509);
        Dbtn509.setOnClickListener(this);
        Dbtn5010 = (Button) rootView.findViewById(R.id.Dbutton5010);
        Dbtn5010.setOnClickListener(this);
        Dbtn5011 = (Button) rootView.findViewById(R.id.Dbutton5011);
        Dbtn5011.setOnClickListener(this);
        Dbtn5012 = (Button) rootView.findViewById(R.id.Dbutton5012);
        Dbtn5012.setOnClickListener(this);

        Dreset = (Button) rootView.findViewById(R.id.Dreset);
        Dreset.setOnClickListener(this);

        SharedPreferences prefsSeis = this.getActivity().getSharedPreferences("prefs6", Context.MODE_PRIVATE);
        int jugador1 = prefsSeis.getInt("jugador1", 0);
        int jugador2 = prefsSeis.getInt("jugador2", 0);
        int jugador3 = prefsSeis.getInt("jugador3", 0);
        int jugador4 = prefsSeis.getInt("jugador4", 0);
        int jugador5 = prefsSeis.getInt("jugador5", 0);
        int jugador6 = prefsSeis.getInt("jugador6", 0);

        String nombre1 = prefsSeis.getString("nombre1", "");
        String nombre2 = prefsSeis.getString("nombre2", "");
        String nombre3 = prefsSeis.getString("nombre3", "");
        String nombre4 = prefsSeis.getString("nombre4", "");
        String nombre5 = prefsSeis.getString("nombre5", "");
        String nombre6 = prefsSeis.getString("nombre6", "");

        if(jugador1!=0|jugador2!=0|jugador3!=0|jugador4!=0){
            j1=jugador1;
            j2=jugador2;
            j3=jugador3;
            j4=jugador4;
            j5=jugador5;
            j6=jugador6;

            jug1=String.valueOf(j1);
            tx.setText(jug1);
            jug2=String.valueOf(j2);
            tx1.setText(jug2);
            jug3=String.valueOf(j3);
            tx2.setText(jug3);
            jug4=String.valueOf(j4);
            tx3.setText(jug4);
            jug5=String.valueOf(j5);
            tx4.setText(jug5);
            jug6=String.valueOf(j6);
            tx5.setText(jug6);


            et.setText(nombre1);
            et1.setText(nombre2);
            et2.setText(nombre3);
            et3.setText(nombre4);
            et4.setText(nombre5);
            et5.setText(nombre6);

            Toast toast =
                    Toast.makeText(getActivity().getApplicationContext(),
                            "Se han restaurado los datos de la partida anterior", Toast.LENGTH_SHORT);
            toast.show();
        }else{
            j1=0;
            j2=0;
            j3=0;
            j4=0;
            j5=0;
            j6=0;
        }
        
        return rootView;
    }

    @Override
    public void onResume(){
        super.onResume();
        SharedPreferences prefsSeis = this.getActivity().getSharedPreferences("prefs6", Context.MODE_PRIVATE);
        int jugador1 = prefsSeis.getInt("jugador1", 0);
        int jugador2 = prefsSeis.getInt("jugador2", 0);
        int jugador3 = prefsSeis.getInt("jugador3", 0);
        int jugador4 = prefsSeis.getInt("jugador4", 0);
        int jugador5 = prefsSeis.getInt("jugador5", 0);
        int jugador6 = prefsSeis.getInt("jugador6", 0);

        String nombre1 = prefsSeis.getString("nombre1", "");
        String nombre2 = prefsSeis.getString("nombre2", "");
        String nombre3 = prefsSeis.getString("nombre3", "");
        String nombre4 = prefsSeis.getString("nombre4", "");
        String nombre5 = prefsSeis.getString("nombre5", "");
        String nombre6 = prefsSeis.getString("nombre6", "");

        if(jugador1!=0|jugador2!=0|jugador3!=0|jugador4!=0){
            j1=jugador1;
            j2=jugador2;
            j3=jugador3;
            j4=jugador4;
            j5=jugador5;
            j6=jugador6;

            jug1=String.valueOf(j1);
            tx.setText(jug1);
            jug2=String.valueOf(j2);
            tx1.setText(jug2);
            jug3=String.valueOf(j3);
            tx2.setText(jug3);
            jug4=String.valueOf(j4);
            tx3.setText(jug4);
            jug5=String.valueOf(j5);
            tx4.setText(jug5);
            jug6=String.valueOf(j6);
            tx5.setText(jug6);


            et.setText(nombre1);
            et1.setText(nombre2);
            et2.setText(nombre3);
            et3.setText(nombre4);
            et4.setText(nombre5);
            et5.setText(nombre6);
        }
    }

    @Override
    public void onPause(){
        super.onPause();
        SharedPreferences prefsSeis = this.getActivity().getSharedPreferences("prefs6", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefsSeis.edit();
        editor.putInt("jugador1", j1);
        editor.putInt("jugador2", j2);
        editor.putInt("jugador3", j3);
        editor.putInt("jugador4", j4);
        editor.putInt("jugador5", j5);
        editor.putInt("jugador6", j6);
        editor.putString("nombre1", et.getText().toString());
        editor.putString("nombre2", et1.getText().toString());
        editor.putString("nombre3", et2.getText().toString());
        editor.putString("nombre4", et3.getText().toString());
        editor.putString("nombre5", et4.getText().toString());
        editor.putString("nombre6", et5.getText().toString());
        editor.commit();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        super.onDestroyView();
        SharedPreferences prefsSeis = this.getActivity().getSharedPreferences("prefs6", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefsSeis.edit();
        editor.putInt("jugador1", j1);
        editor.putInt("jugador2", j2);
        editor.putInt("jugador3", j3);
        editor.putInt("jugador4", j4);
        editor.putInt("jugador5", j5);
        editor.putInt("jugador6", j6);
        editor.putString("nombre1", et.getText().toString());
        editor.putString("nombre2", et1.getText().toString());
        editor.putString("nombre3", et2.getText().toString());
        editor.putString("nombre4", et3.getText().toString());
        editor.putString("nombre5", et4.getText().toString());
        editor.putString("nombre6", et5.getText().toString());
        editor.commit();
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
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Dbutton1:
                j1 = j1 + 3;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton2:
                j1 = j1 + 4;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton3:
                j1 = j1 + 5;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton4:
                j1 = j1 + 6;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton5:
                j1 = j1 + 7;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton6:
                j1 = j1 + 8;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton7:
                j1 = j1 - 3;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton8:
                j1 = j1 - 4;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton9:
                j1 = j1 - 5;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton10:
                j1 = j1 - 6;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton11:
                j1 = j1 - 7;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton12:
                j1 = j1 - 8;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Dbutton101:
                j2 = j2 + 3;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton102:
                j2 = j2 + 4;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton103:
                j2 = j2 + 5;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton104:
                j2 = j2 + 6;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton105:
                j2 = j2 + 7;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton106:
                j2 = j2 + 8;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton107:
                j2 = j2 - 3;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton108:
                j2 = j2 - 4;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton109:
                j2 = j2 - 5;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton1010:
                j2 = j2 - 6;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton1011:
                j2 = j2 - 7;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton1012:
                j2 = j2 - 8;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Dbutton201:
                j3 = j3 + 3;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton202:
                j3 = j3 + 4;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton203:
                j3 = j3 + 5;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton204:
                j3 = j3 + 6;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton205:
                j3 = j3 + 7;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton206:
                j3 = j3 + 8;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton207:
                j3 = j3 - 3;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton208:
                j3 = j3 - 4;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton209:
                j3 = j3 - 5;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton2010:
                j3 = j3 - 6;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton2011:
                j3 = j3 - 7;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Dbutton2012:
                j3 = j3 - 8;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;

            case R.id.Dbutton301:
                j4 = j4 + 3;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton302:
                j4 = j4 + 4;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton303:
                j4 = j4 + 5;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton304:
                j4 = j4 + 6;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton305:
                j4 = j4 + 7;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton306:
                j4 = j4 + 8;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton307:
                j4 = j4 - 3;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton308:
                j4 = j4 - 4;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton309:
                j4 = j4 - 5;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton3010:
                j4 = j4 - 6;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton3011:
                j4 = j4 - 7;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton3012:
                j4 = j4 - 8;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Dbutton401:
                j5 = j5 + 3;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton402:
                j5 = j5 + 4;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton403:
                j5 = j5 + 5;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton404:
                j5 = j5 + 6;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton405:
                j5 = j5 + 7;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton406:
                j5 = j5 + 8;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton407:
                j5 = j5 - 3;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton408:
                j5 = j5 - 4;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton409:
                j5 = j5 - 5;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton4010:
                j5 = j5 - 6;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton4011:
                j5 = j5 - 7;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Dbutton4012:
                j5 = j5 - 8;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
             case R.id.Dbutton501:
                j6 = j6 + 3;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton502:
                j6 = j6 + 4;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton503:
                j6 = j6 + 5;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton504:
                j6 = j6 + 6;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton505:
                j6 = j6 + 7;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton506:
                j6 = j6 + 8;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton507:
                j6 = j6 - 3;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton508:
                j6 = j6 - 4;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton509:
                j6 = j6 - 5;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton5010:
                j6 = j6 - 6;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton5011:
                j6 = j6 - 7;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dbutton5012:
                j6 = j6 - 8;
                jug6=String.valueOf(j6);
                tx5.setText(jug6);
                break;
            case R.id.Dreset:
                j1 = 0;
                j2 = 0;
                j3 = 0;
                j4 = 0;
                j5 = 0;
                j6 = 0;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                jug6=String.valueOf(j6);
                tx5.setText(jug6);

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
