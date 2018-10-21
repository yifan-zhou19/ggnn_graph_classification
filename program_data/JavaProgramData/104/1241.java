package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int m;
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
	m = y;
	while (x >= 1)
	{
		while (y >= 1)
		{
		   if (y == x)
		   {
			   System.out.printf("%d",y);
			   return 0;
		   }
		   y = y / 2;
		   //printf("%d %d\n",x,y);
		}
		x = x / 2;
		y = m;
	}
	return 0;
	}
}

