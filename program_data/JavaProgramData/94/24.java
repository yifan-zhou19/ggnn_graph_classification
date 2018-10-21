package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[501];
		int[] b = new int[501];
		for (int i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 1,k = 0; j <= n; j++)
		{
			if (a[j] % 2 != 0)
			{
				k++;
				b[k] = a[j];
				x++;
			}
		}
		for (int m = 1; m <= x;m++)
		{
			for (int h = 1; h <= x - m; h++)
			{
				int temp;
					 if (b[h] > b[h + 1])
					 {
					temp = b[h];
					b[h] = b[h + 1];
					b[h + 1] = temp;
					 }
			}
		}
		int sign = 0;
		for (int h = 1;h <= x; h++)
		{
			if (sign == 0)
			{
				System.out.print(b[h]);
				sign++;
			}
			else
			{
				System.out.print(",");
				System.out.print(b[h]);
			}
		}
		return 0;
	}
}

