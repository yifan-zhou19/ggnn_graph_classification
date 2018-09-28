package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[550]);
		int i;
		int j;
		int k;
		int t;
		int m;
		int n;
		i = 0;
		while (cin.get(a.charAt(i)))
		{
			if (a.charAt(i) == '\n')
			{
				t = i - 1;
				break;
			}
			else
			{
				i++;
			}
		}
		t = i - 1;
		for (j = 1;j < (t + 1) / 2;j++)
		{
			for (i = 0;i < t;i++)
			{
				m = 0;
				for (k = 0;k < j;k++)
				{
					if (i + 2 * j - k - 1 <= t)
					{
						if (a.charAt(i + k) == a.charAt(i + 2 * j - k - 1))
						{
							m++;
						}
					}
				}
				if (m == j)
				{
					for (n = i;n < i + 2 * j;n++)
					{
						System.out.print(a.charAt(n));
					}
					System.out.print("\n");
				}
			}
		}

		return 0;
	}





}
