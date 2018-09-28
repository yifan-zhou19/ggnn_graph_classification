package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int c;
		int g;
		String a = new String(new char[550]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = a.length();
		for (i = 2;i <= c;i++)
		{
			for (j = 0;j < c - i + 1;j++)
			{
				g = 0;
				if (a.charAt(j) == a.charAt(j + i - 1))
				{
					if (i == 2)
					{
						System.out.print(a.charAt(j));
						System.out.print(a.charAt(j + i - 1));
						System.out.print("\n");
					}
					else if (i % 2 == 0 && i != 2)
					{
						for (k = 1;k <= (i - 2) / 2;k++)
						{
						if (a.charAt(j + k) == a.charAt(j + i - 1 - k))
						{
							g++;
						}
						}
						if (g == k - 1)
						{
							for (m = j;m < j + i - 1;m++)
							{
								System.out.print(a.charAt(m));
							}
							System.out.print(a.charAt(m));
							System.out.print("\n");
						}
					}
					if (i == 3)
					{
						System.out.print(a.charAt(j));
						System.out.print(a.charAt(j + 1));
						System.out.print(a.charAt(j + 2));
						System.out.print("\n");
					}
					else if (i % 2 != 0)
					{
						for (k = 1;k < (i - 1) / 2;k++)
						{
							if (a.charAt(j + k) == a.charAt(j + i - 1 - k))
							{
								g++;
							}
						}
						if (g == k - 1)
						{
							for (m = j;m < j + i - 1;m++)
							{
								System.out.print(a.charAt(m));
							}
							System.out.print(a.charAt(m));
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}

