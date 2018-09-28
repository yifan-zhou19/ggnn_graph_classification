package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[301];
		int[] b = new int[301];
		int[] c = new int[301];
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
		for (i = 1;i <= n - 1;i++)
		{
			m = 0;
			for (j = 0;j <= i - 1;j++)
			{
				if (a[i] == a[j])
				{
				m = m + 1;
				}
			}
			if (m == 0)
			{
				b[i] = a[i];
			}
			else
			{
				b[i] = 0;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i <= n - 1;i++)
		{
			if (b[i] == 0)
			{
				continue;
			}
			System.out.printf(",%d",b[i]);

		}
	}
}

