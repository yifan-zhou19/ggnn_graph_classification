package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sa = new int[100][100];
		int m;
		int n;
		int k;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (m = 0;m < k;m++)
		{
			for (n = 0;n < k;n++)
			{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sa[m][n]) = Integer.parseInt(tempVar2);
		}
			}
		}
	for (m = 0;m < k;m++)
	{
			for (n = 0;n < k;n++)
			{
				if (sa[m][n] == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto ll;

				}

			}

	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	ll:
	a = m;
					b = n;
	for (m = k - 1;m >= 0;m--)
	{
			for (n = k - 1;n >= 0;n--)
			{
				if (sa[m][n] == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto rr;
				}

			}

	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	rr:
	c = m;
					d = n;

	e = (c - a - 1) * (d - b - 1);
	System.out.printf("%d",e);
	return 0;
	}
}

