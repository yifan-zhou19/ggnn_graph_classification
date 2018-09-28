package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
		}
		else
		{
			a[0] = 2;
			for (int i = 1;i < n;i++)
			{
				for (int j = 0;j < 100;j++)
				{
					a[j] *= 2;
				}
				for (int j = 0;j < 100;j++)
				{
					if (a[j] >= 10)
					{
						a[j + 1] += 1;
						a[j] %= 10;
					}
				}
			}
			int k = 99;
			while (a[k] == 0)
			{
				k--;
			}
			while (k >= 0)
			{
				System.out.print(a[k--]);
			}
		}
		return 0;
	}
}

