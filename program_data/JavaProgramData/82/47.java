package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int e;
		int max;
		int[][] a = new int[100][2];
		int[] b = new int[100];
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 2;j++)
			{
				a[i][j] = 0;
			}
		}
		for (i = 0;i < 100;i++)
		{
			b[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		k = 0;
			 for (i = 0;i < n;i++)
			 {
		   if ((90 <= a[i][0]) && (a[i][0] <= 140) && (60 <= a[i][1]) && (a[i][1] <= 90))
		   {
			k = k + 1;
			b[i] = k;
		   }

		   else
		   {
			b[i] = k;
			k = 0;
		   }
			 }

		max = 0;
		for (i = 0;i < n;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

