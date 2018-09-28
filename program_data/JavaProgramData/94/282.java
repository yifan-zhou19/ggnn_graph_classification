package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int m;
	int c;
	int[] num = new int[500];
	int[] nu = new int[500];
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
			num[i] = Integer.parseInt(tempVar2);
		}
	}
	k = 0;
	i = 0;
	while (i < n)
	{
		if (num[i] % 2 != 0)
		{
			nu[k] = num[i];
			k++;
		}
		i++;
	}
	k = k - 1;
	for (i = 0;i <= k;i++)
	{
		for (m = 0;m <= k - i;m++)
		{
			if (nu[m] >= nu[k - i])
			{
				c = nu[m];
				nu[m] = nu[k - i];
				nu[k - i] = c;
			}
		}
	}
	for (i = k;i > 0;i--)
	{
		System.out.printf("%d,",nu[k - i]);
	}
	System.out.printf("%d",nu[k]);
		return 0;
	}
}

