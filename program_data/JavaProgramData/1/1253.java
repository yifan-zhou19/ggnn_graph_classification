package <missing>;

public class GlobalMembers
{
	public static int t; //t???
	public static void f(int n,int d) //n?????d???
	{
		int i;
		if (n == 1)
		{
			t++;
		}
		else
		{
			for (i = d;i <= n;i++)
			{
				if (n % i == 0)
				{
					f(n / i, i);
				}
			}
		}
	}
	public static int Main()
	{
		int[] number = new int[100];
		int n;
		int i;
		int[] result = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			t = 0;
			f(number[i], 2);
			result[i] = t;
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(result[i]);
			System.out.print("\n");
		}
		return 0;
	}


}

