package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[21];
		int i;
		int[] b = new int[21];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b[0] = 1;
		b[1] = 1;
		for (i = 2;i <= 20;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
		}
		for (i = 1;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		System.out.printf("%d\n",b[(a[i - 1] - 1)]);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[n - 1] = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d",b[(a[n - 1]) - 1]);

		return 0;
	}

}

