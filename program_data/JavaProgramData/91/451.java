package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[1000]);
	  final String s1 = "";
	  int i;
	  int j;
	  int n;
	  void change(char s.charAt(),char s1.charAt(),int n);
	  s = new Scanner(System.in).nextLine();
	  change(s, s1, s.length());
	  System.out.println(s1);
	  return 0;
	}
	 public static void change(String s, String s1, int n)
	 {
	  int i;
	  String p = s;
	  for (i = 0;i < n - 1;i++,p++)
	  {
	   s1[i] = p + *(p.Substring(1));
	  }
	  s1[n - 1] = s[0] + s[n - 1];
	 }
}
