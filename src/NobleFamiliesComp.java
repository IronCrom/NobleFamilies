import java.util.Comparator;

public class NobleFamiliesComp implements Comparator <NobleFamilies> {
    private int maxSurname;

    public NobleFamiliesComp(int maxSurname) {
        this.maxSurname = maxSurname;
    }

    @Override
    public int compare(NobleFamilies o1, NobleFamilies o2) {
        int surnameLength1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int surnameLength2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;

        if (surnameLength1 == surnameLength2 || (surnameLength2 >= maxSurname && surnameLength1 >= maxSurname)) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return Integer.compare(surnameLength1, surnameLength2);
        }
    }
}
