
import java.util.Collections;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
       if(nums.isEmpty()){
        return 0;
       }
       Collections.sort(nums);
       int Max = nums.get(nums.size()-1);
       int min = nums.get(0);
       return Max - min;
    
}
}