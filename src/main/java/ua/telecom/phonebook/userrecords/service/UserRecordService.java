package ua.telecom.phonebook.userrecords.service;

import ua.telecom.phonebook.userrecords.model.UserRecord;
import ua.telecom.phonebook.util.exception.NotFoundException;

import java.util.List;

/**
 * Created on 05.09.2017.
 *
 * @author Sergiy Dyrda
 */
public interface UserRecordService {

    UserRecord get(int id, int userId) throws NotFoundException;

    void delete(int id, int userId) throws NotFoundException;

    List<UserRecord> getAll(int userId);

    void update(UserRecord userRecord, int userId) throws NotFoundException;

    UserRecord save(UserRecord userRecord, int userId);

}
