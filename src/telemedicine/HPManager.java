package telemedicine;

/**
 *
 * @author Rodolfo
 */
public class HPManager {
    
    private static Hospital hospital;

    static {
        newHospital();
    }

    public static Hospital getInstance() {
        return hospital;
    }

    public static void newHospital() {
        hospital = new Hospital("Saint Mary");
    }
    
}
