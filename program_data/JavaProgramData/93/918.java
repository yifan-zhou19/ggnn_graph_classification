package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
	   char n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.printf("%s","3 5 7");
		}
		else if (a % 3 == 0 && a % 5 == 0)
		{
			System.out.printf("%s","3 5");
		}
		else if (a % 3 == 0 && a % 7 == 0)
		{
			System.out.printf("%s","3 7");
		}
		else if (a % 7 == 0 && a % 5 == 0)
		{
			System.out.printf("%s","5 7");
		}
		else if (a % 3 == 0)
		{
			System.out.printf("%c",'3');
		}
		else if (a % 5 == 0)
		{
			System.out.printf("%c",'5');
		}
		else if (a % 7 == 0)
		{
			System.out.printf("%c",'7');
		}
		else
		{
			System.out.printf("%c",'n');
		}
		return 0;
	}

}

