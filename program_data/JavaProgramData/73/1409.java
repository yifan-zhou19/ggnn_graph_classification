package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[6][6];
	 int[] s = new int[6];
	 int[] h = new int[6];
	 int[] l = new int[6];
	 int i;
	 int j;
	 int p;
	 for (i = 1;i <= 5;i++)
	 {
	   for (j = 1;j <= 5;j++)
	   {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar);
	   }
	   }
	 }

	 for (i = 1;i <= 5;i++)
	 {
		 s[i] = 0;
	  h[i] = 0;
	  l[i] = 0;
	  for (j = 1;j <= 5;j++)
	  {
		  if (a[i][j] > s[i])
		  {
			  s[i] = a[i][j];
			  h[i] = i;
			  l[i] = j;
		  }
	  }
	 }
	 int q = 1;
	 for (i = 1;i <= 5;i++)
	 {
		 p = 0;
	  for (j = 1;j <= 5;j++)
	  {
	   if (a[j][l[i]] < s[i])
	   {
		   p = 1;
	   }

	  }
	 if (p == 0)
	 {
		 System.out.printf("%d %d %d",h[i],l[i],s[i]);
	 }
	 q = q * p;
	 }
	 if (q == 1)
	 {
		 System.out.print("not found");
	 }

	 return 0;
	}
}

