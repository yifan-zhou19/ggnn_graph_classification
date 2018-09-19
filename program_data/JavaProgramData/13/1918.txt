package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20001];
		int i;
		int j;
		int k;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 1 && n <= 20000)
		{
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	if (a[i] < 10 || a[i] >= 100)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	else
	{
		continue;
	}
	}
	System.out.printf("%d",a[0]);
	for (j = 1;j < n;j++)
	{
		for (k = 0;k < j;k++)
		{
			if (a[j] == a[k])
			{
				flag = 1;
				break;
			}

		}
	if (flag == 0)
	{
	System.out.printf(" %d",a[j]);
	}
	flag = 0;
	}
		}
	return 0;
	}

}

