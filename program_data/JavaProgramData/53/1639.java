package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h = 1;
		int n;
		int m;
		int flag = 1;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[1] = a[1];
		for (i = 1;i <= n;i++)
		{
			flag = 1;
			for (j = 1;j <= h;j++)
			{
				if (a[i] == b[j])
				{
					flag = 0;
				}
			}
			if (flag == 1)
			{
				h++;
				b[h] = a[i];
			}

		}
		if (h == 1)
		{
			System.out.printf("%d",a[1]);
		}
		if (h >= 2)
		{
		for (i = 1;i <= h - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[h]);
		return 0;
		}
	}
}

