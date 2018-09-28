int normal = new int(int,int);
int main()
{
	int n;
	int i;
	int k = 0;
	int shou;
	int shu;
	int max;
	int[] sz = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			shou = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			shu = Integer.parseInt(tempVar3);
		}
		if (normal(shou,shu))
		{
			sz[k]++;
		}
		else
		{
			k++;
		}
	}
	max = sz[0];
	for (i = 0;i <= k;i++)
	{
		if (sz[i] > max)
		{
			max = sz[i];
		}
	}
	System.out.printf("%d",max);
	return 0;
}
int normal(int shou,int shu)
{
	if (shou <= 140 && shou >= 90 && shu <= 90 && shu >= 60)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

