int[][] arr = new int[100][100];
int[][] pos = new int[120][120];
int rr;
int cc;

void bianli(int, int, int, int);

int main()
{
	int i;
	int j;
	rr = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	cc = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 0; i < rr; i++)
	{
		for (j = 0; j < cc; j++)
		{
			arr[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pos[i][j] = 1;
		}
	}

	bianli(0, 0, 0, 1);
return 0;
}

//0 ??? 1 ??? 
void bianli(int k, int ii, int jj, int s)
{
	if (pos[ii][jj] == 0)
	{
		return;
	}


	int i;
	int j;
	//??
	if (k == 0)
	{
		//?? 
		if (s == 0)
		{
			for (j = jj; j >= 0; j--)
			{
				if (pos[ii][j] == 1)
				{
					System.out.print(arr[ii][j]);
					System.out.print("\n");
					pos[ii][j] = 0;
				}
				else
				{
					bianli(1, ii - 1, j + 1, 0);
					return;
				}
			}
			bianli(1, ii - 1, 0, 0);
			return;
		}
		//?? 
		else
		{
			for (j = jj; j < cc; j++)
			{
				if (pos[ii][j] == 1)
				{
					System.out.print(arr[ii][j]);
					System.out.print("\n");
					pos[ii][j] = 0;
				}
				else
				{
					bianli(1, ii + 1, j - 1, 1);
					return;
				}
			}
			bianli(1, ii + 1, cc - 1, 1);
			return;
		}
	}
	//??
	else
	{
		//?? 
		if (s == 0)
		{
			for (i = ii; i >= 0; i--)
			{
				if (pos[i][jj] == 1)
				{
					System.out.print(arr[i][jj]);
					System.out.print("\n");
					pos[i][jj] = 0;
				}
				else
				{
					bianli(0, i + 1, jj + 1, 1);
					return;
				}
			}
			bianli(0, 0, jj + 1, 1);
			return;
		}

		//?? 
		else
		{
			for (i = ii; i < rr; i++)
			{
				if (pos[i][jj] == 1)
				{
					System.out.print(arr[i][jj]);
					System.out.print("\n");
					pos[i][jj] = 0;
				}
				else
				{
					bianli(0, i - 1, jj - 1, 0);
					return;
				}
			}
			bianli(0, rr - 1, jj - 1, 0);
			return;
		}
	}

return;
}

