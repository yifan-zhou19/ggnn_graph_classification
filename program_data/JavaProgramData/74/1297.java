package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int c;
		int d;
		int e;
		int k;
		int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = a;i <= b;i++)
	{
		k = 0;
		for (j = 2;j <= Math.sqrt(i);j++)
		{
			if (i % j == 0)
			{
				k = 1;
		break;
			}
		}
		c = i;
		e = 0;
		while (c > 0)
		{
			d = c % 10;
		e = e * 10 + d;
		c = c / 10;
		}
	//	printf("%d %d %d\n",i,e,k);
		if (k == 0 && i == e)
		{
			s++;
			if (s == 1)
			{
				System.out.printf("%d",i);
			}
			else
			{
			System.out.printf(",%d",i);
			}
		}
	}
	if (s == 0)
	{
	System.out.print("no");
	}
	return 0;
	}
}

