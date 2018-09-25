package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
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
		while (x >= 1 && y >= 1)
		{
			 if (x == y)
			 {
				 System.out.printf("%d",x);
			  break;
			 }
			 if (x < y)
			 {
				 while (x < y)
				 {
				 y = y / 2;
				 }
			 }
			 else
			 {
				 while (x > y)
				 {
				 x = x / 2;
				 }
			 }
		}
		return 0;
	}
}

