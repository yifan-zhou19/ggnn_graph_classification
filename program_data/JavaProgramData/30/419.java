package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int[] b = new int[100];
		int sum = 0;
		int sum1 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[100][2];
		for (i = 0;i <= n - 1;i++)
		{
			a[i][1] = ((i + 1) % 10) + '0';
			a[i][0] = (i + 1 - (i + 1) % 10) / 10 + '0';
			if ((i + 1) % 7 == 0)
			{
				b[m] = i + 1;
				m++;
			}
			else if ((a[i][0] == '7') || (a[i][1] == '7'))
			{
				b[m] = i + 1;
				m++;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			sum = sum + (i + 1) * (i + 1);
		}
		for (i = 0;i <= m - 1;i++)
		{
			sum1 = sum1 + b[i] * b[i];
		}
		System.out.print(sum - sum1);
		return 0;
	}
}

