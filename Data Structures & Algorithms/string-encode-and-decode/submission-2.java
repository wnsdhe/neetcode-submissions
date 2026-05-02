class Solution {

    public String encode(List<String> strs) {
        StringBuilder msg = new StringBuilder();
        if (strs.isEmpty()) {
            return null;
        }
        for (String str : strs) {
            msg.append(str.length());
            msg.append("#");
            msg.append(str);
        }
        return msg.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str == null) {
            return result;
        }
        if ("".equals(str)) {
            result.add(str);
            return result;
        }
        int index = 0;
        while (index <= str.length()-1) {
            // System.out.println(result);
            int beginIndex = index;
            // System.out.println(beginIndex);
            while(str.charAt(index) != '#') {
                index++;
            }
            int num = Integer.parseInt(str.substring(beginIndex, index));
            System.out.println(num);
            result.add(str.substring(index+1, index+num+1));
            index = index+num+1;
        }
        return result;
    }
}
