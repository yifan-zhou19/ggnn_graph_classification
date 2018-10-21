package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	int n;
	int i;
	int j;
	int l;
	int p;
	int q;
	int k = 0;


	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}

	if (m % 2 == 0)
	{
		m++;
	}

	for (i = m;i <= n;i = i + 2)
	{

	p = i;
	for (q = 0;p > 0;)
	{
		q *= 10;
		q += p % 10;
		p /= 10;
	}
	if (q != i)
	{
		continue;
	}

	for (j = 3;j < i / 2;j = j + 2)
	{
		if (i % j == 0)
		{
			j = 0;
			break;
		}
	}

	if (j == 0)
	{
		continue;
	}

	if (k == 0)
	{
		System.out.printf("%d",i);
		k = 1;
	}
	else
	{
		System.out.printf(",%d",i);
	}
	}

	if (k == 0)
	{
		System.out.print("no");
	}
	}
}

