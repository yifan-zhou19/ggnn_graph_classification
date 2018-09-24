package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
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
		for (i = 0;i < n - m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ", b[i]);
		}
		for (i = 0;i < n - m - 1;i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.printf("%d", a[n - m - 1]);
	}
}

