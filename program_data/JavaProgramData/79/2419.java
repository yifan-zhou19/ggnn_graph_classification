package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int s;
	int n;
	int m;
	for (int j = 1;j <= 9999999;j++)
	{
	s = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 0 && m == 0)
	{
		break;
	}
	for (i = 2;i <= n;i++)
	{
	s = (s + m) % i;
	}
	System.out.print(s + 1);
	System.out.print("\n");
	}
	return 0;
	}

}

