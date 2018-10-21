package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b = 3;
		int c = 5;
		int d = 7;
		char e = 'n';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % b == 0 && a % c == 0 && a % d == 0)
		{
			System.out.printf("%d %d %d",b,c,d);
		}
		if (a % b == 0 && a % c == 0 && a % d != 0)
		{
			System.out.printf("%d %d",b,c);
		}
		if (a % b == 0 && a % c != 0 && a % d == 0)
		{
			System.out.printf("%d %d",b,d);
		}
		if (a % b != 0 && a % c == 0 && a % d == 0)
		{
			System.out.printf("%d %d",c,d);
		}
		if (a % b != 0 && a % c != 0 && a % d == 0)
		{
			System.out.printf("%d",d);
		}
		if (a % b != 0 && a % c == 0 && a % d != 0)
		{
			System.out.printf("%d",c);
		}
		if (a % b == 0 && a % c != 0 && a % d != 0)
		{
			System.out.printf("%d",b);
		}
		if (a % b != 0 && a % c != 0 && a % d != 0)
		{
			System.out.printf("%c",e);
		}
	}

}

