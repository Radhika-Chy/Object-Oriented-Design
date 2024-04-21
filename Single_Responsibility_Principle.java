//*************************************************************************
// Title : A java programme to demonstrate Single Responsibility Principle.
// Author : Radhika Chowdhury, Undergrduate student, Khulna University.
//*************************************************************************

/**
 * This class represents a patient having attributes name,age,disease.
 */
class Patient {
    private String name;
    private int age;
    private String disease;

    /**
     * Constructs a new patient object with the given name, age, and disease.
     *
     * @param name   The name of the patient.
     * @param age    The age of the patient.
     * @param disease The disease the patient is suffering.
     */
    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    /**
     * Retrieves the name of the patient.
     *
     * @return The name of the patient.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the age of the patient.
     *
     * @return The age of the patient.
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the .
     *
     * @return The disease the patient is suffering from.
     */
    public String getDisease() {
        return disease;
    }
}

/**
 * This class represents a PatientDatabaseSystem.
 */
class PatientDatabaseSystem {

    /**
     * Prints the details of a patient.
     *
     * @param patient The patientt whose details are to be printed.
     */
    public void printPatientInformation(Patient p) {
        System.out.println("Patient Details:");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Course: " + p.getDisease());
    }
}

/**
 * This class demonstrates the usage of Patient and PatientDatabaseSystem classes.
 */
class Single_Responsibility_Principle {
    public static void main(String[] args) {
        // Create a patient
        Patient p = new Patient("Priya Das", 50, "Diabetes");

        // Gives appointment to patient 
        PatientDatabaseSystem appointment = new PatientDatabaseSystem();

        // Print patient details using PatientDatabaseSystem
        appointment.printPatientInformation(p);
    }
}

/**
 * In the above mentioned programme it is not the patient's duty to print the
 * information  rather the PatientDatabaseSystem handles it alloting the patient
 * class with a single responsibility of storing the attributes of a patient.
 */