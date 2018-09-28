int f = new int(int,int);
int main()
{
	int n;
	int i;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] y = new int[n];
	int[] m1 = new int[n];
	int[] m2 = new int[n];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m1[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			m2[i] = Integer.parseInt(tempVar4);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (m1[i] < m2[i])
		{
			e = m1[i];
			m1[i] = m2[i];
			m2[i] = e;
		}
		if ((f(y[i],m1[i]) - f(y[i],m2[i])) % 7 == 0)
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
int f(int y,int m)
{
	int x = 0;
	for (int i = 1;i < m;i++)
	{
		if (i == 4 || i == 6 || i == 9 || i == 11)
		{
			x += 30;
		}
		else if (i == 2)
		{
			if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
			{
				x += 29;
			}
			else
			{
				x += 28;
			}
		}
		else
		{
			x += 31;
		}
	}
	return x;
}


