package <missing>;

public class GlobalMembers
{
	public static int print()
	{
		int a;
		char c = '\0';
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = System.in.read();
		if (c != '\n')
		{
			print();
		}
		if (c != '\n')
		{
			System.out.print(c);
		}
		System.out.print(a);
		return 0;
	}
	public static int Main()
	{
		int m;
		char c;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = System.in.read();
		print();
		return 0;
	}

}

