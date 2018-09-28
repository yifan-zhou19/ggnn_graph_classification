package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int h;
		int l;
		int[][] a = new int[100][100];
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				l = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < h;i++)
			{
				for (j = 0;j < l;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
					 if (h < 2 && l < 2)
					 {
						   System.out.printf("%d",a[0][0]);
						  continue;
					 }
			for (j = 0;j < l;j++)
			{
				sum += a[0][j];
				sum += a[h - 1][j];
			}
			for (i = 0;i < h;i++)
			{
				sum += a[i][0];
				sum += a[i][l - 1];
			}
			sum = sum - a[0][0] - a[0][l - 1] - a[h - 1][0] - a[h - 1][l - 1];
			System.out.printf("%d\n",sum);
			sum = 0;
		}
		return 0;
	}



}

