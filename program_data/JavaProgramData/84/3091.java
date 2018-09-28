package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int min;
		int e;
		int k;
		i = 0;
		k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] number = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(number[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i <= n - 1 - k;i++)
			{
				if (number[i] > number[i + 1])
				{
					e = number[i + 1];
					number[i + 1] = number[i];
					number[i] = e;
				}
			}
		}
		System.out.printf("%d\n%d\n",number[n - 1],number[n - 2]);
		return 0;
	}
}

