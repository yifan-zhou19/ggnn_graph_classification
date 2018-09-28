void replace(int*,int*);

int main()
{
	int[][] l = new int[5][5];
	int n;
	int m;
	int i;
	int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
	int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
	int p2;

	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				l[i][j] = Integer.parseInt(tempVar);
			}
		}
	}

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	if ((n >= 0) && (n < 5) && (m >= 0) && (m < 5))
	{
		for (j = 0;j < 5;j++)
		{
			p1 = *(l + m) + j;
			p2 = *(l + n) + j;
			replace(p1,p2);
		}

		for (i = 0;i < 5;i++)
		{
			if (i != 0)
			{
				System.out.print("\n");
			}
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",l[i][j]);
			}
			System.out.printf("%d",l[i][j]);
		}
	}
	else
	{
		System.out.print("error");
	}

	return 0;
}

void replace(int * p1,int * p2)
{

	int a;

		a = p1;
		*p1 = *p2;
		*p2 = a;

}


