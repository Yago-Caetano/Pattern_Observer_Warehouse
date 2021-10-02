package br.projeto.observer;

import br.projeto.observer.Models.PackageItem;

public class mContext {

    PackageItem Item;

    public PackageItem getItem() {
        return Item;
    }

    public void setItem(PackageItem item) {
        Item = item;
    }
}
