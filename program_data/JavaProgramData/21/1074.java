package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[310];
	public static int Main()
	{
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + num[i];
		}

		double ave = sum / (n * 1.0);
		double[] away = new double[310];

		int use;

		for (int i = 1;i <= n;i++)
		{
			away[i] = Math.abs(num[i] * 1.0 - ave);
		}

		double use2;
		for (int i = 1;i <= n - 1;i++)
		{
			for (int j = 1;j <= n - i;j++)
			{
				if (away[j] < away[j + 1])
				{
					use2 = away[j];
					away[j] = away[j + 1];
					away[j + 1] = use2;
				  use = num[j];
				  num[j] = num[j + 1];
				  num[j + 1] = use;
				}
			}
		}

		int m;
		for (int i = 1;i <= n;i++)
		{
			if (away[i + 1] != away[i])
			{
				  m = i;
				  break;
			}
		}

		for (int i = 1;i <= m - 1;i++)
		{
			for (int j = 1;j <= m - i;j++)
			{
				if (num[j] > num[j + 1])
				{
					use = num[j];
					num[j] = num[j + 1];
					num[j + 1] = use;
				}
			}
		}

		for (int i = 1;i <= m - 1;i++)
		{
			System.out.print(num[i]);
			System.out.print(",");
		}
		System.out.print(num[m]);


		return 0;
	}


}

