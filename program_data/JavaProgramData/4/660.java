package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int R;
		int C;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			R = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			C = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < R;i++)
		{
			for (j = 0;j < C;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < C;j++)
		{
			i = 0;
			while (i <= j)
			{
				k = j - i;
				System.out.printf("%d\n",a[i][k]);
				i++;
				if (i > R - 1)
				{
					break;
				}
			}
		}
		for (l = C;l < R + C - 1;l++)
		{
		   m = l - C + 1;
		   while (m <= l)
		   {
			   n = l - m;
			   System.out.printf("%d\n",a[m][n]);
			   m++;
			   if (m > R - 1)
			   {
				   break;
			   }
		   }
		}
		return 0;
	}


}

