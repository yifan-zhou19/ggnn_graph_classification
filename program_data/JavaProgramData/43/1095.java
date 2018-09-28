package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 3;i < a / 2 + 1;i = i + 2)
		{
			j = a - i;
				for (n = 3;n < i;n = n + 2)
				{
					if (i % n == 0)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
				}
				for (m = 3;m < j;m = m + 2)
				{
					if (j % m == 0)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
				}
				System.out.printf("%d %d\n",i,j);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		continue;
		}
		return 0;
	}
}

