int yuqiwuguan = int;
int main()
{
	int n;
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i <= n;i++)
	{
		if (yuqiwuguan(i))
		{
			sum += i * i;
		}
	}
	System.out.printf("%d",sum);
	return 0;
}
int yuqiwuguan(int i)
{
	int r;
	if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7)
	{
		r = 0;
	}
	else
	{
		r = 1;
	}
	return r;
}

