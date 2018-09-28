int[][] a = new int[10][10];
void does(int,int,int);
int main()
{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(a,0,(Integer.SIZE / Byte.SIZE));
	a[5][5] = 1;
	int n;
	int m;
	int i;
	int j;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	does(5,5,n);

	for (i = 1;i <= 9;i++)
	{
		for (j = 1;j <= 9;j++)
		{
			if (j < 9)
			{
			System.out.print(m * a[i][j]);
			System.out.print(' ');
			}
			else
			{
				System.out.print(m * a[i][j]);
				System.out.print("\n");
			}
		}
	}

	return 0;
}

void does(int i,int j,int n)
{
	if (n > 0)
	{
		int b;
		a[i][j]++;
		a[i + 1][j]++;
		a[i - 1][j]++;
		a[i][j + 1]++;
		a[i][j - 1]++;
		a[i - 1][j - 1]++;
		a[i - 1][j + 1]++;
		a[i + 1][j - 1]++;
		a[i + 1][j + 1]++;

			does(i,j,n - 1);
			does(i,j,n - 1);
			does(i,j + 1,n - 1);
			does(i,j - 1,n - 1);
			does(i + 1,j,n - 1);
			does(i - 1,j,n - 1);
			does(i - 1,j - 1,n - 1);
			does(i - 1,j + 1,n - 1);
			does(i + 1,j - 1,n - 1);
			does(i + 1,j + 1,n - 1);



	}
}

