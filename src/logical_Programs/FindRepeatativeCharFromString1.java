package logical_Programs;

import java.util.HashMap;
public class FindRepeatativeCharFromString1 {
public static void main(String[] args) {
String str = "xyzabxcpqrxabcpqrlmnxy";
HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
for (int i = 0; i <= str.length() - 1; i++)// 0
{
char temp = str.charAt(i);// x
if (hm.containsKey(temp)) {
hm.put(temp, hm.get(temp) + 1);
} else {
hm.put(temp, 1);
}
}
System.out.println(hm);
}
}