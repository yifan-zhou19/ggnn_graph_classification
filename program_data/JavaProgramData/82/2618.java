package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[][] a = new int[100][2];
		int k = 0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] >= 90 && a[i][0] <= 140 && a[i][1] >= 60 && a[i][1] <= 90)
			{
				k++;
			}
			else
			{
				if (k > max)
				{
					max = k;
				}
				k = 0;
			}
		}
		if (k > max)
		{
			max = k;
		}
		k = 0;
		System.out.printf("%d\n",max);
		return 0;
	}
}

