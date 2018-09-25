package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		int sum = 0;
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
		if (b == 1)
		{
			sum = 0;
		}
		else if (b == 2)
		{
			sum = 31;
		}
		else
		{
			sum = 31;
			if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))
			{
				sum = sum + 29;
			}
			else
			{
				sum = sum + 28;
			}
		for (i = 3;i < b;i++)
		{
			if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				sum = sum + 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum = sum + 30;
			}
		}
		}
		sum = sum + c;
		System.out.printf("%d",sum);
		return 0;
	}
}

