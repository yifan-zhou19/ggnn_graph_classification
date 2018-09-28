package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j = 0;
		int k;
		int max = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < k;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				j = 1;
				for (m = i + 1;m < k;m++)
				{
					if (a[m] >= 90 && a[m] <= 140 && b[m] >= 60 && b[m] <= 90)
					{
						j = j + 1;
					}
					else
					{
						j = j;
						break;
					}
				}
			}
			if (j > max)
			{
				max = j;
			}
			j = 0;
		}
		System.out.printf("%d",max);
		return 0;
	}
}

