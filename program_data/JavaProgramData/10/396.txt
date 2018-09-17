package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] missile = new int[25];
		int k;
		int[] max = new int[25];
		int max1;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		max[k - 1] = 1;
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				missile[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = k - 2;i >= 0;i--)
		{
			max[i] = 1;
			for (j = i + 1;j < k;j++)
			{
				if (missile[i] >= missile[j] != 0 && max[i] <= max[j])
				{
				   max[i] = max[j] + 1;
				}
			}
		}
		for (i = 0,max1 = 0;i < k;i++)
		{
			if (max[i] > max1)
			{
			   max1 = max[i];
			}
		}
		System.out.printf("%d",max1);
		return 1;
	}


}

