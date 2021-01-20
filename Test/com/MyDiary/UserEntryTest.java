package com.MyDiary;
import com.MyDiary.UserEntry;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserEntryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatClassUserEntryHasTitleAfterConstructor(){
//        Given
        UserEntry userentry;
//        When
        UserEntry userEntry = new UserEntry("My first entry");
//        Assert
        String entryTitle = userEntry.getEntryTitle();
        Assertions.assertEquals("My first entry",entryTitle);
    }

    @Test
    void testThatUserEntryHasDateAndTimeOfEntry(){
//        Given
        UserEntry userEntry ;
//        When
        userEntry = new UserEntry("My First entry");
//       assert
        Assertions.assertNotNull(userEntry.getEntryDateAndTime());
    }
    @Test
    void testThatDateAndTimeOfEntryIsCurrentAtEveryPointInTime(){
//        Given
        UserEntry userEntry = new UserEntry("New User Entry");
//         When
        LocalDateTime entryDateAndTime = userEntry.getEntryDateAndTime();
        LocalDate entryDate = entryDateAndTime.toLocalDate();
        LocalDate currentDate = LocalDate.now();
//        assert
        Assertions.assertEquals(currentDate, entryDate);
    }
    @Test
    void testThatUserCanEditEntryTitle(){
//        Given
        UserEntry userEntry = new UserEntry("New User Entry");
//        When
        userEntry.updateEntryTitle("New Entry Title");
        String entryTitle = userEntry.getEntryTitle();
        Assertions.assertEquals("New Entry Title", entryTitle);
    }
    @Test
    void testThatUserBodyCanBeUpdated(){
//        Given
        UserEntry userEntry = new UserEntry("Entry Title");
//        When
        userEntry.updateEntryBody("Entry Body");
//        Assert
        String entryBody = userEntry.getEntryBody();
        Assertions.assertNotNull(entryBody);
        Assertions.assertEquals("Entry Body", entryBody);

    }
}