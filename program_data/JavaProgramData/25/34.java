package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] num = new int[100];
	public static void multi()
	{
		int pos = 0;
		int step;
		while (num[pos] == 0)
		{
			pos++;
		}
		for (int i = 99; i >= pos; i--)
		{
			num[i] *= 2;
		}
		for (int i = 99; i >= pos; i--)
		{
			if (num[i] >= 10)
			{
				step = num[i] / 10;
				num[i - 1] += step;
				num[i] = num[i] % 10;
			}
		}
	}
	public static int Main()
	{
		int p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num, 0, 100);
			num[99] = 2;
			for (int i = 1; i < n; i++)
			{
				multi();
			}
			while (num[p] == 0)
			{
				p++;
			}
			for (; p < 100; p++)
			{
				System.out.print(num[p]);
			}
		}
		return 0;
	}
}

