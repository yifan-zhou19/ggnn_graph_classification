int Run = int;
int DI = new int(int,int);
int main()
{
	int n;
	int j;
	int m;
	int[] year = new int[200];
	int[][] month = new int[200][2];
	int[] a = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (m = 0;m < n;m++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			year[m] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			month[m][0] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			month[m][1] = Integer.parseInt(tempVar4);
		}
		if ((DI(year[m],month[m][1]) - DI(year[m],month[m][0])) % 7 == 0)
		{
			a[m] = 1;
		}
		else
		{
			a[m] = 0;
		}
	}
	for (j = 0;j < n;j++)
	{
		if (a[j] == 1)
		{
	System.out.print("YES\n");
		}
		else
		{
	System.out.print("NO\n");
		}
	}
return 0;
}



	int DI(int year,int month)
	{
		int i;
		int Run = int;
	int total = 1;
	for (i = 1;i < month;i++)
	{
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		{
			total += 31;
		}
		else if (i == 4 || i == 6 || i == 9 || i == 11)
		{
			total += 30;
		}
		else if (i == 2)
		{
			if (Run(year))
			{
				total += 29;
			}
			else
			{
				total += 28;
			}
		}
	}

		return total;


	}
int Run(int year)
{


		int result = 0;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
	return result;
}

