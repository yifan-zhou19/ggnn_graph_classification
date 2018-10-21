package <missing>;

public class GlobalMembers
{
	public static int[][] shuzu = new int[100][100];


	public static int Main()
	{
		int line;
		int row;
		line = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < line;i++)
		{
			for (int j = 0;j < row;j++)
			{
				shuzu[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
	/*	if(shuzu[x][y-1]==-1&&shuzu[x][y+1]==-1&&shuzu[x-1][y]==-1&&shuzu[x+1][y]==-1)
			return ;
			*/
		int a;
		int b;
		int sum = 0;
		int allg;
		int x = 0;
		int y = row - 1;
		int i = 0;
		int j = line-1;
		while (sum < (allg = row * line))
		{
			for (a = x;a <= y;a++)
			{
			System.out.print(shuzu[i][a]);
			System.out.print("\n");
			sum++;
			if (sum == allg)
			{
				return 0;
			}
			}
		i++;
		for (b = i;b <= j;b++)
		{
			System.out.print(shuzu[b][y]);
			System.out.print("\n");
			sum++;
			if (sum == allg)
			{
				return 0;
			}
		}
		y--;
		for (a = y;a >= x;a--)
		{
			System.out.print(shuzu[j][a]);
			System.out.print("\n");
			sum++;
			if (sum == allg)
			{
				return 0;
			}
		}
		j--;
		for (b = j;b >= i;b--)
		{
			System.out.print(shuzu[b][x]);
			System.out.print("\n");
			sum++;
			if (sum == allg)
			{
				return 0;
			}
		}
		x++;
		}
		return 0;
	}
}

