/*??*/
int king;
int monkeynum = new int(int [],int);
void main()
{
	int[] m = new int[20];
	int[] n = new int[20];
	int i;
	int j;
	int k;
	int start;
	int casenum;
	int[] monkey = new int[300];
	for (i = 0;;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		if (m[i] == 0)
		{
			break;
		}
	}
	casenum = i;
	for (i = 0;i < casenum;i++)
	{
		for (j = 0;j < 300;j++)
		{
			monkey[j] = 0;
		}
		for (j = 0;j < n[i];j++)
		{
			monkey[j] = 1;
		}
		start = 0;
		while (monkeynum(monkey,n[i]) != 1)
		{
				/*printf("%d\n",monkeynum(monkey,n[i]));*/
			k = m[i];
			while (k > 0)
			{
				if (start == n[i])
				{
					start = 0;
				}
					/*printf("start=%d",start);
					getchar();*/
				if (monkey[start] != 0)
				{
					--k;
				}
					/*printf("k=%d",k);
					getchar();*/
				++start;
			}
			monkey[start - 1] = 0;
				/*printf("kill monkey %d",start);
				getchar();
				printf("start=%d",start);
				getchar();*/
		}
		System.out.printf("%d",king);
		if (i < casenum - 1)
		{
			System.out.print("\n");
		}
	}
}
int monkeynum(int monkey[],int a)
{
	int i;
	int num = 0;
	for (i = 0;i < a;i++)
	{
		if (monkey[i])
		{
			num++;
			king = i + 1;
		}
	}
	return num;
}


