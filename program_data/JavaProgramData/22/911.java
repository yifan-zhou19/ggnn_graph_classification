package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int x1;
		int a = 0;
		int b = -1;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		a = x1;
		while ((scanf(",%d", x)) == 1)
		{

			if (a < x)
			{
				b = a;
				a = x;
			}
			if (a > x && b < x)
			{
				b = x;
			}
			flag = 1;
		}
		if (a > b && b != -1)
		{
	 System.out.printf("%d",b);
		}
		if (flag = 0 || b == a || b == -1)
		{
		System.out.print("No");
		}
	 return 0;
	}


}

