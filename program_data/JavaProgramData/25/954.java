package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] num = new int[40];
		int i;
		int j;
		int x = 0;
		int t;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			num[0] = 1;
			for (i = 0; i < N; i++)
			{
				for (j = 0; j < 40; j++)
				{
					t = x;
					x = num[j] * 2 / 10;
					num[j] = num[j] * 2 % 10 + t;
				}
			}
			i = 39;
			while (num[i] == 0)
			{
				i--;
			}
			for (; i >= 0; i--)
			{
				System.out.print(num[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

