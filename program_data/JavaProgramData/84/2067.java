package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a = 0;
	int b = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= n;i++)
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m >= a)
		{
			b = a;
			a = m;
		}
		else if (m > b)
		{
			b = m;
		}
	}
	System.out.printf("%d\n%d\n",a,b);
	return 0;
	}
}

