package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100000][3];
	public static int[] s = new int[100000];
	public static int x = 0;
	public static int y = 0;
	public static int z = 0;
	public static int x1 = 0;
	public static int y1 = 0;
	public static int z1 = 0;
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		   for (j = 0;j < 3;j++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar2);
			   }
		   }
			   s[i] = a[i][1] + a[i][2];
	   }
	   for (i = 1;i <= n;i++)
	   {
		   if (s[i] > x)
		   {
				 x = s[i];
	x1 = a[i][0];
		   }
	   }

	 for (i = 1;i <= n;i++)
	 {
		 if (s[i] > y && i != x1)
		 {
		 y = s[i];
	y1 = a[i][0];
		 }
	 }

	for (i = 1;i <= n;i++)
	{
		 if (s[i] > z && i != x1 && i != y1)
		 {
		  z = s[i];
	z1 = a[i][0];
		 }
	}

	 System.out.printf("%d %d\n",x1,x);
		System.out.printf("%d %d\n",y1,y);
		System.out.printf("%d %d\n",z1,z);

		return 0;
	}

}

