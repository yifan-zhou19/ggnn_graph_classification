import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char temp = '@';
	public static int Main()
	{
		int n;
		int m;
		char[][] map = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int i;
		int j;
		int k;
		int[] x = {0, 0, 1, -1};
		int[] y = {1, -1, 0, 0};
		for (i = 0;i < n;i++)
		{
			map[i] = new Scanner(System.in).nextLine();
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (map[i][j] == temp)
					{
						for (k = 0;k < 4;k++)
						{
							if (i + x[k] >= 0 && i + x[k] < n && j + y[k] >= 0 && j + y[k] < n && map[i + x[k]][j + y[k]] == '.')
							{
								map[i + x[k]][j + y[k]] = temp + 1;
							}
						}
					}
				}
			}
			temp = temp + 1;
			m--;
		} while (m > 1);
		int sign = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (map[i][j] >= '@')
				{
					sign = sign + 1;
				}
			}
		}
		System.out.print(sign);
		System.out.print("\n");
		return 0;
	}

}

