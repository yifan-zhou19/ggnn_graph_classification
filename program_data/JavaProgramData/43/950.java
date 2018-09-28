package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = 3;
	while (a <= n / 2)
	{
		for (b = 2;b <= (sqrt)(a);b++)
		{
			if (a % b == 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto o2;
			}
		}
		c = n - a;
		for (d = 2;d <= (sqrt)(c);d++)
		{
			if (c % d == 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto o2;
			}
		}
		System.out.printf("%d %d\n",a,c);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		o2:
		a++;
	}
	return 0;
	}
}

