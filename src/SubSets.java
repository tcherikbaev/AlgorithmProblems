import java.util.ArrayList;
import java.util.List;

public class SubSets {


    public static void main(String[] args)
    {
        int [] nums={1,2,3};
        System.out.println("Subsets Problem: ");
        List<List<Integer>> result = subsets(nums);
        for(List<Integer> subset:result)
        {
            System.out.print(subset+" ");
        }


    }
    private static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list=new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int index) {
        if(nums.length==index)
        {
            list.add(new ArrayList<>(tempList));
            return;
        }

        backtrack(list,tempList,nums,index+1);

        tempList.add(nums[index]);
        backtrack(list,tempList,nums,index+1);
        tempList.removeLast();
    }

}
