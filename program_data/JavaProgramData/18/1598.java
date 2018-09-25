package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int rec;
	public static int sum;
	public static int[][] x = new int[150][150];

	public static void F()
	{
		int p;
		int q;
		int min;
		for (p = 1;p <= rec;p++)
		{
			min = (*(*(x + p) + 1));
			for (q = 1;q <= rec;q++)
			{
				min = ((*(*(x + p) + q)) < min) ? (*(*(x + p) + q)) : min;
			}
			for (q = 1;q <= rec;q++)
			{
				(*(*(x + p) + q)) -= min;
			}
		}
		for (p = 1;p <= rec;p++)
		{
			min = (*(*(x + 1) + p));
			for (q = 1;q <= rec;q++)
			{
				min = ((*(*(x + q) + p)) < min) ? (*(*(x + q) + p)) : min;
			}
			for (q = 1;q <= rec;q++)
			{
				(*(*(x + q) + p)) -= min;
			}
		}
		sum += (*(*(x + 2) + 2));
		for (p = 2;p < rec;p++)
		{
			(*(*(x + 1) + p)) = (*(*(x + 1) + p + 1));
		}
		for (p = 2;p < rec;p++)
		{
			(*(*(x + p) + 1)) = (*(*(x + p + 1) + 1));
		}
		for (p = 2;p < rec;p++)
		{
			for (q = 2;q < rec;q++)
			{
				(*(*(x + p) + q)) = (*(*(x + p + 1) + q + 1));
			}
		}
		return;
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
			rec = n;
			sum = 0;
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					(*(*(x + i) + j)) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			while (rec > 1)
			{
				F();
				rec--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

