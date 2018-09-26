package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		char[][] c = new char[110][1009];
		int[][] mark = new int[110][300];
		int[] flag = new int[110];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < t;i++)
		{
			c[i] = new Scanner(System.in).nextLine();

		}
		for (int i = 0;i < t;i++)
		{
			for (int j = 0;j < String.valueOf(c[i]).length();j++)
			{
				mark[i][c[i][j] - 'a']++;
			}
			for (int x = 0;x < String.valueOf(c[i]).length();x++)
			{
				if (mark[i][c[i][x] - 'a'] == 1)
				{

					System.out.print(c[i][x]);
					System.out.print("\n");
					flag[i] = 1;
					break;
				}
			}
			if (flag[i] == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}

		return 0;

	}
}

