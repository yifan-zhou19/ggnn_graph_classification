package <missing>;

public class GlobalMembers
{
	public static int pa(int n)
	{
		int k = 1;
		int i;
	for (i = 2;i * i <= n;i++)
	{
	if (n % i == 0)
	{
		k = 0;
		break;
	}
	}
	return k;
	}
	public static int Main()
	{
		int n;
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;2 * i + 3 <= n;i++)
		{
		if (pa(2 * i + 1) != 0)
		{
			if (pa(2 * i + 3) != 0)
			{
			k = 0;
			System.out.printf("%d %d\n",2 * i + 1,2 * i + 3);
			}
		}
		}
		if (k != 0)
		{
			System.out.print("empty");
		}
	}
}

