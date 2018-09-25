package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
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
		if (b == 1)
		{
			sum = c;
			System.out.printf("%d",sum);
		}
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
			if (b == 2)
			{
				sum = c + 31;
				System.out.printf("%d",sum);
			}
			if (b == 3)
			{
				sum = c + 60;
				System.out.printf("%d",sum);
			}
			if (b == 4)
			{
				sum = c + 91;
				System.out.printf("%d",sum);
			}
			if (b == 5)
			{
				sum = c + 121;
				System.out.printf("%d",sum);
			}
			if (b == 6)
			{
				sum = c + 152;
				System.out.printf("%d",sum);
			}
			if (b == 7)
			{
				sum = c + 182;
				System.out.printf("%d",sum);
			}
			if (b == 8)
			{
				sum = c + 213;
				System.out.printf("%d",sum);
			}
			if (b == 9)
			{
				sum = c + 244;
				System.out.printf("%d",sum);
			}
			if (b == 10)
			{
				sum = c + 274;
				System.out.printf("%d",sum);
			}
			if (b == 11)
			{
				sum = c + 305;
				System.out.printf("%d",sum);
			}
			if (b == 12)
			{
				sum = c + 335;
				System.out.printf("%d",sum);
			}
		}
		else
		{
			if (b == 2)
			{
				sum = c + 31;
				System.out.printf("%d",sum);
			}
			if (b == 3)
			{
				sum = c + 59;
				System.out.printf("%d",sum);
			}
			if (b == 4)
			{
				sum = c + 90;
				System.out.printf("%d",sum);
			}
			if (b == 5)
			{
				sum = c + 120;
				System.out.printf("%d",sum);
			}
			if (b == 6)
			{
				sum = c + 151;
				System.out.printf("%d",sum);
			}
			if (b == 7)
			{
				sum = c + 181;
				System.out.printf("%d",sum);
			}
			if (b == 8)
			{
				sum = c + 212;
				System.out.printf("%d",sum);
			}
			if (b == 9)
			{
				sum = c + 243;
				System.out.printf("%d",sum);
			}
			if (b == 10)
			{
				sum = c + 273;
				System.out.printf("%d",sum);
			}
			if (b == 11)
			{
				sum = c + 304;
				System.out.printf("%d",sum);
			}
			if (b == 12)
			{
				sum = c + 334;
				System.out.printf("%d",sum);
			}
		}
	}
}

