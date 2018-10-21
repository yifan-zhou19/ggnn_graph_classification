package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[N];
		int b;

		a[1] = 1;
		a[2] = 1;

		for (i = 3;i <= N;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",a[b]);
		}

		return 0;
	}
}

