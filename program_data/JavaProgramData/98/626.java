package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][42];
		int n;
		int i;
		int sum = 0;
		int len;
		int k = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(a[i]).length();
			if (sum < 80 && sum + len>80)
			{
				for (j = k;j < i - 1;j++)
				{
					System.out.print(a[j]);
					System.out.print(" ");
				}
				System.out.print(a[j]);
				System.out.print("\n");
				sum = 0;
				k = i;
				sum = sum + len + 1;
			}
			else
			{
				sum = sum + len + 1;
			}
			if (sum == 80 || sum == 81)
			{
				for (j = k;j <= i - 1;j++)
				{
					System.out.print(a[j]);
					System.out.print(" ");
				}
				System.out.print(a[j]);
				System.out.print("\n");
				sum = 0;
				k = i + 1;
			}

		}
		for (i = k;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		System.out.print("\n");
		return 0;
	}
}

