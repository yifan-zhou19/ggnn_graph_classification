package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
			a = 3;
			b = 5;
			c = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		if (d % a == 0)
		{
		 if (d % b == 0)
		 {
		  if (d % c == 0)
		  {
		  System.out.printf("%d %d %d",a,b,c);
		  }
		  else
		  {
			  System.out.printf("%d %d",a,b);
		  }
		 }
		else
		{
			if (d % c == 0)
			{
				System.out.printf("%d %d",a,c);
			}
			 else
			 {
				 System.out.printf("%d",a);
			 }
		}
		}
		else
		{
			if (d % b == 0)
			{
				if (d % c == 0)
				{
					System.out.printf("%d %d",b,c);
				}
				else
				{
					System.out.printf("%d",b);
				}
			}
			else
			{
				if (d % c == 0)
				{
					System.out.printf("%d",c);
				}
				else
				{
					System.out.print("n");
				}
			}
		}
	}
}

