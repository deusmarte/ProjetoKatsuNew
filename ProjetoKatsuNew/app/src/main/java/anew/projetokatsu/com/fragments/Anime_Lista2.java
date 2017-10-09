package anew.projetokatsu.com.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import anew.projetokatsu.com.adapters.AdapterAnime;
import anew.projetokatsu.com.domain.Anime;
import anew.projetokatsu.com.projetokatsunew.R;

/**
 * Created by joaop on 04/10/2017.
 */

public class Anime_Lista2 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // ListView listAnime = (ListView) v.findviewbyid (R.id.nomedalista);

        List<Anime> animes= new ArrayList<>();




       final View v= inflater.inflate(R.layout.anime_lista,container,false);

        ListView listAnime = (ListView) v.findViewById(R.id.listAnime);

        AdapterAnime adAnime= new AdapterAnime(v.getContext(),animes);




//conteúdo do app
        for(int i=0;i<1;i++) {
            Anime a = new Anime();
            a.setNome("Boku no hero academia!");
            a.setDescricao("Foi anunciada a terceira temporada!");
            a.setImagem(R.drawable.boku);
            animes.add(a);
        }

        for(int i=0;i<3;i++) {
            Anime a = new Anime();
            a.setNome("Katsu2!");
            a.setDescricao("Seja bem vindo ao novo portal de notícias do mundo das animações japonesas2");
            a.setImagem(R.drawable.katsu2);
            animes.add(a);

        }


        listAnime.setAdapter (adAnime);
        listAnime.setAdapter (adAnime);

        listAnime.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent in=new Intent(v.getContext(),ConteudoAnime.class);

//                Intent intent = new Intent(view.getContext(),Anime_Conteudo.class); view.getContext().startActivity(intent);
                startActivity(in);
            }

        });

        return v;

    }




}
