package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int x = 0;
	public static int y = 0;
	public static int z = 0;
	public static int i = 0;
	public static int m = 0;
	public static int k = 0;
	public static int t = 0;
	public static int n = 0;
	public static int j = 0;
	public static int Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < x;i++)
	{
		for (m = 0;m < y;m++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][m] = Integer.parseInt(tempVar3);
			 }
		}
	}
	for (n = 0;;n++)
	{
	   for (i = n;i < y - n;i++)
	   {
		System.out.printf("%d\n",a[n][i]);
		t++;
	   }
	   System.out.print("\n");
	   if (t == x * y)
	   {
		   break;
	   }
	   for (j = n + 1;j < x - n;j++)
	   {
		System.out.printf("%d\n",a[j][y - n - 1]);
		t++;
	   }
	   System.out.print("\n");
	   if (t == x * y)
	   {
		   break;
	   }
	   for (i = y - 2 - n;i >= n;i--)
	   {
		System.out.printf("%d\n",a[x - n - 1][i]);
		t++;
	   }
	   System.out.print("\n");
	   if (t == x * y)
	   {
		   break;
	   }
	   for (j = x - 2 - n;j > n;j--)
	   {
		System.out.printf("%d\n",a[j][n]);
		t++;
	   }
	   System.out.print("\n");
	   if (t == x * y)
	   {
		   break;
	   }
	}
	  return 0;
	}
}

