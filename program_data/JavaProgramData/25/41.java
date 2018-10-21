package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[35];
		a[1] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(a[1]);
			System.out.print("\n");
		}
		else
		{
			for (i = 1;i <= n;i++)
			{
				int[] flag = new int[35];
				for (j = 1; ;j++)
				{
					if (a[j] * 2 <= 8)
					{
						a[j] = a[j] * 2 + flag[j - 1];
						if (a[j + 1] == 0 && a[j + 2] == 0 && a[j + 3] == 0)
						{
							break;
						}
					}
					else if (a[j] * 2 >= 10)
					{
						a[j] = a[j] * 2 - 10 + flag[j - 1];
						flag[j] = 1;
						if (a[j + 1] == 0 && a[j + 2] == 0 && a[j + 3] == 0)
						{
							flag[j] = 0;
							a[j + 1] = 1;
							break;
						}
					}
				}
			}
			if (a[j + 1] == 1)
			{
				System.out.print(a[j + 1]);
			}
			for (i = j;i >= 1;i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

