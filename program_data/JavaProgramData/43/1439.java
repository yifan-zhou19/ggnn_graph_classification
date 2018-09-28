package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a = 3;
		int b;
		int i;
		int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	while (a <= m / 2)
	{
		i = 2;
		 j = 2;
		while (i <= a - 1)
		{
			if (a % i == 0)
			{
			a++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto loop;
			}
		else
		{
			i++;
		}
		}
	b = m - a;
		while (j <= b - 1)
		{
				if (b % j == 0)
				{
			a++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto loop;
				}
		else
		{
			j++;
		}
		}
	System.out.printf("%d %d\n",a,b);
	a++;
	}
	return 0;
	}
}

