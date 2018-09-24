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
		k = 4;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		A:
		k = k + 2;
		while (k <= n)
		{
			int a;
			int b;
			a = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			loop:
			a = a + 2;
			int i;
			int x;
			x = Math.sqrt(a);
			i = (x / 2) * 2 + 1;
			while (a % i != 0)
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
				int y;
				y = Math.sqrt(b);
				j = (y / 2) * 2 + 1;
				while (b % j != 0)
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
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto A;
			}
		}
	}
}

