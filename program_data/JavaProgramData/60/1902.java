package <missing>;

public class GlobalMembers
{
	public static int Prime(int a)
	{
		int i;
		int j;
		j = 1;
		if (a <= 1)
		{
			return 0;
		}
		else if (a == 2 && a == 3)
		{
			return 1;
		}
		else if (a > 3)
		{
			for (i = 2; i <= (a / 2); i++)
			{
				if (a % i == 0)
				{
					j = 0;
					break;
				}
			}
		}
		return j;
	}
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int a;
		int b = 0;
		for (a = 1; a <= N; a++)
		{
			if (Prime(a) == 1 && Prime(a - 2) == 1)
			{
				System.out.printf("%d %d\n", a - 2,a);
				b++;
			}
		}
		if (b == 0)
		{
			System.out.print("empty\n");
		}

	}
}

