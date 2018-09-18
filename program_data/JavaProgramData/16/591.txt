package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(n);
			System.out.print("\n");
		}
		else
		{
			for (i = 1; ; i++)
			{
				a = n / 10;
				b = n - (a * 10);
				if (a == 0 && b == 0)
				{
					break;
				}
				System.out.print(b);
				n = a;
			}
		}
		System.out.print("\n");
		return 0;
	}
}

