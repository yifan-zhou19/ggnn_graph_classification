package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
	 int pd = char p[33];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 char[][] dc = new char[n][33];
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  dc[i] = tempVar2.charAt(0);
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
		  m = String.valueOf(dc[i]).length();
	   if (pd(dc[i]) == 1)
	   {
			 for (j = 0;j < (m - 3);j++)
			 {
			System.out.printf("%c",dc[i][j]);
			 }
	   }
	   else
	   {
			 for (j = 0;j < (m - 2);j++)
			 {
	   System.out.printf("%c",dc[i][j]);
			 }
	   }
	   System.out.print("\n");
	 }

	}
	public static int pd(String p)
	{
		int t = p.length();
	 if (p[t - 1].equals('g'))
	 {
		 return (1);
	 }
	 else
	 {
		 return (0);
	 }
	}

}

