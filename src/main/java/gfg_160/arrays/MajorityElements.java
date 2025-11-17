package gfg_160.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MajorityElements {
    public ArrayList<Integer> findMajority(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<Integer>();

        for(int j : arr){
            if(map.containsKey(j)){
                map.put(j,map.get(j)+1);
            }else {
                map.put(j,1);
            }
        }

        for(int j: map.keySet()){
            if(map.get(j) > arr.length/3){
                res.add(j);
            }
        }
        Collections.sort(res);
        return res;
    }
}
