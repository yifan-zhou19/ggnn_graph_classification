package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int p = 0;
	 int r = 0;
	 double k;
	 double w;
	 String s1 = new String(new char[1000]);
	 String s2 = new String(new char[1000]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Double.parseDouble(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 s1 = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 s2 = tempVar3.charAt(0);
	 }
	 if (s1.length() != s2.length())
	 {
	 r++;
	 }
	 else
	 {
		 for (i = 0;i < s1.length();i++)
		 {
			 if (s1.charAt(i) != 'A' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G' && s1.charAt(i) != 'T')
			 {
			 r++;
			 }
			 if (s2.charAt(i) != 'A' && s2.charAt(i) != 'C' && s2.charAt(i) != 'G' && s2.charAt(i) != 'T')
			 {
			 r++;
			 }
		 }
	 }
	 if (r > 0)
	 {
		 System.out.print("error");
	 }
	 else
	 {
		 for (i = 0;i < s1.length();i++)
		 {
			 if (s1.charAt(i) == s2.charAt(i))
			 {
			 p++;
			 }
		 }
		w = 1.0 * p / (s1.length());
		if (w > k)
		{
		System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	 }
	 return 0;
	}
}

