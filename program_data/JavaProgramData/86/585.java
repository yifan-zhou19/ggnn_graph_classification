package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[N];
		b[0] = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				b[j] += (j + 1) * 3;
				if (b[j] > 60)
				{
					break;
				}
			}
			if (j == m - 1 && b[j] <= 60)
			{
				a[i] = b[j] - j * 3;
			}
			else if (b[j] > 60 && b[j] <= 63)
			{
				a[i] = b[j] - (j + 1) * 3;
			}
			else
			{
				a[i] = 60 - j * 3;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}

}

