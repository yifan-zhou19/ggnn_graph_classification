package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	int m = 0;
	for (int i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		b[i] = 1;
	}
	for (int i = n - 1;i >= 0;i--)
	{
		for (int j = i - 1;j >= 0;j--)
		{
			if (a[j] >= a[i] != 0 && b[j] < b[i] + 1)
			{
				b[j] = b[i] + 1;
			}
		}
	}
	for (int i = 0;i < n;i++)
	{
		if (m < b[i])
		{
			m = b[i];
		}
	}
	System.out.printf("%d",m);
	}

}

