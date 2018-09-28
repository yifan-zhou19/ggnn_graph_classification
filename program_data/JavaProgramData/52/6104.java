package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int n;
		int m;
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
		int i;
		int j;
		int num = 0;
		int p;
		int q;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - m;i++)
		{
			num = a[i];
			a[n + i] = num;
		}
		p = n - m;
		q = 2 * n - m;
		for (i = p;i < q - 1;i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.printf("%d", a[q - 1]);
	}
}

