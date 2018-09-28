int f = new int(int,int);
void main()
{
	int[][] a = new int[5][5];
	int i;
	int m;
	int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * q = (a + 4) + 4;
	for (;p <= q;)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p++ = Integer.parseInt(tempVar);
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
	if (f(m,n))
	{
		for (i = 0;i < 5;i++)
		{
			if (i == m)
			{
				p = (a + n);
			}
			else if (i == n)
			{
				p = (a + m);
			}
			else
			{
				p = (a + i);
			}
			q = p + 5;
			q--;
			for (;p < q;p++)
			{
				System.out.printf("%d ",*p);
			}
			System.out.printf("%d\n",*p);
		}
	}
	else
	{
		System.out.print("error");
	}

}
int f(int m, int n)
{
	if (m >= 0 && n >= 0 && m < 5 && n < 5)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

