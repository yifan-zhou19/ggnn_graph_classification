package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[50];
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int n = 40;
		int i;
		x[0] = 1;
		for (i = 1;i < n;i++)
		{
								x[i] = 0;
		} //????
		for (int r = 0;r < m;r++)
		{
			for (i = 0;i < n;i++)
			{
							x[i] *= 2;
			}
			/*==================================*/
			for (i = 0;i < n;i++)
			{
							if (x[i] >= 10)
							{
										x[i + 1] += x[i] / 10;
										x[i] = x[i] % 10;
							} //??
			}
		}
		int max; //????????
		for (max = n - 1;max > 0;max--)
		{
								if (x[max] != 0)
								{
								break;
								}
		}
		for (i = max;i >= 0;i--)
		{
			System.out.print(x[i]);
		}
		return 0;
	}




}

