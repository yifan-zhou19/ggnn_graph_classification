package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int m;
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
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			if (b == 1)
			{
				System.out.printf("%d",c);
			}
			if (b == 2)
			{
				m = 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 3)
			{
				m = 31 + 29 + c;
			System.out.printf("%d",m);
			}
			if (b == 4)
			{
				m = 31 + 29 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 5)
			{
				m = 31 + 29 + 31 + 30 + c;
			System.out.printf("%d",m);
			}
			if (b == 6)
			{
				m = 31 + 29 + 31 + 30 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 7)
			{
				m = 31 + 29 + 31 + 30 + 31 + 30 + c;
			System.out.printf("%d",m);
			}
			if (b == 8)
			{
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 9)
			{
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 10)
			{
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
			System.out.printf("%d",m);
			}
			if (b == 11)
			{
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 12)
			{
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c;
			System.out.printf("%d",m);
			}
		}
			else
			{
				if (b == 1)
				{
				System.out.printf("%d",c);
				}


			if (b == 2)
			{
				m = 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 3)
			{
				m = 31 + 28 + c;
			System.out.printf("%d",m);
			}
			if (b == 4)
			{
				m = 31 + 28 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 5)
			{
				m = 31 + 28 + 31 + 30 + c;
			System.out.printf("%d",m);
			}
			if (b == 6)
			{
				m = 31 + 28 + 31 + 30 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 7)
			{
				m = 31 + 28 + 31 + 30 + 31 + 30 + c;
			System.out.printf("%d",m);
			}
			if (b == 8)
			{
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 9)
			{
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 10)
			{
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
			System.out.printf("%d",m);
			}
			if (b == 11)
			{
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c;
			System.out.printf("%d",m);
			}
			if (b == 12)
			{
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c;
			System.out.printf("%d",m);
			}
			}
		return 0;
	}

}

