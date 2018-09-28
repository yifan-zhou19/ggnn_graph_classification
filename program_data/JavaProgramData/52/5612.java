package <missing>;

public class GlobalMembers
{
	public static int arrange(int[] a, int q, int p)
	{
		int i;
		int j;
		int[] b = new int[100];
		for (i = 0;i < q;i++)
		{
			b[i] = a[p - q + i];
		}
		for (i = p - q - 1;i >= 0;i--)
		{
			a[i + q] = a[i];
		}
		for (i = 0;i < q;i++)
		{
			a[i] = b[i];
		}

		return 0;
	}

	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
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
		arrange(a, m, n);
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}

	}
}

