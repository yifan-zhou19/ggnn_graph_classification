package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int n;
		int m;
		int i;
		int count = 0;
		int zong = 0;
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0 && m == 0)
			{
				break;
			}
			for (i = 1; i <= n; i++)
			{
				a[i] = 1;
			}
			i = 1;
			while (true)
			{
				if (a[i] == 1)
				{
					count++;
					if (zong == n - 1)
					{
						System.out.print(i);
						System.out.print("\n");
						count = 0;
						zong = 0;
						break;
					}
					if (count == m)
					{
						zong++;
						a[i] = 0;
						count = 0;
						if (i < n)
						{
							i++;
						}
						else if (i == n)
						{
								i = 1;
						}
					}
					else
					{
						if (i < n)
						{
							i++;
						}
						else if (i == n)
						{
								i = 1;
						}
					}
				}
				else if (i == n)
				{
					i = 1;
				}
					 else
					 {
						i++;
					 }
			}
		}
		return 0;
	}

}

