package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[200];
		int[] a = new int[200];
		int[] b = new int[200];
		int n;
		int i;
		int j;
		int k;
		int t;
		int sum;
		int[][] m =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			sum = 0;
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year[i] % 4 == 0 && year[i] % 100 != 0) || year[i] % 400 == 0)
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
			if (a[i] > b[i])
			{
				t = a[i];
				a[i] = b[i];
				b[i] = t;
			}
			for (j = a[i] - 1;j < b[i] - 1;j++)
			{
				sum = sum + m[k][j];
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}


		return 0;
	}


}

