package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int n;
		int i;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[499] = 1;
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 499 ; j >= 0 ; j--)
			{
				a[j] *= 2;

			}
			for (j = 499 ; j >= 1 ; j--)
			{
				a[j - 1] += a[j] / 10;
				a[j] = a[j] % 10;
			}

			a[0] = a[0] % 10;
		}
		for (i = 0 ; i <= 499 ; i++)
		{
			if (flag == 0)
			{
				if (a[i] != 0)
				{
					flag = 1;
					System.out.print(a[i]);
				}
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

