package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		int b;
		int c = 0;
		int j = 0;
		int k;
		int[][] a = new int[1000][18];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		while (b != -1)
		{
		   if (b != 0)
		   {
			 a[i][j] = b;
			 j++;
			 a[i][17] = j;
		   }
		   else
		   {
			 a[i][j] = b;
			 i++;
			 n = i;
			 j = 0;
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < a[i][17] - 1;j++)
			{
				for (k = j + 1;k < a[i][17];k++)
				{
					if (a[i][j] == 2 * a[i][k] || a[i][k] == 2 * a[i][j])
					{
					   c++;
					}
				}
			}
			System.out.printf("%d\n",c);
			c = 0;
		}
		return 0;
	}
}

