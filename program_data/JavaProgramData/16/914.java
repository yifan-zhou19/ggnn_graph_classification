package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int a;
	   int b;
	   int c;
	   int d;
	   int x;
	   int y;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x = Integer.parseInt(tempVar);
	   }
	   a = x / 1000;
	   b = (x - a * 1000) / 100;
	   c = (x - a * 1000 - b * 100) / 10;
	   d = x - a * 1000 - b * 100 - c * 10;
	   if (a == 0)
	   {
		   if (b == 0)
		   {
			   if (c == 0)
			   {
				   y = d;
			   }
			   else
			   {
				   y = d * 10 + c;
			   }
		   }
			else
			{
				y = d * 100 + c * 10 + b;
			}
	   }
		else
		{
			y = d * 1000 + c * 100 + b * 10 + a;
		}
		if (d == 0)
		{
			if (c == 0)
			{
				if (b == 0)
				{
					if (a == 0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.printf("000%d",y);
					}
				}
				else
				{
					System.out.printf("00%d",y);
				}
			}
			else
			{
				System.out.printf("0%d",y);
			}
		}
		else
		{
			System.out.printf("%d",y);
		}
	}

}

