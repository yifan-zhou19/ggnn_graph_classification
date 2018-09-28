package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int i;
		int m = 0;
		int j;
		int temp;
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
		if (a[i] % 2 == 1)
		{
		b[m] = a[i];
		m++;
		}
		}
		for (j = 1;j < m;j++)
		{
	for (i = 0;i < m - j;i++)
	{
	if (b[i] > b[i + 1])
	{
	temp = b[i];
	b[i] = b[i + 1];
	b[i + 1] = temp;
	}
	}
		}
		System.out.printf("%d",b[0]);
		for (j = 1;j < m;j++)
		{
		System.out.printf(",%d",b[j]);
		}
			return 0;
	}
}

