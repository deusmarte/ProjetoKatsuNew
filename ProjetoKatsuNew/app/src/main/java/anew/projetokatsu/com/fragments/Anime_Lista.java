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
 * Created by joaop on 30/09/2017.
 */

public class Anime_Lista extends Fragment {
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // ListView listAnime = (ListView) v.findviewbyid (R.id.nomedalista);

        List<Anime> animes= new ArrayList<>();




        final View v = inflater.inflate(R.layout.anime_lista,container,false);

        final ListView listAnime = (ListView) v.findViewById(R.id.listAnime);

        AdapterAnime adAnime= new AdapterAnime(v.getContext(),animes);





//conteúdo do app
        for(int i=0;i<1;i++) {
            Anime a = new Anime();
            a.setNome("Novo game de naruto shippuden!");
            a.setDescricao("Saiu mais um trailer do novo game do nosso ninja favorito");
            a.setImagem(R.drawable.maxresdefault_7zu2);
            animes.add(a);



        }





        for(int i=0;i<2;i++) {
            Anime a = new Anime();
            a.setNome("Katsu!");
            a.setDescricao("Seja bem vindo ao novo portal de notícias do mundo das animações japonesas");
            a.setImagem(R.drawable.katsu2);
            animes.add(a);

        }



        listAnime.setAdapter (adAnime);

        listAnime.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent=new Intent(v.getContext(),ConteudoAnime.class);
//                Intent intent = new Intent(view.getContext(),Anime_Conteudo.class); view.getContext().startActivity(intent);
                        startActivity(intent);
                        break;
                    case 1:
                        intent=new Intent(v.getContext(),ConteudoAnime2.class);

//                Intent intent = new Intent(view.getContext(),Anime_Conteudo.class); view.getContext().startActivity(intent);
                        startActivity(intent);
                        break;


                }

            }


        });


        return v;

    }

    //private void AbrirTelaProduto() {


         //   Intent in=new Intent(getActivity().getBaseContext(),Anime_Conteudo.class);
          //  startActivity(in);



   // }


}




