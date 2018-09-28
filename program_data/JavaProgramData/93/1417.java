package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 3;
		int c = 5;
		int d = 7;
		char n = 'n';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}

			if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
			{
				System.out.printf("%d %d %d",b,c,d);
			}
			if (a % 3 != 0 && a % 5 == 0 && a % 7 == 0)
			{
				System.out.printf("%d %d",c,d);
			}
			if (a % 3 == 0 && a % 5 != 0 && a % 7 == 0)
			{
				System.out.printf("%d %d",b,d);
			}
			if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0)
			{
				System.out.printf("%d %d",b,c);
			}
			if (a % 3 != 0 && a % 5 != 0 && a % 7 == 0)
			{
				System.out.printf("%d",d);
			}
			if (a % 3 != 0 && a % 5 == 0 && a % 7 != 0)
			{
				System.out.printf("%d",c);
			}
			if (a % 3 == 0 && a % 5 != 0 && a % 7 != 0)
			{
				System.out.printf("%d",b);
			}
			if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
			{
				System.out.printf("%c",n);
			}
			return 0;

	}

}

