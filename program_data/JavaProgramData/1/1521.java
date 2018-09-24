package <missing>;

public class GlobalMembers
{
	public static int num;
	public static void divide(int n,int n2)
	{
		int i;
		int m1;
		m1 = (int)Math.sqrt((double)n);
		for (i = n2;i <= m1;i++)
		{
			if (n % i == 0)
			{
			num++;
			divide(n / i, i);
			} //?????????????????????????????
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = 1;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			divide(m, 2);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

