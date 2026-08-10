class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {
            int j = i;

            // Find #
            while (s.charAt(j) != '#') {
                j++;
            }

            // Get length
            int len = Integer.parseInt(s.substring(i, j));

            // Move past #
            j++;

            // Get string
            String str = s.substring(j, j + len);
            result.add(str);

            // Move to next encoded string
            i = j + len;
        }

        return result;
    }
}

