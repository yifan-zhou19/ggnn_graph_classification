package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

	int n;
	int m;
	int i;
	int s = 0;
	int a = 1;
	while (true)
	{

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if ((n + m) == 0)
	{
		break;
	}
	if (n >= 2)

	{
		for (i = 2; i <= n; i++)
		{
		s = (s + m) % i;
		}


	System.out.print(s + 1);
	System.out.print("\n");
	s = 0;
	}
	if (n == 1)
	{
	System.out.print(a);
	System.out.print("\n");
	}


	}
	return 0;
	}


}

