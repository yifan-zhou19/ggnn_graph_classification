package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] juzhen = new int[20][20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
						for (j = 0;j < n;j++)
						{
										juzhen[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
										System.out.print("\n");
						}
		} //????
		for (i = 0;i < m;i++)
		{
						for (j = 0;j < n;j++)
						{
										if (i == 0 && j == 0)
										{
													  if (juzhen[i][j] >= juzhen[i + 1][j] != 0 && juzhen[i][j] >= juzhen[i][j + 1])
													  {
													  System.out.print(i);
													  System.out.print(" ");
													  System.out.print(j);
													  System.out.print("\n");
													  }
										}
										else if (i == 0 && j == n - 1)
										{
											 if (juzhen[i][j] >= juzhen[i][j - 1] != 0 && juzhen[i][j] >= juzhen[i + 1][j])
											 {
											 System.out.print(i);
											 System.out.print(" ");
											 System.out.print(j);
											 System.out.print("\n");
											 }
										}
										else if (i == m - 1 && j == 0)
										{
													  if (juzhen[i][j] >= juzhen[i - 1][j] != 0 && juzhen[i][j] >= juzhen[i][j + 1])
													  {
													  System.out.print(i);
													  System.out.print(" ");
													  System.out.print(j);
													  System.out.print("\n");
													  }
										}
										else if (i == m - 1 && j == n - 1)
										{
											 if (juzhen[i][j] >= juzhen[i][j - 1] != 0 && juzhen[i][j] >= juzhen[i - 1][j])
											 {
											 System.out.print(i);
											 System.out.print(" ");
											 System.out.print(j);
											 System.out.print("\n");
											 }
										} //??????
										else if (i == 0)
										{
											 if (juzhen[i][j] >= juzhen[i][j - 1] != 0 && juzhen[i][j] >= juzhen[i][j + 1] != 0 && juzhen[i][j] >= juzhen[i + 1][j])
											 {
											 System.out.print(i);
											 System.out.print(" ");
											 System.out.print(j);
											 System.out.print("\n");
											 }
										}
										else if (i == m - 1)
										{
											 if (juzhen[i][j] >= juzhen[i][j - 1] != 0 && juzhen[i][j] >= juzhen[i][j + 1] != 0 && juzhen[i][j] >= juzhen[i - 1][j])
											 {
											 System.out.print(i);
											 System.out.print(" ");
											 System.out.print(j);
											 System.out.print("\n");
											 }
										}
										else if (j == 0)
										{
											 if (juzhen[i][j] >= juzhen[i][j + 1] != 0 && juzhen[i][j] >= juzhen[i - 1][j] != 0 && juzhen[i][j] >= juzhen[i + 1][j])
											 {
											 System.out.print(i);
											 System.out.print(" ");
											 System.out.print(j);
											 System.out.print("\n");
											 }
										}
										else if (j == n - 1)
										{
											 if (juzhen[i][j] >= juzhen[i][j - 1] != 0 && juzhen[i][j] >= juzhen[i - 1][j] != 0 && juzhen[i][j] >= juzhen[i + 1][j])
											 {
											 System.out.print(i);
											 System.out.print(" ");
											 System.out.print(j);
											 System.out.print("\n");
											 }
										} //????
										else
										{
											if (juzhen[i][j] >= juzhen[i][j - 1] != 0 && juzhen[i][j] >= juzhen[i][j + 1] != 0 && juzhen[i][j] >= juzhen[i - 1][j] != 0 && juzhen[i][j] >= juzhen[i + 1][j])
											{
											 System.out.print(i);
											 System.out.print(" ");
											 System.out.print(j);
											 System.out.print("\n");
											}
										} //??????
						}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	return 0;
	}
}

