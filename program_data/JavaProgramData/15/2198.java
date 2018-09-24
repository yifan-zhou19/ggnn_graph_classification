package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                       **
	//*?????? 1100012763              **
	//*???2011.12.24                     **
	//****************************************
	public static int Main()
	{
		short[][] map = new short[1001][1001];
		int n;
		int i;
		int j;
		int bx;
		int by;
		int ex;
		int ey;
		int ans;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				map[i][j] = Short.parseShort(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 2; i < n; i++)
		{
			for (j = 2; j < n; j++)
			{
				if (map[i][j] == 255)
				{
					if (map[i][j - 1] == 0 && map[i - 1][j] == 0)
					{
						bx = i;
						by = j;
					}
					if (map[i][j + 1] == 0 && map[i + 1][j] == 0)
					{
						ex = i;
						ey = j;
					}

				}
			}
		}
		ans = (ex - bx + 1) * (ey - by + 1);
		System.out.print(ans);
		return 0;
	}


}

