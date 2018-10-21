package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		char n;
		a = 'n';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m % 3 == 0 && m % 5 == 0 && m % 7 == 0)
		{
			System.out.print("3 5 7");
		}
		else if (m % 3 == 0 && m % 5 == 0)
		{
			System.out.print("3 5");
		}
		else if (m % 3 == 0 && m % 7 == 0)
		{
			System.out.print("3 7");
		}
		else if (m % 5 == 0 && m % 7 == 0)
		{
			System.out.print("5 7");
		}
		else if (m % 3 == 0)
		{
			System.out.print("3");
		}
		else if (m % 5 == 0)
		{
			System.out.print("5");
		}
		else if (m % 7 == 0)
		{
			System.out.print("7");
		}
		else
		{
			System.out.printf("%c",a);
		}
			return 0;
	}
}

