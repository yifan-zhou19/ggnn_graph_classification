package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int[] k = new int[100];
		int m;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			k[i] = 0;
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if ((a >= 90 && a <= 140) && b >= 60 && b <= 90)
			{
				k[m]++;
			}
			else
			{
				m++;
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 0;j <= m - i;j++)
			{
				if (k[j] > k[j + 1])
				{
					l = k[j];
					k[j] = k[j + 1];
					k[j + 1] = l;
				}
			}
		}
		System.out.printf("%d",k[m]);
		return 0;
	}

}

