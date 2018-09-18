package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int[][] a = new int[101][101];
	public static int sum = 0;
	public static int k = 0;
	public static int[] p = a;
	public static void zerorow(int k)
	{
		int min = 0;
		for (int i = 0; i < k; i++) //every row
		{
			min = (p[i]);
			for (int j = 1; j < k; j++) //find min
			{
				if (*(p[i] + j) < min)
				{
					min = (p[i] + j);
				}
			}
			if (min != 0)
			{
				for (int j = 0; j < k; j++) //to zero
				{
					*(p[i] + j) -= min;
				}
			}
		}
	}
	public static void zerocol(int k)
	{
		int min = 0;
		for (int i = 0; i < k; i++) //every col
		{
			min = (p[0] + i);
			for (int j = 1; j < k; j++) //find min
			{
				if (*(p[j] + i) < min)
				{
					min = (p[j] + i);
				}
			}
			if (min != 0)
			{
				for (int j = 0; j < k; j++) //to zero
				{
					*(p[j] + i) -= min;
				}
			}
		}
	}
	public static void jian(int k)
	{
		for (int i = 2; i < k; i++) //row move up
		{
			for (int j = 0; j < k; j++)
			{
				*(p[i - 1] + j) = *(p[i] + j);
			}
		}
		for (int j = 2; j < n; j++) //col move left
		{
			for (int i = 0; i < k - 1; i++)
			{
				*(p[i] + j - 1) = *(p[i] + j);
			}
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((*(p = ConsoleInput.readToWhiteSpace(true)[0].length() > 0)
		{
			sum = 0;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (i + j != 0)
					{
						*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
					}
				}
			}
			for (k = n; k > 1; k--)
			{
				zerorow(k);
				zerocol(k);
				sum += *(p[1] + 1);
				jian(k);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

