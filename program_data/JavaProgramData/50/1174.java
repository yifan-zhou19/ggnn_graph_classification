package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int x = 12;
		int[][] k = new int[12][1];
		int j;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < 12;i++)
		{
			x = x + m[i];
			j = x % 7;
			if (w + j == 5 || w + j - 7 == 5)
			{
				k[i][0] = 1;
			}
		}
		for (i = 0;i < 12;i++)
		{
			if (k[i][0] != 0)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}




}

