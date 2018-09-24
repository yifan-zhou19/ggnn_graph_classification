package <missing>;

public class GlobalMembers
{
	public static void shuchu()
	{
		int a;
		char b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.get(b);
		if (b != '\n')
		{
			shuchu();
			System.out.print(b);
			System.out.print(a);
		}
			if (b == '\n')
			{
				System.out.print(a);
			}
	}
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		shuchu();

		return 0;
	}
}

