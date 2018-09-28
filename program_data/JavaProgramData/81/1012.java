int exchange = new int(int [5],int,int);
//---------------------------------------------------------------------
int main()
{
	int[][] matrix = new int[5][5];
	int m;
	int n;
	int i;
	for (i = 0;i < 25;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			matrix[0] + i = Integer.parseInt(tempVar);
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
	if (exchange(matrix,m,n))
	{
		for (i = 0;i < 25;i++)
		{
			System.out.printf("%d%c",*(matrix[0] + i),(i + 1) % 5?' ':'\n');
		}
	}
	else
	{
		System.out.print("error");
	}
	return 0;
}
//---------------------------------------------------------------------
int exchange(int matrix[5],int m,int n)
{
	if (m >= 0 && m < 5 && n >= 0 && n < 5)
	{
		int temp;
		int i;
		for (i = 0;i < 5;i++)
		{
			temp = matrix[m][i];
			matrix[m][i] = matrix[n][i];
			matrix[n][i] = temp;
		}
		return 1;
	}
	else
	{
		return 0;
	}
}
//=====================================================================



