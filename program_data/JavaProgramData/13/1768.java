package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[12683];
		int[] b = new int[12683];
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		b[i] = 1;
		}
	for (j = n - 1;j >= 0;j--)
	{
	for (k = 0;k < j;k++)
	{
	if (a[k] == a[j])
	{
		b[j] = 0;
	break;
	}
	else
	{
	b[j] = 1;
	}
	}
	}
	System.out.printf("%d",a[0]);
	for (j = 1;j <= n - 1;j++)
	{
		if (b[j] == 1)
		{
		System.out.print(" ");
	System.out.printf("%d",a[j]);
		}
	}
	return 0;
	}


}

