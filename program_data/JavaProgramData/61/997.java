package <missing>;

public class GlobalMembers
{
	public static int feibonaqishulie(int a)
	{
		int b;
		int a1;
		int a2;
		int i;
		a1 = a2 = 1;
		if (a == 1 | a == 2)
		{
			b = 1;
		}
		else
		{
			for (i = 2;i < a;i++)
			{
				b = a1 + a2;
				a1 = a2;
				a2 = b;
			}
		}
		return (b);
	}
	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(feibonaqishulie(a));
			System.out.print("\n");
		}
		return 0;
	}
}

