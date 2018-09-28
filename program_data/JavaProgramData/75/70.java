package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1001][2];
		int i;
		int j;
		int count;
		int n;
		int num = 0;
		char c = ',';
		for (i = 1;c == ',';i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		n = i - 1;
		a[1][1] = c - '0';
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (c != ',')
		{
			a[1][1] = a[1][1] * 10 + c - '0';
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 2;i <= n - 1;i++)
		{
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		a[n][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int min;
		int max;
		min = a[1][0];
		max = a[1][1];
		for (i = 2;i <= n;i++)
		{
			if (a[i][0] < min)
			{
				min = a[i][0];
			}
			if (a[i][1] > max)
			{
				max = a[i][1];
			}
		}
		for (i = min; i <= max - 1;i++)
		{
			count = 0;
			for (j = 1;j <= n;j++)
			{
				if (i >= a[j][0] != 0 && i < a[j][1])
				{
					count++;
				}
			}
			if (count > num)
			{
				num = count;
			}
		}

		System.out.print(n);
		System.out.print(" ");
		System.out.print(num);
		return 0;
	}

}

