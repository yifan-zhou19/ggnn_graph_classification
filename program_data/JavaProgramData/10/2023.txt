package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int[] a = new int[25];
		int i;
		int j;
		int max;
		int[] b = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
		}
		for (i = 1;i < k;i++)
		{
			max = 1;
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i] != 0 && b[j] + 1 >= max)
				{
					max = b[j] + 1;
				}
			}
			b[i] = max;
		}
		max = 0;
		for (i = 0;i < k;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d",max);
	}
}

