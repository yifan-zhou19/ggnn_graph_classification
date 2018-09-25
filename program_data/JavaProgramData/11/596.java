package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int a;
		int b;
		int c;
		int x = 0;
		int sum;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < 12;i++)
		{
			if (i + 1 == b)
			{
				  break;
			}
					x = x + days[i];

		}
		sum = x + c;
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			if (b <= 2)
			{
			System.out.printf("%d",sum);
			}
			if (b > 2)
			{
			   sum = sum + 1;
			System.out.printf("%d",sum);
			}

		}
		else
		{
		   System.out.printf("%d",sum);
		}
	}


}

