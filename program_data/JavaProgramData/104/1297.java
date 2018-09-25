package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int[] a = {n, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = {m, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 1;i < 20;i++)
		{
			if (n == 1)
			{
				break;
			}
			a[i] = n / 2;
			n = n / 2;
		}
		for (i = 1;i < 20;i++)
		{
			if (m == 1)
			{
				break;
			}
			b[i] = m / 2;
			m = m / 2;
		}
		for (i = 0;i < 20;i++)
		{
			for (j = 0;j < 20;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					return 0;
				}
			}
		}






		return 0;
	}

}

