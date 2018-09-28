package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			char[][] a = new char[100][10000];
			int t;
			int i;
			int j;
			int k;
			int n;
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			for (i = 0;i < t;i++)
			{
				a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
				for (i = 0;i < t;i++)
				{
					for (j = 0;a[i][j] != '\0';j++)
					{
						n = 0;
						for (k = 0;a[i][k] != '\0';k++)
						{
							if (a[i][j] == a[i][k])
							{
								n++;
							}
						}
					if (n == 1)
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
					break;
					}
					}
			if (n > 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
				}
			return 0;
	}
}

