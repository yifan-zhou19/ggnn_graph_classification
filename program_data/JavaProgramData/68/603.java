package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
	int i;
	int m;
	if (a == 2 || a == 3)
	{
		return (1);
	}
	else
	{
	m = Math.sqrt(a);
	for (i = 2;i <= m;i++)
	{
		if (a % i == 0)
		{
		break;
		}
	}
		if (i > m)
		{
		return (1);
		}
		else
		{
		return (0);
		}
	}
	}
	public static void Main()
	{
		int n;
		int j;
		int k;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 6;j <= n;j = j + 2)
		{
		for (k = 2;k < j;k++)
		{
			d = sushu(k);
			e = sushu(j - k);
			if (d == 1 && e == 1)
			{
				System.out.printf("%d=%d+%d\n",j,k,(j - k));
				break;
			}
		}
		}
	}
}

