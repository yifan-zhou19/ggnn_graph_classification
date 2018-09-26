package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
	 int i;
	 int n;
	 float m;
	 float j = 0F;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Float.parseFloat(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b = tempVar3.charAt(0);
		 }
		 n = a.length();
		 if ((a.length()) != (b.length()))
		 {
			 System.out.print("error");
			 return 0;
		 }
		 for (i = 0;i < n;i++)
		 {
			 if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G') || ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G')))
			 {
				 System.out.print("error");
				 return 0;
			 }
			else
			{
				if (a.charAt(i) == b.charAt(i))
				{
				j++;
				}
			}
		 }
		 if (j / n >= m)
		 {
		 System.out.print("yes");
		 }
		 else
		 {
		 System.out.print("no");
		 }
		 return 0;
	}
}

