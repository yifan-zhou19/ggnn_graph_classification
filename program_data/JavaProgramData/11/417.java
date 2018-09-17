package <missing>;

public class GlobalMembers
{
	public static int Main()
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
			System.out.printf("%d",c);
		}
		if (b == 2)
		{
			sum = 31 + c;
			System.out.printf("%d",sum);
		}
		if (a % 4 == 0 && a % 100 != 0 || a % 100 == 0 && a % 400 == 0)
		{
			if (b == 3)
			{
				sum = 60 + c;
				System.out.printf("%d",sum);
			}
			if (b == 4)
			{
				sum = 91 + c;
				System.out.printf("%d",sum);
			}
			if (b == 5)
			{
				sum = 121 + c;
				System.out.printf("%d",sum);
			}
			if (b == 6)
			{
				sum = 152 + c;
				System.out.printf("%d",sum);
			}
			if (b == 7)
			{
				sum = 182 + c;
				System.out.printf("%d",sum);
			}
			if (b == 8)
			{
				sum = 213 + c;
				System.out.printf("%d",sum);
			}
			if (b == 9)
			{
				sum = 244 + c;
				System.out.printf("%d",sum);
			}
			if (b == 10)
			{
				sum = 274 + c;
				System.out.printf("%d",sum);
			}
			if (b == 11)
			{
				sum = 305 + c;
				System.out.printf("%d",sum);
			}
			if (b == 12)
			{
				sum = 335 + c;
				System.out.printf("%d",sum);
			}
		}
		else
		{
			if (b == 3)
			{
				sum = 59 + c;
				System.out.printf("%d",sum);
			}
			if (b == 4)
			{
				sum = 90 + c;
				System.out.printf("%d",sum);
			}
			if (b == 5)
			{
				sum = 120 + c;
				System.out.printf("%d",sum);
			}
			if (b == 6)
			{
				sum = 151 + c;
				System.out.printf("%d",sum);
			}
			if (b == 7)
			{
				sum = 181 + c;
				System.out.printf("%d",sum);
			}
			if (b == 8)
			{
				sum = 212 + c;
				System.out.printf("%d",sum);
			}
			if (b == 9)
			{
				sum = 243 + c;
				System.out.printf("%d",sum);
			}
			if (b == 10)
			{
				sum = 273 + c;
				System.out.printf("%d",sum);
			}
			if (b == 11)
			{
				sum = 304 + c;
				System.out.printf("%d",sum);
			}
			if (b == 12)
			{
				sum = 334 + c;
				System.out.printf("%d",sum);
			}
		}
		return 0;
	}
}

