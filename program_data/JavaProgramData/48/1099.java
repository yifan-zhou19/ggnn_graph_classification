package <missing>;

public class GlobalMembers
{
	//*************************************************
	//*3�D�?o�y�a(11.8) &#207;&#184;&#190;�?&#196;��&#214;3�&#235;�&#169;�?              *
	//*D&#213;&#195;&#251;?oo&#206;&#212;&#198;&#198;e                                   *
	//*&#209;�o&#197;?o1300012888                               *
	//*�&#213;&#198;�?o2013.12.9                                *
	//*************************************************

	public static void change(int a, int[][] area, int[][] area0)
	{
		int i;
		int j;
		if (a == 0)
		{
			return;
		}
		else
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					area0[i][j] = area[i][j];
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					area0[i][j] += area[i][j];
					area0[i - 1][j] += area[i][j];
					area0[i + 1][j] += area[i][j];
					area0[i][j - 1] += area[i][j];
					area0[i][j + 1] += area[i][j];
					area0[i + 1][j + 1] += area[i][j];
					area0[i - 1][j - 1] += area[i][j];
					area0[i + 1][j - 1] += area[i][j];
					area0[i - 1][j + 1] += area[i][j];
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					area[i][j] = area0[i][j];
				}
			}
			change(a - 1, area, area0);
		}
	}

	public static int Main()
	{
		int[][] area = new int[11][11];
		int[][] area0 = new int[11][11];
		int i;
		int j;
		int num;
		int day;

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(area, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(area0, 0, (Integer.SIZE / Byte.SIZE));
		area[5][5] = num;
		change(day, area, area0);
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (j == 1)
				{
					System.out.print(area[i][j]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(area[i][j]);
				}
			}
			System.out.print("\n");
		}

		return 0;
	}
}

