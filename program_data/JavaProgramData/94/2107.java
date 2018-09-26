package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i1 = 1;
		int i;
		int j = 1;
		int j1;
		int j2;
		int n;
		int[] a = new int[500];
		int[] b = new int[500];
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 == 1)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (j1 = 1;j1 < j;j1++)
		{
			for (j2 = 1;j2 < j - j1;j2++)
			{
				if (b[j2] > b[j2 + 1])
				{
					x = b[j2];
					b[j2] = b[j2 + 1];
					b[j2 + 1] = x;
				}
			}
		}
		System.out.printf("%d",b[1]);
		for (i1 = 2;i1 < j;i1++)
		{
			System.out.printf(",%d",b[i1]);
		}
		return 0;
	}

}

