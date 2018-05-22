package telemedicine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rodolfo
 */
public class Hospital implements Serializable {

    private String name;
    private Map<Long, Doctor> doctors;
    private Map<Long, Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new HashMap<>();
        this.patients = new HashMap<>();
    }

    public void addDoctor(Doctor d) {
        doctors.put(d.getLogin(), d);
    }

    public void addPatient(Patient p) {
        patients.put(p.getId(), p);
    }

    public ArrayList<Doctor> getAllDoctors() {
        ArrayList<Doctor> res = new ArrayList<>();

        res.addAll(this.doctors.values());

        return res;
    }

    public short countDoctors() {
        return (short) (getAllDoctors().size());
    }

    public ArrayList<Patient> getAllPatients() {
        ArrayList<Patient> res = new ArrayList<>();

        res.addAll(this.patients.values());

        return res;
    }

    public short countPatients() {
        return (short) (getAllPatients().size());
    }

}
