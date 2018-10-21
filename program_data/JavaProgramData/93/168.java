package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int b;
		int c;
		a = 3;
		b = 5;
		c = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m % 3 == 0)
		{
			System.out.printf("%d",a);
			if (m % 5 == 0)
			{
				System.out.printf(" %d",b);
			}
			{
				if (m % 7 == 0)
				{
					System.out.printf(" %d",c);
				}
		}
		}
		else if (m % 5 == 0)
		{
			System.out.printf("%d",b);
			if (m % 3 == 0)
			{
				System.out.printf(" %d",a);
			}
			{
				if (m % 7 == 0)
				{
					System.out.printf(" %d",c);
				}
		}
		}
		else if (m % 7 == 0)
		{
			System.out.printf("%d",c);
			if (m % 3 == 0)
			{
				System.out.printf(" %d",a);
			}
			{
				if (m % 5 == 0)
				{
					System.out.printf(" %d",b);
				}
		}
		}
		else
		{
			System.out.print("n");
		}
		System.out.print("\n");
	}



}

