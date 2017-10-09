package anew.projetokatsu.com.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import anew.projetokatsu.com.domain.Anime;
import anew.projetokatsu.com.projetokatsunew.R;

/**
 * Created by joaop on 29/09/2017.
 */

public class AdapterAnime extends BaseAdapter {
    List<Anime> animes;


    Context a;


    public AdapterAnime(Context a, List<Anime> animes){
        this.a=a;
        this.animes=animes;

    }




    @Override
    public int getCount() {
        return animes.size();
    }

    @Override
    public Object getItem(int i) {



        return animes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        //LayoutInflater inflater=(LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
        View v= View.inflate(a, R.layout.anime,null);

        //View view =    .inflate(R.layout.anime, parent, false);

        if(v != null){
            //criando os componentes

            TextView nome = (TextView) v.findViewById(R.id.iinfo_text);
            TextView descricao=(TextView) v.findViewById(R.id.ddescription);
            ImageView imagem=(ImageView) v.findViewById(R.id.bbanner);
            Anime a =(Anime) animes.get(i);

           // ligar a classe anime com os componentes sitados anteriormente
            nome.setText(a.getNome());
            descricao.setText(a.getDescricao());
            imagem.setImageResource(a.getImagem());

        }

        return v;
    }
}
