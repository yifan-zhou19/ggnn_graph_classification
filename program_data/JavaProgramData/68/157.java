package <missing>;

public class GlobalMembers
{
	public static int Set(int c)
	{
		int i;
		int w = 1;
		if (c % 2 == 0)
		{
			w = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto loop;
		}
		for (i = 3;i < Math.sqrt(c) + 1;i += 2)
		{
			if (c % i == 0)
			{
				w = 0;
			}

		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	return (w);
	}
	public static int Main()
	{
		int i = 6;
		int n;
		int j;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n + 1)
		{
			for (j = 3;j < i;j += 2)
			{
				if (Set(j) == 1)
				{
				f = Set(i - j);
				if (f == 1)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
				}
			}
			i += 2;
		}
		return 0;
	}
}

