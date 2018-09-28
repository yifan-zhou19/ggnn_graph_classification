package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k = k + 2)
		{
			int a = 1;
			int b;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	   loop:
	   a = a + 2;
			int i;
			int x = Math.sqrt(a);
			for (i = (x / 2) * 2 + 1;a % i != 0;)
			{
				i = i - 2;
			}
				if (i != 1)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
				}
			else
			{
				b = k - a;
				int j;
				int y = Math.sqrt(b);
				for (j = (y / 2) * 2 + 1;b % j != 0;)
				{
					j = j - 2;
				}
					if (j != 1)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
					}
				else
				{
					System.out.printf("%d=%d+%d\n",k,a,b);
				}
			}
			continue;
		}
	}
}

