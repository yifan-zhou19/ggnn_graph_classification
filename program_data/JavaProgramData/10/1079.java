package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 1;
		}
		int m = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if ((a[j] >= a[i]) && (b[j] >= b[i]))
				{
				b[i] = b[j] + 1;
				}
			}
			if (b[i] > m)
			{
				m = b[i];
			}
		}
		System.out.printf("%d",m);
	}
}

