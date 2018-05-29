public class restoreIpAddress{
	public static List<String> restoreIpAddresses(String s){
		List<String> res = new ArrayList<String>();
		helper(s, res, 0, "", 0);
		return res;
	}
	public static void helper(String ip, List<String> res, int idx, String restored, int count){
		if(count > 4) return;
		if(count == 4 && idx == ip.length()) res.add(restored);
		String s = ip.substring(idx, idx + i);
		if((s.startsWith("0") && s.length() > 1) || (i == 3 && Integer.parseInt(s) >= 256)) continue;
		helper(ip, res, idx + i, restored + s + (count == 3 ? "" : "."), count + 1);
	}
	public static void main(String[] args) {
		String s = "22512312111253";
		System.out.println(restoreIpAddresses(s));
	}
}