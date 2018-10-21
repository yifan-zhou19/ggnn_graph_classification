package <missing>;

public class GlobalMembers
{
	public static int[] aa = new int[20];

	public static int Main()
	{
		//freopen("1.in","r",stdin);
		//freopen("1.out","w",stdout);
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (int i = 0;i < m;i++)
				{
				  aa[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				if (m == 0)
				{
						 System.out.print("60");
						 System.out.print("\n");
						 continue;
				}
				for (int j = 0;j < m;j++)
				{
						if ((aa[j] + 3 * j) >= 57 && (aa[j] + 3 * j) <= 60)
						{
							System.out.print(aa[j]);
							System.out.print("\n");
							break;
						}
						if ((aa[j] + 3 * j) > 60)
						{
										  int x = 60 - 3 * j;
										  System.out.print(x);
										  System.out.print("\n");
										  break;
						}
						else if (j == m - 1)
						{
							System.out.print(60 - 3 * m);
							System.out.print("\n");
							break;
						}
				}

		}
		return 0;
	}

}

