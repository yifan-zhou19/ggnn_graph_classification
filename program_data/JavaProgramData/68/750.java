package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			j = i - 2;
			for (k = 2;k <= Math.sqrt(n);k++)
			{
				if (j % k != 0)
				{
					continue;
				}
				else
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop1;
				}
			}
				System.out.printf("%d=2+%d\n",i,j);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			loop1:
			if (true)
			{
				;
			}
			for (t = 3;t <= n / 2;t = t + 2)
			{
				for (m = 3;m <= Math.sqrt(t);m = m + 2)
				{
					if (t % m == 0)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop2;
					}
					else
					{
						continue;
					}
				}
				j = i - t;
				for (k = 2;k <= Math.sqrt(j);k++)
				{
					if (j % k != 0)
					{
						continue;
					}
					else
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop2;
					}
				}
					System.out.printf("%d=%d+%d\n",i,t,j);
					break;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					loop2:
					if (true)
					{
						;
					}
			}
		}
	}


}

