package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
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
		if (a % 4 == 0 && a % 100 > 0 || a % 400 == 0)
		{
			int sum = 0;
			int i;
			for (i = 1;i < b;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
				{
					sum += 31;
				}
				else if (i == 2)
				{
					sum += 29;
				}
				else
				{
					sum += 30;
				}
			}
			sum += c;
			System.out.printf("%d\n",sum);
		}
		else
		{
				int sum = 0;
				int i;
				for (i = 1;i < b;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
					{
					sum += 31;
					}
				else if (i == 2)
				{
					sum += 28;
				}
				else
				{
					sum += 30;
				}
				}
			sum += c;
			System.out.printf("%d\n",sum);
		}
	}
}

