package br.projeto.observer.Models;

import br.projeto.observer.Subscriber.ISubscriber;
import br.projeto.observer.Types.EventType;

public class EventModel {

    ISubscriber EventListenner;

    EventType EventType;

    public EventModel(ISubscriber eventListenner, br.projeto.observer.Types.EventType eventType) {
        EventListenner = eventListenner;
        EventType = eventType;
    }

    public ISubscriber getEventListenner() {
        return EventListenner;
    }

    public br.projeto.observer.Types.EventType getEventType() {
        return EventType;
    }
}
