package telemedicine;

import java.io.Serializable;

/**
 *
 * @author Rodolfo
 */
public class Patient implements Serializable {

    public int heartBeats;
    public short pressureA;
    public short pressureD;
    public int colesterol;
    public String blood;
    public String name;
    public String sirname;
    public String adress;
    public String city;
    public String country;
    public String birth;
    public long id;

    public Patient(int heartBeats, short pressureA, short pressureD, int colesterol, String blood, String name, String sirname, String adress, String city, String country, String birth, long id) {
        this.heartBeats = heartBeats;
        this.pressureA = pressureA;
        this.pressureD = pressureD;
        this.colesterol = colesterol;
        this.blood = blood;
        this.name = name;
        this.sirname = sirname;
        this.adress = adress;
        this.city = city;
        this.country = country;
        this.birth = birth;
        this.id = id;
    }

    public int getHeartBeats() {
        return heartBeats;
    }

    public void setHeartBeats(int heartBeats) {
        this.heartBeats = heartBeats;
    }

    public short getPressureA() {
        return pressureA;
    }

    public void setPressureA(short pressureA) {
        this.pressureA = pressureA;
    }

    public short getPressureD() {
        return pressureD;
    }

    public void setPressureD(short pressureD) {
        this.pressureD = pressureD;
    }

    public int getColesterol() {
        return colesterol;
    }

    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
