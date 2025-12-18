package SEE;

import CIE.Personal;

public class External extends Personal {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem, int[] seeMarks) {
        super(usn, name, sem);
        this.seeMarks = seeMarks;
    }
}
