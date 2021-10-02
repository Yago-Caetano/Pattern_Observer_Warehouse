package br.projeto.observer.Subscriber;

import br.projeto.observer.mContext;

public class CheckOutListenner implements ISubscriber{
    @Override
    public void update(mContext Context) {
        System.out.printf("EVENTO CHECK OUT: Item: %s To: %s",Context.getItem().getName(),Context.getItem().getDestiny());
    }
}
