package <missing>;

public class GlobalMembers
{
	public static int f(int a,int n)
	{
		if (n == 1)
		{
			return a; //????
		}
		else
		{
			return f(a, n - 1) / 2;
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int t = 1;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;f(a, i) >= 1;i++)
		{
			for (j = 1;f(b, j) >= 1;j++) //???????????
			{
				if (f(a, i) == f(b, j))
				{
					t = (f(a, i) > t != 0? f(a, i):t); //????????????
					break;
				}
			}
		}
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}

}

