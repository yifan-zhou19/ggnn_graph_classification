package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int sum = 0;
	double s1;
	double s2;
	double i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0.0;i <= n;i++)
	{
		s1 = Math.floor(i / 100);
		s2 = Math.floor((i - s1 * 100) / 10);
	if (i / 7 == Math.floor(i / 7))
	{
		continue;
	}

	else if (s1 == 7 || s2 == 7 || i - s1 * 100 - s2 * 10 == 7)
	{
		continue;
	}
	sum += i * i;

	}
	System.out.print(sum);
	System.out.print("\n");
	return 0;



	}
}

