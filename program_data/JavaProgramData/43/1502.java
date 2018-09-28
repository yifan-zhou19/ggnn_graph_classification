package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m == 6)
		{
		System.out.print("3 3");
		}
		else if (m == 8)
		{
		System.out.print("3 5");
		}
		else
		{
			int a = 3;
			for (;a <= m / 2;a = a + 2)
			{
		if (sushu(a) == 1 && sushu(m - a) == 1)
		{
		System.out.printf("%d %d\n",a,m - a);
		}
			}
		}
	}

	public static int sushu(int num)
	{
	int b = 2;
	for (;b < Math.sqrt(num) + 1;b++)
	{
	if (num % b == 0)
	{
	break;
	}
	}
	if (b >= Math.sqrt(num) + 1)
	{
	return 1;
	}
	else
	{
		return 0;
	}
	}

}

