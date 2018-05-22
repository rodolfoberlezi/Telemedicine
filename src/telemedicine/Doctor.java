package telemedicine;

import java.io.Serializable;

/**
 *
 * @author Rodolfo
 */
public class Doctor implements Serializable {

    public String name;
    public String sirname;
    public String adress;
    public String city;
    public String country;
    public String birth;
    public long login;
    public String password;
    public String specialization;

    public Doctor(String name, String sirname, String adress, String city, String country, String birth, long login, String password, String specialization) {
        this.name = name;
        this.sirname = sirname;
        this.adress = adress;
        this.city = city;
        this.country = country;
        this.birth = birth;
        this.login = login;
        this.password = password;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public long getLogin() {
        return login;
    }

    public void setLogin(long login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
