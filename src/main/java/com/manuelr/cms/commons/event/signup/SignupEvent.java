package com.manuelr.cms.commons.event.signup;

import com.manuelr.cms.commons.dto.SignupRequestDto;
import com.manuelr.cms.commons.event.Event;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
public class SignupEvent implements Event {
    private UUID eventId = UUID.randomUUID();
    private Date date = new Date();
    private SignupRequestDto signupRequestDto;
    private SignupStatus signupStatus;

    public SignupEvent(SignupRequestDto signupRequestDto, SignupStatus signupStatus) {
        this.signupRequestDto = signupRequestDto;
        this.signupStatus = signupStatus;
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
