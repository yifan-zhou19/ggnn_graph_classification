package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int b;
	int i;
	int j;
	int[][] m = new int[10][10];
	(int)(*p)[10];
	p = m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < a;i++)
	{
		for (j = 0;j < b;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				*(p + i) + j = tempVar3;
			}
		}
	}

	int max;
	int min;
	int k;
	int temp;
	p = m;
	int you = 0;
	for (i = 0;i < a;i++)
	{
			max = *p;
		for (j = 0;j < b;j++)
		{
			if (*(*(p + i) + j) > max)
			{
			max = (*(p + i) + j);
			k = j;
			}
		}
		p = m;
		min = max;
		for (temp = 0;temp < a;temp++)
		{
			if (*(*(p + temp) + k) < min)
			{
				min = (*(p + temp) + k);
			}
		}
		if (max == min)
		{
			System.out.printf("%d+%d\n",i,k);
			you = 1;
		}
	}
	if (you == 0)
	{
		System.out.print("No\n");
	}
	}

}

