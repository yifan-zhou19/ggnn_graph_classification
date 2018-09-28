package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int[] a = new int[100];
		int sum_a = 0;
		int sum_n = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n > 0 && n < 100)
		{
			for (i = 1;i <= n;i++)
			{
					{
						if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7)
						{
					a[i] = i;
						}
				else
				{
					a[i] = 0;
				}
				}
					sum_a = sum_a + a[i] * a[i];
			}
			for (i = 1;i <= n;i++)
			{
				sum_n = sum_n + i * i;
			}
			sum = sum_n - sum_a;
			System.out.print(sum);
		}
		return 0;
	}


}

