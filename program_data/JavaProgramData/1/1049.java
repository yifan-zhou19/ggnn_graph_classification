package <missing>;

public class GlobalMembers
{
	public static int[] sum = new int[50];
	public static int i;

	public static int Main()
	{
		void digui(int x, int y);
		int n;
		int[] j = new int[50];
		int[] m = new int[50];


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			sum[i] = 0;
			for (j[i] = 2;j[i] * j[i] <= m[i];j[i]++)
			{
				if (m[i] % j[i] == 0)
				{
					sum[i]++;
					digui(j[i], m[i] / j[i]);
				}
			}
			System.out.printf("%d\n",sum[i] + 1);
		}

		return 0;
	}

	public static void digui(int x, int y)
	{
		int s;
		for (s = x; s * s <= y; s++)
		{
			if (y % s == 0)
			{
				sum[i]++;
				digui(s, y / s);
			}
		}
	}

}

