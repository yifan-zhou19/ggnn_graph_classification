package <missing>;

public class GlobalMembers
{
	public static void arrange(int[] arrangearry, int nt, int kd_order)
	{
		int flagi;
		int flagj;
		int temporary;
		if (kd_order == 1)
		{
			for (flagi = nt - 1;flagi > 0;flagi--)
			{
				for (flagj = 0;flagj < flagi;flagj++)
				{
					if (arrangearry[flagj] < arrangearry[flagj + 1])
					{
						temporary = arrangearry[flagj];
						arrangearry[flagj] = arrangearry[flagj + 1];
						arrangearry[flagj + 1] = temporary;
					}
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int[] ss = new int[100];
		int[] sz = new int[100];
		int i;
		int j = 0;
		int[] h = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			ss[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sz[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (ss[i] >= 90 && ss[i] <= 140 && sz[i] >= 60 && sz[i] <= 90)
			{
				h[j]++;
			}
			else
			{
				j++;
			}
		}
		arrange(h, 100, 1);
		System.out.print(h[0]);
		return 0;
	}
}

