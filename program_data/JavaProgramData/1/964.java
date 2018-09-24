package <missing>;

public class GlobalMembers
{
	public static int countt;
	public static void f(int p,int q)
	{
		for (int m = p;m <= Math.sqrt(q);m++)
		{
			if (q % m == 0)
			{
				countt++;
			f(m, q / m);
			}
		}

	}
	public static int Main()
	{
		int n;
		int num;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			countt = 0;
			for (int k = 2;k <= Math.sqrt(num);k++)
			{
				if (num % k == 0)
				{
					countt++;
				   f(k, num / k);
				}
			}
			System.out.print(countt + 1);
			System.out.print("\n");
		}
		return 0;
	}
}

