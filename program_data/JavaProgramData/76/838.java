package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int min;
		int max;
		int[] sz1 = new int[50000];
		int[] sz2 = new int[50000];
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz2[i] = Integer.parseInt(tempVar3);
			}
			if (i == 0)
			{
				max = sz2[i];
				min = sz1[i];
			}
			else
			{
				if (max < sz2[i])
				{
					max = sz2[i];
				}
				if (min > sz1[i])
				{
					min = sz1[i];
				}
			}
		}
		e = min + 0.5;
		for (int j = 0;max - e > 0;j++)
		{
			for (k = 0;k < n;k++)
			{
				if (e > sz1[k] && e < sz2[k])
				{
					break;
				}
			}
			if (k == n)
			{
				System.out.print("no");
				break;
			}
			e++;
		}
		if (e > max)
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

