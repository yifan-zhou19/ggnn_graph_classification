package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int sum;
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
		sum = 0;
		for (i = 1;i < b;i++)
		{
			switch (i)
			{
			case 1:
				sum += 31;
				break;
			case 2:
				if (a % 400 == 0 || (a % 100 != 0) && (a % 4 == 0))
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
				break;
			case 3:
				sum += 31;
				break;
			case 4:
				sum += 30;
				break;
			case 5:
				sum += 31;
				break;
			case 6:
				sum += 30;
				break;
			case 7:
				sum += 31;
				break;
			case 8:
				sum += 31;
				break;
			case 9:
				sum += 30;
				break;
			case 10:
				sum += 31;
				break;
			case 11:
				sum += 30;
				break;
			case 12:
				sum += 31;
				break;
			}
		}
		sum += c;
		System.out.printf("%d\n",sum);
		return 0;
	}
}

