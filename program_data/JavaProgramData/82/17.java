package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int[] b = new int[100];
		int max;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		max = 0;
		j = 0;
		for (k = 0;k < n;k++)
		{
			if (a[k] <= 140 && a[k] >= 90 && b[k] >= 60 && b[k] <= 90)
			{
				j++;
			}
			else
			{
				if (j > max)
				{
					max = j;
				}
				j = 0;
			}
		}
		if (j > max)
		{
			max = j;
		}
		System.out.printf("%d\n",max);
		return 0;
	}
}

