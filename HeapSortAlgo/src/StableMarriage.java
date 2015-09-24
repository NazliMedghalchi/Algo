import javax.crypto.NullCipher;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nazli on 2015-09-20.
 */
public class StableMarriage {
    ArrayList<Integer> applicants;
    ArrayList<Integer> company;
    List<Integer> orderingA = null; //Applicants preferences
    List<Integer> orderingC = null; //Companies preferences

    ArrayList<Integer> current = new ArrayList<Integer>();
    Integer[] stableMatch = null;
    public List<Integer> StableMarriage(){


        //Applying for companies
        while(applicants==null && isMatchingFull==false)
        {


        }
        return orderingA;
    }
    //check if stableMatch is all full or not
    //Meaning every applicant has to apply to every company
    class isFull {
        private boolean isMatchingFull() {
            if (stableMatch != null) return true;
            return false;
        }
    }
    public StableMarriage(ArrayList<Integer> applicant, ArrayList<Integer> inputCompany){
        // Free all array members
        for (int val=0; val<= applicants.size() ||
                val <= company.size(); val++){
            applicants.set(val, null);
            company.set(val, null);
        }
    }
    }
}
