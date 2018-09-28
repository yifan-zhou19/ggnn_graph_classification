int fan = int;
void main()
{
	int[] a = new int[10000];
	int[] b = new int[10000];
	int[] c = new int[10000];
	int n;
	int m = 0;
	int i = 0;
	int j;
	do
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i++] = Integer.parseInt(tempVar);
		}
	}while (System.in.read() != '\n');
	i = 0;
	do
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i++] = Integer.parseInt(tempVar2);
		}
	}while (System.in.read() != '\n');
	System.out.printf("%d ",i);
	for (j = 0;j < i;j++)
	{
		if (m < b[j])
		{
			m = b[j]; //m-1?????????
		}
	}
	for (j = 0;j < m;j++) //???????
	{
		for (n = 0;n < i;n++) //??????
		{
			if (j >= a[n] != 0 && j < b[n])
			{
				c[j]++;
			}
		}
	}
	for (i = 1,n = c[0];i < m;i++)
	{
		if (n < c[i])
		{
			n = c[i];
		}
	}
	System.out.printf("%d",n);
}

