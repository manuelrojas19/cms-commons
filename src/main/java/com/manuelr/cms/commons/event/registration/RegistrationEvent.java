package com.manuelr.cms.commons.event.registration;

import com.manuelr.cms.commons.dto.PersonDto;
import com.manuelr.cms.commons.event.Event;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
public class RegistrationEvent implements Event {
    private UUID eventId = UUID.randomUUID();
    private Date date = new Date();
    private PersonDto personDto;
    private RegistrationStatus registrationStatus;

    public RegistrationEvent(PersonDto personDto, RegistrationStatus registrationStatus) {
        this.personDto = personDto;
        this.registrationStatus = registrationStatus;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public Date getDate() {
        return date;
    }
}
