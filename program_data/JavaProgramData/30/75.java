package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int wei = int x;
		int i;
		int t;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = 0;
		for (i = 1;i <= n;i++)
		{
			if (i % 7 != 0 && wei(i) == 0)
			{
				t = t + i * i;
			}
		}
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}
	public static int wei(int x)
	{
		int flag = 0;
		int a;
		while (x != 0)
		{
			a = x - x / 10 * 10;
			x = x / 10;
			if (a == 7)
			{
				flag = 1;
				break;
			}
		}
		return (flag);
	}
}

