package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[1001][1001];
		int s = 0;
		int[] p = new int[1001];
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = a;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
		if (*(p[i] + j) == 0)
		{
					if ((*(p[i] + j + 1) == 0) && (*(p[i + 1] + j) == 0))
					{
						x1 = i;
						y1 = j;
					}
					if ((*(p[i] + j - 1) == 0) && (*(p[i - 1] + j) == 0))
					{
						x2 = i;
						y2 = j;
					}
		}
		}
		}
		s = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}

