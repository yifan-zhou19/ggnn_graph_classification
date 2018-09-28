package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int w = 0;
	 int g = 0;
	 double n;
	 String v = new String(new char[100]);
	 String c = new String(new char[100]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Double.parseDouble(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 v = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 c = tempVar3.charAt(0);
	 }
	 char A;
	 char T;
	 char G;
	 char C;
	 if (v.length() != c.length())
	 {
		System.out.print("error");
	 }
	 else
	 {
		   for (int i = 0;i <= v.length() - 1;i++)
		   {
			  if (((v.charAt(i) != 'A') && (v.charAt(i) != 'G') && (v.charAt(i) != 'C') && (v.charAt(i) != 'T')) || ((c.charAt(i) != 'A') && (c.charAt(i) != 'G') && (c.charAt(i) != 'C') && (c.charAt(i) != 'T')))
			  {
				  g = 1;
				   System.out.print("error");
				   break;
			  }
			  else if (v.charAt(i) == c.charAt(i))
			  {
				  w++;
			  }
		   }

		  double l = 1.0 * w / v.length();
		  if ((l > n) && (g == 0))
		  {
			  System.out.print("yes");
		  }
		  else if ((l <= n) && (g == 0))
		  {
			  System.out.print("no");
		  }
	 }
	int u;
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		u = Integer.parseInt(tempVar4);
	}
	   return 0;
	}

}

