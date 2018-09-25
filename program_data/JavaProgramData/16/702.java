package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		int d1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a1 = n % 10;
		a2 = n / 10;
		if (a2 > 0)
		{
			b1 = a2 % 10;
			b2 = a2 / 10;
			if (b2 > 0)
			{
				  c1 = b2 % 10;
				  c2 = b2 / 10;
				  if (c2 > 0)
				  {
						d1 = c2 % 10;
						 System.out.printf("%d%d%d%d",a1,b1,c1,d1);
				  }
				  else
				  {
						 System.out.printf("%d%d%d",a1,b1,c1);
				  }
			}
			else
			{
				System.out.printf("%d%d",a1,b1);
			}
		}
		else
		{
		System.out.printf("%d",a1);
		}
		return 0;
	}
}

