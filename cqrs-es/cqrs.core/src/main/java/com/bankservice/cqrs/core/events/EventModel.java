package com.bankservice.cqrs.core.events;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@Document(collation = "eventStore")
public class EventModel {
    @Id
    private String id;
    private Date timestamp;
    /**
        This will be very important field, especially when we retrieve
        existing events for given aggregate and in particular when we want to replay
        the event store;
     **/
    private String aggregateIdentifier;
    private String aggregateType;
    private int version;
    private String eventType;
    private BaseEvent eventData;
}
