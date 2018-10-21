int istarget = int;

int main()
{
	int num;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		num = Integer.parseInt(tempVar);
	}
	for (i = 2;i <= num / 2;i++)
	{
		if (istarget(i) == 1 && istarget(num - i) == 1)
		{
			System.out.printf("%d %d\n",i,num - i);
		}
	}

	return 0;
}

int istarget(int num)
{
	int i;
	for (i = 2;i <= num / 2;i++)
	{
		if (num % i == 0)
		{
			return 0;
		}
	}
	return 1;
}


