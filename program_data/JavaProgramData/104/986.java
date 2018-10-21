package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int x;
	int y;
	int i;
	int j;
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
	for (;;)
	{
	if (x > y)
	{
	 if (x % 2 == 0)
	 {
		 x = x / 2;
	 }
	 else
	 {
		 x = (x - 1) / 2;
	 }
	}
	else if (x < y)

	{
	 if (y % 2 == 0)
	 {
		 y = y / 2;
	 }
	 else
	 {
		 y = (y - 1) / 2;
	 }

	}
	if (x == y)
	{
		break;
	}
	}
	System.out.printf("%d",x);
	}
}

