import com.sts.Dummy;
import com.sts.DummyCreated;
import com.sts.DummyLocation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        System.out.println(splitDummyLocationsCreate(generateDummy()));

    }

    public static List<DummyCreated> splitDummyLocationsCreate(DummyCreated input) {
        List<DummyCreated> dummyCreatedList = new ArrayList<>();

        if (input.getDummy().getLocations() != null) {
            List<DummyLocation> locations = input.getDummy().getLocations();
            for (int i=0;i< locations.size();i++) {
                DummyCreated dummyCreatedFiltered = new DummyCreated();
                dummyCreatedFiltered.setGroupTransactionId(input.getGroupTransactionId());
                dummyCreatedFiltered.setDummy(input.getDummy());
                //System.out.println(locations.get(i));
                System.out.println(dummyCreatedFiltered.getDummy().toString());
                dummyCreatedFiltered.getDummy().setLocations(Arrays.asList(locations.get(i)));
                dummyCreatedList.add(dummyCreatedFiltered);
            }
            return dummyCreatedList;
        } else {
            dummyCreatedList.add(input);
            return dummyCreatedList;
        }
    }
    public static DummyCreated generateDummy(){
        DummyCreated dummyCreated=new DummyCreated();
        Dummy dummy=new Dummy();
        List<DummyLocation> locations=new ArrayList<>();
        DummyLocation loc1=new DummyLocation();
        loc1.setLocationCode(0);
        loc1.setCity("DAKAR");
        DummyLocation loc2=new DummyLocation();
        loc2.setLocationCode(1);
        loc2.setCity("Ziguinchor");
        DummyLocation loc3=new DummyLocation();
        loc3.setLocationCode(2);
        loc3.setCity("Saint Louis");
        locations.addAll(Arrays.asList(loc1,loc2,loc3));
        dummy.setLocations(locations);
        dummyCreated.setDummy(dummy);
        dummyCreated.setGroupTransactionId("1234-efhk-d354-5fvj");

        return dummyCreated;
    }
}