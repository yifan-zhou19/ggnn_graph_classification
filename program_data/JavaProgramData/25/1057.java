package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int wei;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= 99;i++)
		{
			a[i] = 0;
		}
		a[0] = 2;
		if (n >= 2)
		{
			for (int i = 1;i < n;i++)
			{
				for (int j = 0;j <= 99;j++)
				{
					a[j] = 2 * a[j];
				}
				for (int j = 0;j <= 99;j++)
				{
					if (a[j] >= 10)
					{
						a[j + 1]++;
						a[j] = a[j] - 10;
					}
				}
			}
			for (int i = 99;i >= 0;i--)
			{
				if (a[i] != 0)
				{
					wei = i;
					break;
				}
			}
			for (int i = wei;i >= 0;i--)
			{
				System.out.print(a[i]);
			}
		}
		else if (n == 1)
		{
			System.out.print("2");
		}
		else if (n == 0)
		{
			System.out.print("1");
		}
		return 0;
	}
}

