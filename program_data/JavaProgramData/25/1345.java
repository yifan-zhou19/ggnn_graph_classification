package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[1000];
		num[999] = 1;
		for (int i = 1 ; i <= N ; i++)
		{
			for (int j = 999 ; j >= 1 ; j--)
			{
				num[j] *= 2;
			}
			for (int j = 999 ; j >= 1 ; j--)
			{
				num[j - 1] += num[j] / 10;
				num[j] = num[j] % 10;
			}
		}
		int b = 0;
		while (num[b] == 0)
		{
			  b++;
		}
		for (; b <= 999 ; b++)
		{
			System.out.print(num[b]);
		}

		return 0;
	}
}

