package com.byteforge.jobportal.contact.service;

import com.byteforge.jobportal.dto.ContactRequestDto;

public interface IContactService {

     boolean saveContact(ContactRequestDto contactRequestDto);
}
