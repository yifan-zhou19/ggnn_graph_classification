package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[36];

	public static void mult()
	{
		int i;
		for (i = 0;i < 35;i++)
		{
			num[i] = num[i] * 2;
		}
		for (i = 0;i < 35;i++)
		{
			num[i + 1] = num[i + 1] + num[i] / 10;
			num[i] = num[i] % 10;
		}
	}

	public static int Main()
	{
		num[0] = 1;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			mult();
		}
		int flag = 0;
		for (i = 35;i >= 0;i--)
		{
			if (num[i] != 0)
			{
				flag = 1;
			}
			if (flag == 1)
			{
				System.out.print(num[i]);
			}
		}
		return 0;
	}
}

