package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[20000];
		int b = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (j = 1;j < n;j++)
		{
			for (k = 0;k <= j;k++)
			{
		if (a[k] != a[j])
		{
			b++;
		}
			}
			if (b == j)
			{
				System.out.printf(" %d",a[j]);
			}
			b = 0;
		}
		return 0;

	}
}

