package br.projeto.observer.Subscriber;

import br.projeto.observer.mContext;

public class CheckInListenner implements ISubscriber {

    @Override
    public void update(mContext Context) {
        System.out.printf("EVENTO CHECK IN: Item: %s To: %s",Context.getItem().getName(),Context.getItem().getDestiny());
    }
}
