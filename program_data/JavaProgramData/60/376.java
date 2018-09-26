package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("empty");
		}
		else
		{
			if (n == 2 || n == 3 || n == 4)
			{
			System.out.print("empty");
			}
			else
			{
		for (i = 3;i <= n - 2;i++)
		{
			for (int j = 2;j < i;j++)
			{
				int c;
				c = i % j;
				if (c == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto part1;
				}
			}
			for (int j = 2;j < i + 2;j++)
			{
				int c;
				c = (i + 2) % j;
				if (c == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto part1;
				}
			}
			System.out.printf("%d %d\n",i,i + 2);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	part1:
	;
		}
			}
		}
		return 0;
	}

}

