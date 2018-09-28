package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[1000][40];
		int[] b = new int[1000];
		int[] sum = new int[1000];
		for (i = 0 ; i < n ; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = String.valueOf(a[i]).length();
			sum[i] = 0;

		}
		for (i = 1 ; i < n ; i++)
		{
			sum[i] = sum[i - 1] + b[i - 1] + 1;
			sum[i + 1] = sum[i] + b[i] + 1;
			if (sum[i] < 81 && sum[i + 1] <= 81)
			{
				System.out.print(a[i - 1]);
				System.out.print(" ");
			}
			else if (sum[i] <= 81 && sum[i + 1] > 81)
			{
				System.out.print(a[i - 1]);
				System.out.print("\n");
				sum[i] = 0;
			}

		}
		System.out.print(a[n - 1]);
		System.out.print("\n");
	}
}

