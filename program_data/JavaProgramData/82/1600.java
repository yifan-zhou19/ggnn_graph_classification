package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int x;
		int y;
		y = 0;
		x = 0;
		i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				x = x + 1;
				i = i + 1;
			}
			else
			{
				if (y < x)
				{
					y = x;
					x = 0;
					i = i + 1;
				}
				else
				{
					x = 0;
					i = i + 1;
				}
			}
		}
					if (y < x)
					{
					y = x;
					System.out.printf("%d",y);
					}
					else
					{
					 System.out.printf("%d",y);
					}



		 return 0;
	}


}

