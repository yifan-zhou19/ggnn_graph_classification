package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		int n;
		int i;
		int m;
		int a;
		int p;
		int q;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}

		if (p > q)
		{

		   a = p;

	b = q;

		}

		else if (p <= q)
		{

		   a = q;

		   b = p;

		}

		i = 3;

		while (i <= n)
		{

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}

		if (m > a)
		{

		   b = a;

		   a = m;

		}

	else if (m > b)
	{

		   b = m;

	}

		i++;

		}

		System.out.printf("%d\n%d\n",a,b);

		return 0;

	}

}

