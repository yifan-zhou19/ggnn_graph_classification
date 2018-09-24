package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int i = 1;

	public static int fenpingguo(int a)
	{
		while (true)
		{


		if (a == n)
		{
			return (i * n + k);
		}
		else
		{
			if (fenpingguo(a + 1) % (n - 1) == 0)
			{
				return (fenpingguo(a + 1) * n / (n - 1) + k);

			}
			else
			{
				i++;
				continue;
			}
		}
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(fenpingguo(1));
		return 0;
	}

}

