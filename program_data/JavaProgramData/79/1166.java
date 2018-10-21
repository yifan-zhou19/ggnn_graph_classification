package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int s;
	while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	{
	s = 0;
	for (int i = 2; i <= n; i++)
	{
	s = (s + m) % i;
	}
	System.out.print(s + 1);
	System.out.print("\n");
	}
	return 0;
	}
}

