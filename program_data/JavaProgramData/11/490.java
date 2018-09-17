package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int i;
		int d = 0;
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
			  d = d + 31;
			}
			else
			{
				d = d + 30;
			}
		}
		if (i <= 2)
		{
			d = d;
		}
		else if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
		{
			d = d - 1;
		}
		else
		{
			d = d - 2;
		}
		d = d + c;
		System.out.printf("%d",d);
	}

}

