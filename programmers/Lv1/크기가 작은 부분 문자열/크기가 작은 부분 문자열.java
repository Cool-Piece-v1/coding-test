import java.util.*;

class Solution {
	public int solution(String t, String p) {

		List<Long> list = new ArrayList<>();

		for (int i = 0; i < (t.length() - p.length() + 1); i++) {
			Long num1 = Long.parseLong(t.substring(i, i + p.length()));
			if (num1 <= Long.parseLong(p)) {
				list.add(num1);
			}
		}
		return list.size();
	}

}
