int analyse = new int(int *,int *,int,int);
int main()
{
	int k;
	int[] height = new int[25];
	int[] numbers = new int[25];
	int i;
	int max;
	int temp;
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
			height + i = tempVar2;
		}
	}
	max = numbers[24] = 1;
	for (i = 23;i >= 0;i--)
	{
		temp = analyse(height,numbers,i,k);
		if (temp > max)
		{
			max = temp;
		}
	}
	System.out.printf("%d\n",max);
	return 0;
}
int analyse(int * height,int * numbers,int seq,int k)
{
	int max = 0;
	int temp;
	int i;
	for (i = k - 1;i > seq;i--)
	{
		if (height[seq] >= height[i])
		{
			temp = numbers[i];
			if (temp > max)
			{
				max = temp;
			}
		}
	}
	max++;
	numbers[seq] = max;
	return max;
}


