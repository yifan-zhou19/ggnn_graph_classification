package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int r;
		int l;
		int i;
		int x;
		int j;
		int[][] a = new int[1000][1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= r;i++)
		{
		   for (j = 1;j <= l;j++)
		   {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  x = Integer.parseInt(tempVar3);
				  }
			   a[i + j][b[i + j]] = x;
			   b[i + j]++;
		   }
		}
			   i = i - 1;
			   j = j - 1;
		for (t = 2;t <= i + j;t++)
		{
			   for (m = 0;m < b[t];m++)
			   {
				  System.out.printf("%ld\n",a[t][m]);
			   }
		}
		return 0;
	}
}

