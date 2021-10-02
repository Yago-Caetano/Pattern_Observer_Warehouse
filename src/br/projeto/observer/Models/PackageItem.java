package br.projeto.observer.Models;

public class PackageItem {

    private String Name;

    private String Destiny;

    public PackageItem(String name, String destiny) {
        Name = name;
        Destiny = destiny;
    }

    public String getName() {
        return Name;
    }

    public String getDestiny() {
        return Destiny;
    }
}
