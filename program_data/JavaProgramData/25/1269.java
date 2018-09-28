package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = new int[100];
		int n;
		int m = 0;
		int j;
		int count = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else if (n == 1)
		{
			System.out.print("2");
			System.out.print("\n");
		}
		else
		{
			for (int i = 1;i < n;i++)
			{
				m = 0;
				for (j = 0;j < count;j++)
				{
					b[j] = a[j] * 2;
					if (m == 1)
					{
						b[j]++;
					}
					if (b[j] >= 10)
					{
						b[j] = b[j] - 10;
						m = 1;
					}
					else
					{
						m = 0;
					}
				}
				if (m == 1)
				{
					a[j] = 1;
					count++;
				}
				for (int i = 0;i < j;i++)
				{
					a[i] = b[i];
				}
			}
			if (a[j] != 0)
			{
				for (int i = j;i >= 0;i--)
				{
					System.out.print(a[i]);
				}
			}
			else
			{
				for (int i = j - 1;i >= 0;i--)
				{
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}

}

