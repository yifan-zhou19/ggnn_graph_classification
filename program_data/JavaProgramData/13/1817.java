package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[20000];
		int j;
		int k;
		int b = 0;
		int[] c = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i <= n - 1; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d", a[0]);
		for (i = 1; i <= n - 1; i++)
		{
			k = 0;
			for (j = 0; j <= i - 1; j++)
			{
				if (a[i] == a[j])
				{
					k = 1;
				}
			}
			if (k == 0)
			{
				System.out.printf(" %d", a[i]);
			}
		}
		System.out.print("\n");
	}
}

