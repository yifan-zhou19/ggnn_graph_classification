package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ti;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			ti = i;
			for (j = 1;j <= n;j++)
			{
				ti = ti * n + k;
				if (j == n)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto qqq;
				}
				else if (ti % (n - 1) == 0)
				{
					ti = ti / (n - 1);
				}
				else
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto sss;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		sss:
		;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	qqq:
	System.out.printf("%d\n",ti);
		return 0;
	}
}

