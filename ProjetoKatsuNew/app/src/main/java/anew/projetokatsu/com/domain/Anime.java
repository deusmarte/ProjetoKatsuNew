package anew.projetokatsu.com.domain;

/**
 * Created by joaop on 23/09/2017.
 */

public class Anime {
    private String nome;
    private String descricao;
    private int imagem;


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}


