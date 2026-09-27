package com.byteforge.jobportal.contact.service.impl;

import com.byteforge.jobportal.Repository.ContactRepository;
import com.byteforge.jobportal.contact.service.IContactService;
import com.byteforge.jobportal.dto.ContactRequestDto;
import com.byteforge.jobportal.entity.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {

    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
        boolean result = false;
        Contact contact = contactRepository.save(transformToEntity(contactRequestDto));
        if(contact != null && contact.getId() != null) {
            result = true;
        }
        return result;
    }

    private Contact transformToEntity(ContactRequestDto contactRequestDto) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, contact);
        contact.setStatus("NEW");
        return contact;
    }
}
