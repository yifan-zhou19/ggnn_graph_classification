package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 double x;
	 double y;
	 int i;
	 int t = 1;
	 int r;
	 String s1 = new String(new char[500]);
	 String s2 = new String(new char[500]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x = Double.parseDouble(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 s1 = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 s2 = tempVar3.charAt(0);
	 }
	 int len1 = s1.length();
	 int len2 = s2.length();
	 if (len1 != len2)
	 {
		 t = 0;
	 }
	 else
	 {
		 int cnt = 0;
		 for (i = 0;i < len1;i++)
		 {
			 if ((!(s1.charAt(i) == 'A' || s1.charAt(i) == 'T' || s1.charAt(i) == 'C' || s1.charAt(i) == 'G')) || (!(s2.charAt(i) == 'A' || s2.charAt(i) == 'T' || s2.charAt(i) == 'C' || s2.charAt(i) == 'G')))
			 {
			 t = 0;
			 }
		 }
		 for (i = 0;i < len1;i++)
		 {
			 if (s1.charAt(i) == s2.charAt(i))
			 {
			 cnt++;
			 }
		 }
		 y = 1.0 * cnt / len1;
		 if (y > x)
		 {
		 r = 1;
		 }
		 else
		 {
		 r = 2;
		 }
	 }
	 if (t == 0)
	 {
		 System.out.print("error");
	 }
	 else if (t == 1 && r == 1)
	 {
		 System.out.print("yes");
	 }
		 else if (t == 1 && r == 2)
		 {
		 System.out.print("no");
		 }
	return 0;
	}
}

