package tema7;

public class Qualification extends Teacher{
    public Qualification(String curs, int experienta, String program) {
        setCourse(curs);
        setExperienceYears(experienta);
        setSchedule(program);
    }
    public void verify() {
        if (getCourse().equals("Java") && getExperienceYears() > 3 && getSchedule().equals("Afternoon")) {
            System.out.println("You qualify to teach at this school!");
        }
        else
            System.out.println("You do not qualify!");
    }
}
