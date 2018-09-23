package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int ercha = new int(int x,int y);
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
		System.out.printf("%d",ercha(x, y));
		return 0;
	}

	public static int ercha(int x,int y)
	{
			  if (x == y)
			  {
				  return x;
			  }
			  else
			  {
				  if (x > y)
				  {
				  x = x / 2;
				  }
				  else
				  {
				  y = y / 2;
				  }
				  ercha(x, y);
			  }
	}
}

