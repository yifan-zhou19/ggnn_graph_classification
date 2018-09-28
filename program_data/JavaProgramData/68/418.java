package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int q;
		int p;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= a;i += 2)
		{
			p = 3;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			test:
			j = 3;
			while (p * 2 <= i != 0 && j * j <= p)
			{
				if (p % j == 0)
				{
					p += 2;
					j = 3;
				}
				else
				{
					j += 2;
				}
			}
			q = i - p;
			k = 3;
			while (k * k <= q)
			{
				if (q % k == 0)
				{
					p += 2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto test;
				}
				else
				{
					k += 2;
				}
			}
			System.out.printf("%ld=%ld+%ld\n",i,p,q);
		}
	}


}

