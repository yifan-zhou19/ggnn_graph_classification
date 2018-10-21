import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int t;
		int[][] p = new int[10000][2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		char[][] num = new char[100][100];
		for (int i = 0;i < n;i++)
		{
			num[i] = new Scanner(System.in).nextLine();
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k = 0;
		while (k < m - 1)
		{
			t = 0;
			for (int x = 0;x < n;x++)
			{
				for (int y = 0;y < n;y++)
				{
					if (num[x][y] == '@')
					{
						p[t][0] = x;
						p[t++][1] = y;
					}
				}
			}
			for (int x = 0;x < t;x++)
			{
				int i = p[x][0];
				int j = p[x][1];
						if (num[i - 1][j] == '.' && (i - 1) >= 0)
						{
							num[i - 1][j] = '@';
						}
						if (num[i + 1][j] == '.' && (i + 1) < n)
						{
							num[i + 1][j] = '@';
						}
						if (num[i][j - 1] == '.' && (j - 1) >= 0)
						{
							num[i][j - 1] = '@';
						}
						if (num[i][j + 1] == '.' && (j + 1) < n)
						{
							num[i][j + 1] = '@';
						}

			}
			k++;
		}
		 int cnt = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (num[i][j] == '@')
				{
					cnt++;
				}
			}
		}
		System.out.print(cnt);
		return 0;
	}

}

