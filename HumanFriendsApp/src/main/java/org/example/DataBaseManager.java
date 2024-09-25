package org.example;

import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.animals.Pet;
import org.example.utils.PetType;

import java.sql.*;
import java.time.LocalDate;

public class DataBaseManager {
    private Connection connection;

    public void open() {
        connection = DataBaseConnect.getConnection();
    }

    public void insertIntoCats(Cat cat) throws SQLException {
        PreparedStatement statement = insertIntoPets(cat, PetType.CAT);
        statement.addBatch();
        statement.addBatch("SET @last_id_in_pets = LAST_INSERT_ID()");
        statement.addBatch("INSERT INTO cats(id) VALUES (@last_id_in_pets)");
        statement.executeBatch();
    }

    public void insertIntoDogs(Dog dog) throws SQLException {
        PreparedStatement statement = insertIntoPets(dog, PetType.DOG);
        statement.addBatch();
        statement.addBatch("SET @last_id_in_pets = LAST_INSERT_ID()");
        statement.addBatch("INSERT INTO dogs(id) VALUES (@last_id_in_pets)");
        statement.executeBatch();
    }

    private PreparedStatement insertIntoPets(Pet pet, PetType petType) throws SQLException {
        String query = "INSERT INTO pets(name, birth_date, gender, pet_type_id) VALUES(?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, pet.getName());
        statement.setObject(2, pet.getBirthDate());
        statement.setString(3, pet.getGender().getTitle());
        statement.setInt(4, petType.getId());
        return statement;
    }
}
