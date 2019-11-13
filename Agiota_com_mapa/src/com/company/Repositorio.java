package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Repositorio <Algo> {
    Map<String, Algo> dados;
    String tipodeAlgo;

    public Repositorio(String tipodeAlgo) {
        dados = new TreeMap<String, Algo>();
        this.tipodeAlgo = tipodeAlgo;

    }

    public void add(String key, Algo data) {
        Algo t = dados.get(key);
        if (t == null)
            dados.put(key, data);
        else
            throw new RuntimeException( tipodeAlgo + " "  + key + " ja existe");
    }

    public void remove (String key) {
        Algo t = dados.get(key);
        if (t == null) {
            throw new RuntimeException(tipodeAlgo + " "  + key + " não existe");
        }else
            dados.remove(t);
        }

    public ArrayList<Algo> getAll(){
        ArrayList<Algo> out = new ArrayList<Algo>();
        for(String key : dados.keySet())
            out.add(dados.get(key));
        return out;
    }

    public boolean verificador(String key){
        Algo t = dados.get(key);
        if (t == null){
            return false;
        }
        else
            return true;
    }

}


