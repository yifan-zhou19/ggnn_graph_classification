package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] k = new int[100];
		int[][] a = new int[99][2];
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
		for (i = 0,j = 0;i < n;i++)
		{
			if (a[i][0] >= 90 && a[i][0] <= 140 && a[i][1] >= 60 && a[i][1] <= 90)
			{
				k[j]++;
			}
			else
			{
				j++;
			}
		}
		for (i = 0,j = k[0];i < 100;i++)
		{
			if (k[i] > j)
			{
				j = k[i];
			}
		}
		System.out.printf("%d\n",j);
		return 0;
	}
}

