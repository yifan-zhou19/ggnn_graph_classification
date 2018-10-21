package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int weight;
		char[] name = {'z', 'q', 's', 'l'};
		for (int i = 1 ; i <= 5 ; i++)
		{
			for (int j = 1 ; j <= 5 ; j++)
			{
				if (j == i)
				{
					continue;
				}
				for (int k = 1 ; k <= 5 ; k++)
				{
					if (k == i || k == j)
					{
						continue;
					}
					for (int l = 1 ; l <= 5 ; l++)
					{
						if (l == i || l == j || l == k)
						{
							continue;
						}
						if ((i + j) == (k + l) && (i + l) > (j + k) && (i + k) < j)
						{
							for (int m = 5 ; m >= 1 ; m--)
							{
								if (i == m)
								{
									System.out.print("z ");
									System.out.print(10 * m);
									System.out.print("\n");
								}
								if (j == m)
								{
									System.out.print("q ");
									System.out.print(10 * m);
									System.out.print("\n");
								}
								if (k == m)
								{
									System.out.print("s ");
									System.out.print(10 * m);
									System.out.print("\n");
								}
								if (l == m)
								{
									System.out.print("l ");
									System.out.print(10 * m);
									System.out.print("\n");
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
