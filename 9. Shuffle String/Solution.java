class Solution {
    public String restoreString(String s, int[] indices) {
         HashMap<Integer, Character> map = new HashMap<>();
         String result = "";
         for(int i = 0;i<indices.length;i++)
         {
             map.put(indices[i], s.charAt(i));
         }
         Arrays.sort(indices);
         for(int i = 0;i<indices.length;i++)
         {
                result+=Character.toString(map.get(i));     
         }
         return result;           
        
    }
}