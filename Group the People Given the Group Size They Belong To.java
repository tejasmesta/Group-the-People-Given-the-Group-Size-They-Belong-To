class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        
        int n = groupSizes.length;
                
        for(int i=0;i<n;i++)
        {
            int size = groupSizes[i];
            
            System.out.print(size+" ");
            
            if(!map.containsKey(size))
            {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(size,l);
                if(map.get(size).size()==size)
                {
                    ans.add(map.get(size));
                    map.put(size,new ArrayList<>());
                }
            }
            else
            {
                map.get(size).add(i);
                if(map.get(size).size()==size)
                {
                    ans.add(map.get(size));
                    map.put(size,new ArrayList<>());
                }                
            }
        }
        
        return ans;
    }
}
