//1000012915???

int GL = new int(int,int [][101]); //????a[1][1]???
void Delete(int,int [][101]); //???????????
int min = new int(int,int); //??????

int main()
{
	int[] Sum = new int[101]; //????????Sum
	int n;
	int[][] a = new int[101][101];
	int i;
	int j;
	int k;

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++) //????
		{
			for (k = 0;k < n;k++)
			{
				a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		System.out.print(GL(n,a));
		System.out.print("\n");
	}

	//for(i=0;i<n;i++)
	//	cout<<Sum[i]<<endl;//????
	return 0;
}

int GL(int n,int a[][101])
{
	int Sum = 0;
	int i;
	int j;
	int MIN;

	for (i = 0;i < n;i++) //????????
	{
		MIN = 999999;
		for (j = 0;j < n;j++)
		{
			MIN = Math.min(MIN,a[i][j]);
		}
		for (j = 0;j < n;j++)
		{
			a[i][j] -= MIN;
		}
	}

	for (j = 0;j < n;j++) //?????????
	{
		MIN = 999999;
		for (i = 0;i < n;i++)
		{
			MIN = Math.min(MIN,a[i][j]);
		}
		for (i = 0;i < n;i++)
		{
			a[i][j] -= MIN;
		}
	}

	Sum += a[1][1]; //????a[1][1]

	if (n == 1) //??
	{
		return 0;

	}
	else
	{
		Delete(n,a);
		Sum += GL(n - 1,a);
		return Sum;
	} //????
}


int Math.min(int a, int b) //??????
{
	if (a >= b)
	{
		return b;
	}
	else
	{
		return a;
	}
}
void Delete(int n,int a[][101]) //???????????
{
	int i;
	int j;
	for (i = 0;i < n;i++)
	{
		for (j = 1;j < n - 1;j++)
		{
			a[i][j] = a[i][j + 1];
		}
		a[i][n - 1] = 0;
	}

	for (j = 0;j < n - 1;j++)
	{
		for (i = 1;i < n - 1;i++)
		{
			a[i][j] = a[i + 1][j];
		}
		a[n - 1][j] = 0;
	}

}

