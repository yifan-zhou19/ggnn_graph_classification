package <missing>;

public class GlobalMembers
{
	public static int K(int i,int j)
	{
		int m = 1;
		for (int k = 0;k < j;k++)
		{
			m = m * i;
		}
		return m;
	}
	public static int Main()
	{
		int x;
		int y;
		int[] q = new int[10];
		int[] w = new int[10];
		int g = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 10;i++)
		{
			q[i] = x / K(2, i);
			for (int j = 0;j < 10;j++)
			{
				w[j] = y / K(2, j);
				if (q[i] == w[j])
				{
					System.out.print(q[i]);
					g = 1;
					break;
				}
			}
			if (g == 1)
			{
				break;
			}
		}
		return 0;
	}
}

