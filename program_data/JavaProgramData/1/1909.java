package <missing>;

public class GlobalMembers
{
	public static int num(int a, int b)
	{
		int f = 0;
		if (a >= b) //????????????
		{
		for (int i = b;i <= a;i++) //????
		{
				if (a == i)
				{
					f++;
				}
				else if (a % i == 0)
				{
					f = f + num(a / i, i); //???????????
				}
		}
		}
		return f;
	}
	public static int Main()
	{
		int t;
		int a;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= t;i++) //??
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(num(a, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

