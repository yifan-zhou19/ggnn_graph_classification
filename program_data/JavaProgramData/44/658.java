package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int i;
		int a = n;
		int b;
		int j;
		int c = n % 10;
		for (i = 0;;i++)
		{
			a = a / 10;
			if (a / 10 == 0)
			{
			break;
			}
		}
		for (j = 0;j <= i;j++)
		{
			c = c * 10;
		}
		if (n / 10 != 0)
		{
			b = reverse(n / 10) + c;
		}
		else
		{
			b = n;
		}
		return b;
	}
	public static int Main()
	{
		int n;
		int b;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
		b = reverse(n);
		System.out.print(b);
		System.out.print("\n");
		}
	return 0;
	}
}

