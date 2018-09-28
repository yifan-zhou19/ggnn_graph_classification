package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		while (x != 1)
		{
			if (x % 2 == 0)
			{
				 y = x / 2;
			   System.out.printf("%d/2=%d\n",x,y);
			   x = y;
			   continue;
			}
			if (x % 2 != 0)
			{
				y = x * 3 + 1;
				System.out.printf("%d*3+1=%d\n",x,y);
				x = y;
			}
		}
		System.out.print("End");
	}



}

