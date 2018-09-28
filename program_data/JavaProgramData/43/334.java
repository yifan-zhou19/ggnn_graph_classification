package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int num;
	int p;
	int q;
	int i;
	int j;
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (p = 3;p <= (num / 2);p = p + 2)
	{
		for (i = 2;i < p;i++)
		{
		if (p % i == 0)
		{
		break;
		}
	if (i == p - 1)
	{
		q = num - p;
	for (j = 2;j < q;j++)
	{
		if (q % j == 0)
		{
		break;
		}
	if (j == q - 1)
	{
		System.out.print(p);
		System.out.print(" ");
		System.out.print(q);
		System.out.print("\n");
	}
	}
	}
		}
	}
	return 0;
	}
}

