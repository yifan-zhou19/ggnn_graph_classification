package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] count = new int[100];
		int m = 0;
		int a;
		int b;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if ((a >= 90 && a <= 140) && (b >= 60 && b <= 90))
			{
				count[m]++;
			}
			else
			{
				m++;
			}
		}
		int e = 0;
		int k;
		int f;
		for (k = 0;k < n - 1;k++)
		{
			for (f = k + 1;f < n;f++)
			{
				if (count[f] > count[k])
				{
					e = count[k];
					count[k] = count[f];
					count[f] = e;
				}
			}
		}
		System.out.printf("%d",count[0]);
		return 0;
	}
}

