package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int i;
		int b;
		int first;
		int second;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (c > d)
		{
			first = c;
		}
			second = d;
		if (c < d)
		{
			first = d;
		}
			second = c;
		for (i = 3;i <= a;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			if (b > first)
			{
				second = first;
				first = b;
			}
			else if (b > second)
			{
				second = b;
			}
		}
		System.out.printf("%d\n%d",first,second);
	}

}

