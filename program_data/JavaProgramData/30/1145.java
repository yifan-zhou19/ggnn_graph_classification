package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (;n > 0;n--)
	{
		if (n % 7 == 0 || n % 10 == 7 || (n / 10) % 10 == 7)
		{
			continue;
		}
	sum += n * n;
	}
	System.out.print(sum);
	System.out.print("\n");



	return 0;
	}
}

