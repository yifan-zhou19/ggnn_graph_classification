package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[1000][1000];
		   for (i = 0;i < n;i++)
		   {
		   for (j = 0;j < n;j++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   sz[i][j] = Integer.parseInt(tempVar2);
			   }
			   if (sz[i][j] == 0 && f == 0)
			   {
				   a = i;
				   b = j;
				   f = 1;
			   }
			   if (sz[i][j] == 0)
			   {
				   c = i;
				   d = j;
			   }
		   }
		   }

	  System.out.printf("%d",(d - b - 1) * (c - a - 1));
		return 0;
	}
}

