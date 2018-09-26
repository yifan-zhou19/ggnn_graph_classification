package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int x;
		int y;
		int z;
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = 'n';
		x = 3;
		y = 5;
		z = 7;
		if (((a % 3 == 0) & (a % 5 == 0) & (a % 7 == 0)) == 1)
		{
											System.out.printf("%d %d %d",x,y,z);
		}
		if (((a % 3 != 0) & (a % 5 != 0) & (a % 7 != 0)) == 1)
		{
											 System.out.printf("%c",b);
		}
		if (((a % 7 == 0) & (a % 3 != 0) & (a % 5 != 0)) == 1)
		{
										   System.out.printf("%d",z);
		}
		if (((a % 3 == 0) & (a % 5 != 0) & (a % 7 != 0)) == 1)
		{
										   System.out.printf("%d",x);
		}
		if (((a % 5 == 0) & (a % 3 != 0) & (a % 7 != 0)) == 1)
		{
										   System.out.printf("%d",y);
		}
		if (((a % 3 == 0) & (a % 5 == 0) & (a % 7 != 0)) == 1)
		{
										   System.out.printf("%d %d",x,y);
		}
		if (((a % 7 == 0) & (a % 5 == 0) & (a % 3 != 0)) == 1)
		{
										   System.out.printf("%d %d",y,z);
		}
		if (((a % 3 == 0) & (a % 7 == 0) & (a % 5 != 0)) == 1)
		{
										   System.out.printf("%d %d",x,z);
		}
		return 0;
	}

}

