package <missing>;

public class GlobalMembers
{
	/*
	 *????????.cpp
	 *?????
	 *????: 2012-11-25
	 *???????????????
	 */


	public static int b;
	public static int j;
	public static int[] f = new int[1010];

	public static void factorization(int x)
	{
		int now;
		int i;
		for (i = 2; i <= x; i++)
		{
			if (x % i == 0 && i >= f[j])
			{
				f[++j] = i;
				now = x / i;
				if (now == 1)
				{
					b++;
				}
				else
				{
					factorization(now);
				}
				j--;
			}
		}
		return;
	}
	public static int Main()
	{
		int n;
		int i;
		int num;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			b = 0;
			j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(f, 0, (Integer.SIZE / Byte.SIZE));
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			factorization(num);
			System.out.print(b);
			System.out.print("\n");
		}
		return 0;
	}

}

