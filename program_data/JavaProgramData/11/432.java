package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int x = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				x = x + 31;
			}
			else if (i == 2)
			{
			x = x + 28;
			}
			else
			{
			x = x + 30;
			}
		}
		if (((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) && (b > 2))
		{
		x = x + 1;
		}
		x = x + c;
		System.out.printf("%d\n",x);
	}
}

