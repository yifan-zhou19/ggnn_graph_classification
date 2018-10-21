package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		int[] b = new int[101];
		int i;
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
			b[i] = a[i];
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = b[n - i + 1];
	if (i != n)
	{
			System.out.printf("%d ",a[i]);
	}
	else
	{
		System.out.printf("%d",a[i]);
	}
		}
		return 0;
	}

}

