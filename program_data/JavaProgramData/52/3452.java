package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int i;
		int[] p = a;
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		System.out.printf("%d",a[n - m]);
		for (p = a[n - m] + 1;p <= a[n - 1];p++)
		{
			System.out.printf(" %d",p[0]);
		}
		for (p = a;p <= a + n - m - 1;p++)
		{
			System.out.printf(" %d",p[0]);
		}
		return 0;
	}
}

