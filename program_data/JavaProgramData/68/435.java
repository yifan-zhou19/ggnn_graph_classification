package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m = 6;
		int i = 3;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (m <= n)
		{
			while (i <= (m - i))
			{
				for (a = 2;a <= Math.sqrt(i);a++)
				{
					if (i % a == 0)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto l2;
					}
				}
					for (b = 3;b <= Math.sqrt((m - i));b++)
					{
						if ((m - i) % b == 0)
						{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto l2;
						}
					}
						System.out.printf("%d=%d+%d\n",m,i,(m - i));
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto l1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l2:
	i++;
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l1:
			m = m + 2;
			i = 3;
		}

	}
}

