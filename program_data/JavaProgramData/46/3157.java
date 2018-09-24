package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] n = new int[a][b];
		int s = 0;
		int e = b - 1;
		int p = 0;
		int q = a - 1;
		for (int i = 0;i < a;i++)
		{
			for (int j = 0;j < b;j++)
			{
				n[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		if (s == e)
		{
					for (int i = p;i <= q;i++)
					{
						System.out.print(n[i][0]);
						System.out.print("\n");
					}
		}
				else if (p == q)
				{
					for (int i = s;i <= e;i++)
					{
					System.out.print(n[0][i]);
					System.out.print("\n");
					}
				}


		while (s < e && p < q)
		{
			for (int i = s;i < e;i++)
			{
				System.out.print(n[p][i]);
				System.out.print("\n");

			}

			for (int i = p;i < q;i++)
			{
							System.out.print(n[i][e]);
							System.out.print("\n");
			}
			for (int i = e;i > s;i--)
			{
							System.out.print(n[q][i]);
							System.out.print("\n");
			}
			for (int i = q;i > p;i--)
			{
							System.out.print(n[i][s]);
							System.out.print("\n");
			}
			s++;
			e--;
			p++;
			q--;
		if (s == e)
		{
			for (int i = p;i <= q;i++)
			{
				System.out.print(n[i][s]);
				System.out.print("\n");
			}
		break;
		}
		if (p == q)
		{
			for (int i = s;i <= e;i++)

			{
				System.out.print(n[p][i]);
				System.out.print("\n");
			}
		break;
		}

		}


		return 0;

	}

}

