package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Repositorio <Algo> {
    Map<String, Algo> dados;
    String nametype;


    public Repositorio(String nametype){
        dados = new TreeMap<String, Algo>();
        this.nametype = nametype;
    }

    public void add(String key, Algo data){
        Algo algo = dados.get(key);
        if (algo == null){
            dados.put(key, data);
        }else {
            throw new RuntimeException(nametype + " " + key + " já existe!");
        }
    }
    public void emprestar(String key, Algo data){
        Algo algo = dados.get(key);
        dados.put(key, data);
    }
    public void receber(String key, Algo data){
        Algo algo = dados.get(key);
        dados.put(key, data);
    }

    public Algo get(String key){
        Algo algo = dados.get(key);
        if(algo == null){
            throw new RuntimeException(nametype + " " + key + " não existe!");
        }
        return algo;
    }
    public ArrayList<Algo> getAll(){
        ArrayList<Algo> out = new ArrayList<Algo>();
        for (String key : dados.keySet()){
            out.add(dados.get(key));
        }
        return out;
    }

    public void remove(String key){
        Algo algo = dados.get(key);
        if (algo != null){
            dados.remove(key);
        }else {
            throw new RuntimeException(nametype + " " + key + " já está morto!");
        }
    }
}