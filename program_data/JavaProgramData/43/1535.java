package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
	if (x == 1)
	{
		return 0;
	}
	if (x == 2 || x == 3)
	{
		return 1;
	}
	int m = Math.sqrt(x);
	int i;
	for (i = 2;i <= m;i++)
	{
	if (x % i == 0)
	{
		return 0;
	}
	}
	if (i == m + 1)
	{
		return 1;
	}
	}

	public static void Main(String[] args)
	{
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}

	int i;
	for (i = 3;i <= m / 2;i += 2)
	{
	if (sushu(i) != 0 && sushu(m - i) != 0)
	{
		System.out.printf("%d %d\n",i,m - i);
	}
	}
	}


}

