package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int app = new int(int x,int y);
		int s;
		int x;
		int y;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= s;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 x = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 y = Integer.parseInt(tempVar3);
						 }
						 System.out.printf("%d\n",app(x, y));
		}
		return 0;
	}





	public static int app(int x,int y)
	{
		if (x < y && y != 1)
		{
			 return app(x, y - 1);
		}
		else if (y == 1)
		{
			 return 1;
		}
		else
		{
			 return (app(x, y - 1) + app(x - y, y));
		}
	}
}

