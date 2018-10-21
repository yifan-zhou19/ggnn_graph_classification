int dert = new int(int,int);
void main()
{
	int k;
	int[] missile = new int[25];
	int i;
	int result;
	int[] donemax = new int[25];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			missile[i] = Integer.parseInt(tempVar2);
		}
	}
	donemax[k - 1] = 1;
	for (i = k - 2;i >= 0;i--)
	{
		int max = dert(missile[i],missile[i + 1]) * donemax[i + 1];
		int j;
		for (j = 1;j < k - i;j++)
		{
			if (max < dert(missile[i],missile[i + j]) * donemax[i + j])
			{
				max = dert(missile[i],missile[i + j]) * donemax[i + j];
			}
		}
		donemax[i] = max + 1;
	}
	result = donemax[k - 1];
	for (i = k - 2;i >= 0;i--)
	{

		if (donemax[i] > result)
		{
			result = donemax[i];
		}
	}
	System.out.printf("%d\n",result);
}
int dert(int x,int y)
{
	int z;
	if (x >= y)
	{
		z = 1;
	}
	else
	{
		z = 0;
	}
	return z;
}

