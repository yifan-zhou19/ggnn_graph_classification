package <missing>;

public class GlobalMembers
{
	public static int su(int n)
	{
	int a = n;
	int b = 0;
	int c = Math.sqrt(n);
	for (int d = 2;d <= c;d++)
	{
	if ((a % d) == 0)
	{
		b = b + 1;
	}
	}
	b = (b == 0);
	return (b);
	}
	public static int Main()
	{

		int b;
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= (b + 4) / 4;i++)
		{
			int t = 2 * i + 1;

		if ((su(t) == 1) && (su(b - t) == 1) && (t <= (b - t)))
		{
			System.out.print(t);
			System.out.print(" ");
			System.out.print(b - t);
			System.out.print("\n");
		}

		}

	}

}

