package br.projeto.observer.Publisher;

import br.projeto.observer.Models.PackageItem;
import br.projeto.observer.PackageEventManager;
import br.projeto.observer.Subscriber.CheckInListenner;
import br.projeto.observer.Subscriber.CheckOutListenner;
import br.projeto.observer.Types.EventType;
import br.projeto.observer.mContext;

public class WarehousePublisher {

    PackageEventManager EventManager;

    public WarehousePublisher() {
        EventManager = new PackageEventManager();

        //listenners registration
        EventManager.subscriber(EventType.CHECK_IN_EVENT,new CheckInListenner());
        EventManager.subscriber(EventType.CHECK_OUT_EVENT,new CheckOutListenner());

    }

    public void CheckIn(PackageItem item)
    {
        mContext context = new mContext();
        context.setItem(item);
        EventManager.notify(EventType.CHECK_IN_EVENT, context);
    }

    public void CheckOut(PackageItem item)
    {
        mContext context = new mContext();
        context.setItem(item);
        EventManager.notify(EventType.CHECK_OUT_EVENT,context);
    }
}
