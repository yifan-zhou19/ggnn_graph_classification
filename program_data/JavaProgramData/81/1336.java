int reverse = new int(int,int);
int main(int argc, char * argv[])
{
	int[][] sz = new int[5][5];
	int n;
	int m;
	int i;
	int j;
	int[] e = new int[5];

	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i][j] = Integer.parseInt(tempVar);
			}
		}
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}

	if (reverse(n,m) == 0)
	{
		System.out.print("error\n");
	}
	else
	{
		for (j = 0;j < 5;j++)
		{
		e[j] = sz[n][j];
		sz[n][j] = sz[m][j];
		sz[m][j] = e[j];
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",sz[i][j]);
			}
			if (j == 4)
			{
				System.out.printf("%d",sz[i][j]);
			}
			System.out.print("\n");
		}
	}

	return 0;
}

int reverse(int n,int m)
{

	if (n >= 0 && n < 5 && m >= 0 && m < 5)
	{
		return 1;
	}
	else
	{
		return 0;
	}

}

