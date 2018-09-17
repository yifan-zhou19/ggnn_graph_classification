package <missing>;

public class GlobalMembers
{
	public static void fun(int m, int i)
	{
		int k = Math.sqrt(m);
		for (i = i; i <= k; i++)
		{
			if (m % i == 0)
			{
					 num++;
				fun(m / i, i); //?????????
			}
		}
	}
	public static int num;
	public static int Main()
	{
		int n;
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = 0;
			fun(a, 2); //????
			System.out.print(num + 1);
			System.out.print("\n");
		}
		return 0;
	}
}

