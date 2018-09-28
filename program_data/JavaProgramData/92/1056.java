package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		void move(int x[],int y);
		void list(int x[],int y);
		while (true)
		{
			int t;
			int j;
			int i;
			int max;
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (t != 0)
			{
				for (i = 0;i <= t - 1;i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (i = 0;i <= t - 1;i++)
				{
					b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				list(a, t);
				list(b, t);
				for (j = 0;j <= (t - 1) / 2;j++)
				{
					int money = 0;
					for (i = 0;i <= t - 1;i++)
					{
						if (a[i] < b[i])
						{
							money--;
						}
						if (a[i] > b[i])
						{
							money++;
						}
					}
					if (j == 0)
					{
						max = money;
					}
					if (max < money)
					{
						max = money;
					}
					move(a, t - 1);
				}
				System.out.print(max * 200);
				System.out.print("\n");
			}
			else
			{
				return 0;
			}
		}
	}

	public static void move(int[] x, int y)
	{
		int temp;
		int i;
		temp = x[y];
		for (i = y - 1;i >= 0;i--)
		{
			x[i + 1] = x[i];
		}
		x[0] = temp;
	}
	public static void list(int[] x, int y)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i <= y - 1;i++)
		{
			for (j = i;j <= y - 1;j++)
			{
				if (x[i] < x[j])
				{
					temp = x[j];
					x[j] = x[i];
					x[i] = temp;
				}
			}
		}
	}

}

