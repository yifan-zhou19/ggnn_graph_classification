package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i;
	int sum = 0;
	for (i = 1;i <= n;i++)
	{
		if (69 < i && i < 80)
		{
	sum = sum;
		}
	else if (i % 10 == 7)
	{
		sum = sum;
	}
	else if (i % 7 == 0)
	{
		sum = sum;
	}
	else
	{
		sum = sum + i * i;
	}
	}
	System.out.print(sum);
	System.out.print("\n");
	return 0;
	}
}

