package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int j;
	int i;
	int k;
	int[] a = new int[1000];
	int y;
	int sum = 0;
	int num = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = n - 1;i >= 0;i--)
	{
		for (j = 0;j < i;j++)
		{
			if (a[j] > a[j + 1])
			{
				int t;
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
		}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] >= k)
	{
			y = i;
			break;
	}
	}
	if (i >= n)
	{
		y = n;
	}
	for (i = 0;i < y;i++)
	{
		for (j = i + 1;j < y;j++)
		{
			sum = a[i] + a[j];
			if (sum == k)
			{
				System.out.print("yes");
				return 0;
			}
			sum = 0;
		}
	}
	if (i >= y)
	{
		System.out.print("no");
	}
	return 0;
	}



}

