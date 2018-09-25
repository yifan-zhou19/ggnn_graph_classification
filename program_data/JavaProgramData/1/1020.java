package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static void f(int a,int s)
	{
		int i;
		if (a == 1)
		{
			sum++;
		}
		else
		{

			for (i = s; i <= a; i++)
			{
				if (a % i == 0)
				{
					f((a / i), i);
				}
			}
		}
		return;
	}


	public static int Main()
	{
		int n;
		int num;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= n; j++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f(num, 2);
			System.out.printf("%d\n",sum);
			sum = 0;

		}
		return 0;
	}

}

