package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] c = new char[450][50];
		int[] sum = new int[450];
		int[] b = new int[450];


		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			c[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = String.valueOf(c[i]).length();
		}
		sum[0] = b[0] + 1;
		sum[1] = sum[0] + b[1] + 1;
		System.out.print(c[0]);
		System.out.print(" ");
		for (int i = 1;i < n;i++)
		{
			sum[i] = sum[i - 1] + b[i] + 1;
			sum[i + 1] = sum[i] + b[i + 1] + 1;

			if (sum[i] > 81 && sum[i - 1] <= 81)
			{
				System.out.print("\n");
				System.out.print(c[i]);
				System.out.print(" ");
				sum[i] = b[i] + 1;
			}
			else if (sum[i] <= 81 && sum[i + 1]>81)
			{
				System.out.print(c[i]);
			}
			else if (i == n - 1)
			{
				System.out.print(c[i]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(c[i]);
				System.out.print(" ");
			}
		}

		 return 0;


	}

}

