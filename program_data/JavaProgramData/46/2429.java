int[][] num = new int[100][100]; //float:??????????????
int row;
int col;
int i;
int j;
void output(int,int,int,int);
int main()
{
	row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < row;i++)
	{
		for (j = 0;j < col;j++)
		{
			num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	output(0,0,row,col);
	return 0;
}

void output(int x,int y,int a,int b)
{ //???x?y?????a?b????
	int i;
	if (a == 1)
	{
		for (i = x;i < x + b;i++)
		{
			System.out.printf("%d\n",num[x][i]);
		}
	}
	else if (a == 2)
	{
		for (i = x;i < x + b;i++)
		{
			System.out.printf("%d\n",num[x][i]);
		}
		for (i = x + b - 1;i >= x;i--)
		{
			System.out.printf("%d\n",num[x + 1][i]);
		}
	}
	else if (b == 1)
	{
		for (i = y;i < y + a;i++)
		{
			System.out.printf("%d\n",num[i][y]);
		}
	}
	else if (b == 2)
	{
		System.out.printf("%d\n",num[x][y]);
		for (i = y;i < y + a;i++)
		{
			System.out.printf("%d\n",num[i][y + 1]);
		}
		for (i = y + a - 1;i > y;i--)
		{
			System.out.printf("%d\n",num[i][y]);
		}
	}
	else
	{
		for (i = x;i < x + b;i++)
		{
			System.out.printf("%d\n",num[x][i]);
		}
		for (i = y + 1;i < y + a;i++)
		{
			System.out.printf("%d\n",num[i][x + b - 1]);
		}
		for (i = x + b - 2;i >= x;i--)
		{
			System.out.printf("%d\n",num[y + a - 1][i]);
		}
		for (i = y + a - 2;i > y;i--)
		{
			System.out.printf("%d\n",num[i][y]);
		}
		output(x + 1,y + 1,a - 2,b - 2);
	}
}

