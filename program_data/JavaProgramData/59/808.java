//???????
//??????


char[][] room = new char[101][101];
int[][] po = new int[10000][2];
int flu = new int(int,int);

int main()
{
	int m;
	int n;
	int num = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		for (int j = 0;j < n;j++)
		{
			room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (room[i][j] == '@')
			{
				num++;
			}
		}
	}
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(num + flu(m - 1,n));
	System.out.print("\n");
	return 0;
}

int flu(int day,int n)
{
	int count = 0;
	int flunum = 0;
	int x;
	int y;
	for (int i = 0;i < n;i++)
	{
		for (int j = 0;j < n;j++)
		{
			if (room[i][j] == '@')
			{
				po[flunum][0] = i;
				po[flunum][1] = j;
				flunum++;
			}
		}
	}

	for (int k = 0;k < flunum;k++)
	{
		x = po[k][0];
		y = po[k][1];
		if (x > 0 && room[x - 1][y] == '.')
		{
			room[x - 1][y] = '@';
			count++;
		}
		if (x < n && room[x + 1][y] == '.')
		{
			room[x + 1][y] = '@';
			count++;
		}
		if (y > 0 && room[x][y - 1] == '.')
		{
			room[x][y - 1] = '@';
			count++;
		}
		if (y < n && room[x][y + 1] == '.')
		{
			room[x][y + 1] = '@';
			count++;
		}
	}
	if (day == 1)
	{
		return count;
	}
	else
	{
		return count + flu(day - 1,n);
	}
}

