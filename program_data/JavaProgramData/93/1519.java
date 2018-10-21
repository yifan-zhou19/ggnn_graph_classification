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
		if (a % b == 0 && a % c == 0 && a % d == 0)
		{
			System.out.printf("%d %d %d",b,c,d);
		}
		else if (a % b == 0 && a % c == 0 && a % d != 0)
		{
			System.out.printf("%d %d",b,c);
		}
		else if (a % b == 0 && a % d == 0 && a % c != 0)
		{
			System.out.printf("%d %d",b,d);
		}
		else if (a % c == 0 && a % d == 0 && a % b != 0)
		{
			System.out.printf("%d %d",c,d);
		}
		else if (a % b == 0 && a % c != 0 && a % d != 0)
		{
			System.out.printf("%d",b);
		}
		else if (a % c == 0 && a % d != 0 && a % b != 0)
		{
			System.out.printf("%d",c);
		}
		else if (a % d == 0 && a % c != 0 && a % b != 0)
		{
			System.out.printf("%d",d);
		}
		else
		{
		System.out.print("n");
		}
		return 0;
	}


}

