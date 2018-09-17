package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int n;
		int z;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = Integer.parseInt(tempVar3);
		}
		if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0)
		{
			if (n == 1)
			{
				y = z;
			System.out.printf("%d",y);
			}
			 else if (n == 2)
			 {
				 y = 31 + z;
			 System.out.printf("%d",y);
			 }
			else if (n == 3)
			{
				y = 31 + 29 + z;
			System.out.printf("%d",y);
			}
			 else if (n == 4)
			 {
				 y = 31 * 2 + 29 + z;
			 System.out.printf("%d",y);
			 }
			else if (n == 5)
			{
				y = 31 * 2 + 29 + 30 + z;
			System.out.printf("%d",y);
			}
			 else if (n == 6)
			 {
				 y = 31 * 3 + 29 + 30 + z;
			 System.out.printf("%d",y);
			 }
			else if (n == 7)
			{
				y = 31 * 3 + 29 + 30 * 2 + z;
			System.out.printf("%d",y);
			}
			else if (n == 8)
			{
				y = 31 * 4 + 29 + 30 * 2 + z;
			System.out.printf("%d",y);
			}
		   else if (n == 9)
		   {
			   y = 31 * 5 + 29 + 30 * 2 + z;
		   System.out.printf("%d",y);
		   }
			else if (n == 10)
			{
				y = 31 * 5 + 29 + 30 * 3 + z;
			System.out.printf("%d",y);
			}
		else if (n == 11)
		{
			y = 31 * 6 + 29 + 30 * 3 + z;
		System.out.printf("%d",y);
		}
			else if (n == 12)
			{
				y = 31 * 6 + 29 + 30 * 4 + z;
			System.out.printf("%d",y);
			}
		}

		else
		{
			if (n == 1)
			{
				y = z;
			System.out.printf("%d",y);
			}
		else if (n == 2)
		{
			y = 31 + z;
		System.out.printf("%d",y);
		}
		else if (n == 3)
		{
			y = 31 + 28 + z;
		System.out.printf("%d",y);
		}
			else if (n == 4)
			{
				y = 31 * 2 + 28 + z;
			System.out.printf("%d",y);
			}
		else if (n == 5)
		{
			y = 31 * 2 + 28 + 30 + z;
		System.out.printf("%d",y);
		}
		else if (n == 6)
		{
			y = 31 * 3 + 28 + 30 + z;
		System.out.printf("%d",y);
		}
		else if (n == 7)
		{
			y = 31 * 3 + 28 + 30 * 2 + z;
		System.out.printf("%d",y);
		}
			else if (n == 8)
			{
				y = 31 * 4 + 28 + 30 * 2 + z;
			System.out.printf("%d",y);
			}
			else if (n == 9)
			{
				y = 31 * 5 + 28 + 30 * 2 + z;
			System.out.printf("%d",y);
			}
			else if (n == 10)
			{
				y = 31 * 5 + 28 + 30 * 3 + z;
			System.out.printf("%d",y);
			}
			else if (n == 11)
			{
				y = 31 * 6 + 28 + 30 * 3 + z;
			System.out.printf("%d",y);
			}
			else if (n == 12)
			{
				y = 31 * 6 + 28 + 30 * 4 + z;
			System.out.printf("%d",y);
			}
		}
		return 0;
	}


}

