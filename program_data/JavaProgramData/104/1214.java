package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int t;
		int x;
		int y;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x == 1 || y == 1)
		{
			System.out.print("1");
		}
		else if (x == y)
		{
			System.out.printf("%d",x);
		}
		else if (x != y)
		{
			if (y > x)
			{
				a = x;
				x = y;
				y = a;
			}
				do
				{
					x /= 2;
					if (x < y)
					{
						t = x;
						x = y;
						y = t;
					}
				}while (x != y);

			System.out.printf("%d",x);
		}



	}



}

