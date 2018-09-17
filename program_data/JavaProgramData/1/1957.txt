package <missing>;

public class GlobalMembers
{
	public static int sum(int a,int i)
	{
		int ret = 1;
		for (;i <= Math.sqrt((float)a);i++)
		{
			if (a % i == 0)
			{
				ret += sum(a / i, i);
			}
		}
		return ret;
	}
	public static int Main()
	{
		int t;
		int a;
		int j;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (j = 0;j < t;j++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(sum(a, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

