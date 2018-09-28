package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 3;
		int c = 5;
		int d = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.printf("%d %d %d",b,c,d);
		}
		else if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.printf("%d %d",b,c);
		}
		else if (a % 3 == 0 && a % 5 != 0 && a % 7 == 0)
		{
			System.out.printf("%d %d",b,d);
		}
		else if (a % 3 != 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.printf("%d %d",c,d);
		}
		else if (a % 3 == 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.printf("%d",b);
		}
		else if (a % 3 != 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.printf("%d",c);
		}
		else if (a % 3 != 0 && a % 5 != 0 && a % 7 == 0)
		{
			System.out.printf("%d",d);
		}
		else if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.printf("%c",'n');
		}
			return 0;
	}
}

