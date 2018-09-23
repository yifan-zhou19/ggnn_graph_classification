package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int C = 0;
		char[] d = {'0', '0', '0', '0'};
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0;i <= 2;i++)
		{
			for (j = 0;j <= 2;j++)
			{
					if (i == j)
					{
						continue;
					}
					for (k = 0;k <= 2;k++)
					{
						if (i == k || j == k)
						{
							continue;
						}
						A = (j > i);
						B = (i > j) + (i > k);
						C = (k > j) + (j > i);
						if ((A == (2 - i)) && (B == (2 - j)) && (C == (2 - k)))
						{
							d[i] = 'A';
							d[j] = 'B';
							d[k] = 'C';
						}
					}
			}
		}
		for (i = 0;i <= 2;i++)
		{
			System.out.print(d[i]);
		}
		return 0;
	}
}
