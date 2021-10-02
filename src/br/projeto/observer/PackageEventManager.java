package br.projeto.observer;

import br.projeto.observer.Models.EventModel;
import br.projeto.observer.Subscriber.ISubscriber;
import br.projeto.observer.Types.EventType;

import java.util.ArrayList;
import java.util.List;

public class PackageEventManager {

    private List<EventModel> Events;

    public PackageEventManager()
    {
        Events = new ArrayList<EventModel>();
    }

    public void subscriber(EventType event, ISubscriber listenner)
    {
        Events.add(new EventModel(listenner,event));
    }

    public void unSubscriber(EventType event,ISubscriber listenner){
        for(int i = 0; i < Events.size(); i++) {
            if(Events.get(i).getEventType() == event && Events.get(i).getEventListenner().equals(listenner))
            {
                Events.remove(i);
                break;
            }
        }
    }

    public void notify(EventType event, mContext context){
        for (EventModel e: Events) {
            if(e.getEventType() == event)
            {
                e.getEventListenner().update(context);
            }

        }
    }
}
