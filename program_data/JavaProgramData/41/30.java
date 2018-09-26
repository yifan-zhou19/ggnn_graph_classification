package <missing>;

public class GlobalMembers
{
	public static int[] hash = new int[6];
	public static int[] rank = new int[6];
	public static int[] ans = new int[6];
	public static int[] flag = new int[6];

	public static void find(int n)
	{
		if (n == 6)
		{
			int sign = 1;

			flag[1] = (rank[5] == 1);
			flag[2] = (rank[2] == 1) || (rank[2] == 2);
			flag[3] = (rank[1] == 5);
			flag[4] = (rank[3] != 1);
			flag[5] = (rank[4] == 1);

			for (int i = 1; i <= 5; i++)
			{
				if (rank[i] > 2)
				{
					flag[i] ^= 1;
				}
				sign = sign & flag[i];
			}

			if (sign != 0)
			{
				for (int i = 1; i <= 5; i++)
				{
					ans[i] = rank[i];
				}
			}

			return;
		}

		for (int i = 1; i <= 5; i++)
		{
			if (hash[i] == 0)
			{
			hash[i] = 1;
			rank[n] = i;

			if ((n != 5) || ((n == 5) && (i != 2) && (i != 3)))
			{
				find(n + 1);
			}

			hash[i] = 0;
			rank[n] = 0;
			}
		}
	}

	public static int Main()
	{
		find(1);
		System.out.print(ans[1]);
		for (int i = 2; i <= 5; i++)
		{
			System.out.print(' ');
			System.out.print(ans[i]);
		}
	}


}
