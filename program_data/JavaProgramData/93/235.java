package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		char ch = 'n';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if ((a % 3 == 0) && (a % 5 == 0) && (a % 7 == 0))
		{
			System.out.printf("%d %d %d",3,5,7);
		}
		else if ((a % 3 == 0) && (a % 5 == 0) && (!(a % 7 == 0)))
		{
			System.out.printf("%d %d",3,5);
		}
		else if ((a % 3 == 0) && (!(a % 5 == 0)) && (a % 7 == 0))
		{
			System.out.printf("%d %d",3,7);
		}
		else if ((!(a % 3 == 0)) && (a % 5 == 0) && (a % 7 == 0))
		{
			System.out.printf("%d %d",5,7);
		}
		else if ((a % 3 == 0) && (!(a % 5 == 0)) && (!(a % 7 == 0)))
		{
			System.out.printf("%d",3);
		}
		else if ((!(a % 3 == 0)) && (a % 5 == 0) && (!(a % 7 == 0)))
		{
			System.out.printf("%d",5);
		}
		else if ((!(a % 3 == 0)) && (!(a % 5 == 0)) && (a % 7 == 0))
		{
			System.out.printf("%d",7);
		}
		else
		{
			System.out.printf("%c",ch);
		}
		return 0;
	}

}

