package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int m;
		int n;
		int i;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			b[i] = a[n - m + i];
		}
		for (i = m;i < n;i++)
		{
			b[i] = a[i - m];
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",b[0]);
			}
			else
			{
				System.out.printf(" %d",b[i]);
			}
		}
		return 0;
	}
}

