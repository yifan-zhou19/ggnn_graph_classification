package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[m];
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		for (i = 0; i < n; i = i + 1)
		{
			if (a[i] == b)
			{
				for (j = i; j < n - 1; j = j + 1)
				{
					a[j] = a[j + 1];
				}
				n = n - 1;
				i = i - 1;
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.printf("%d\n", a[n - 1]);
		return 0;
	}
}

