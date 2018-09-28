package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 1)
		{
				 System.out.print("End");
		}
		else
		{
		for (int i = 1;;i++)
		{
				if (a % 2 == 0)
				{
						   b = a / 2;
						   System.out.printf("%d/2=%d\n",a,b);
						   a = b;
				}
				else
				{
					 b = a * 3 + 1;
					 System.out.printf("%d*3+1=%d\n",a,b);
					 a = b;
				}
				if (a == 1)
				{
						 System.out.print("End");
						 break;
				}
		}
		}
		 int y;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

