/**
 * File : DAOManager.java 31/05/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : Pengelola DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
