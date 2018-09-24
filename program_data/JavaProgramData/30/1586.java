package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	sum = 0;
	for (i = 1;i <= n;i++)
	{
		if (i % 7 != 0 && i % 10 != 7 && (i / 10) % 10 != 7)
		{
		sum = sum + i * i;
		}
	}
	System.out.print(sum);
	return 0;
	}
}

