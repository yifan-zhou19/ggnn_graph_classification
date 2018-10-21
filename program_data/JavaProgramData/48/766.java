int[][][] map = new int[2][12][12];
void Make(int,int,int);
int main()
{
	int i;
	int j;
	int m;
	int n;
	int turn = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(map,0,(Integer.SIZE / Byte.SIZE));
	map[0][5][5] = 1;
	map[1][5][5] = 1;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (;n > 0;--n)
	{
		turn = 1 - turn;
		for (i = 0;i < 12;++i)
		{
			for (j = 0;j < 12;++j)
			{
				map[1 - turn][i][j] = 0;
			}
		}
		for (i = 1;i <= 9;++i)
		{
			for (j = 1;j <= 9;++j)
			{
				Make(i,j,turn);
			}
		}
	}
	for (i = 1;i <= 9;++i)
	{
		System.out.print(map[1 - turn][i][1] * m);
		for (j = 2;j <= 9;++j)
		{
			System.out.print(" ");
			System.out.print(map[1 - turn][i][j] * m);
		}
		System.out.print("\n");
	}
	return 0;
}
void Make(int x,int y,int t)
{
	 int n = map[t][x][y];
	 map[1 - t][x][y] += n * 2;
	 map[1 - t][x - 1][y] += n;
	 map[1 - t][x + 1][y] += n;
	 map[1 - t][x][y - 1] += n;
	 map[1 - t][x][y + 1] += n;
	 map[1 - t][x - 1][y - 1] += n;
	 map[1 - t][x - 1][y + 1] += n;
	 map[1 - t][x + 1][y - 1] += n;
	 map[1 - t][x + 1][y + 1] += n;
	 return;
}






