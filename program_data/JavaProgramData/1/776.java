package <missing>;

public class GlobalMembers
{
	public static int times = 1;
	public static int[] used = new int[1000];
	public static void fuck(int n)
	{

		int i = 0;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (used[i] == 0 && n % i == 0)
			{
				int j = 0;
				for (j = 0;j <= i - 1;j++)
				{
					used[j] = 1;
				}
				times++;
				fuck(n / i);
				for (j = 0;j <= i - 1;j++)
				{
					used[j] = 0;
				}
			}
		}
	}
	public static int Main()
	{
		int n = 0;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		for (i = 0;i < n;i++)
		{
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		fuck(num);
		System.out.print(times);
		System.out.print("\n");
		times = 1;
		int k = 0;
		for (k = 0;k <= 999;k++)
		{
		used[k] = 0;
		}
		}
		return 0;
	}
}

