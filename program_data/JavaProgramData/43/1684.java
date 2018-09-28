package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (int i = 3;i < n;i++)
		{
		for (int k = 2;k < i;k++)
		{
			if (i % k == 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto There;
			}
		}
		for (int k = 2;k < n - i;k++)
		{
			if ((n - i) % k == 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto There;
			}
		}
		if (i <= n - i)
		{
			System.out.printf("%d %d\n",i,n - i);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		There:
		;
		}
		return 0;
	}

}

