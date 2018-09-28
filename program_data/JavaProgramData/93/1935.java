package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m % 3;
		b = m % 5;
		c = m % 7;
		if (m % 3 == 0 && m % 5 == 0 && m % 7 == 0)
		{
		System.out.print("3 5 7");
		}
		else if (m % 3 != 0 && m % 5 == 0 && m % 7 == 0)
		{
		System.out.print("5 7");
		}
		else if (m % 3 == 0 && m % 5 != 0 && m % 7 == 0)
		{
		System.out.print("3 7");
		}
		else if (m % 3 == 0 && m % 5 == 0 && m % 7 != 0)
		{
		System.out.print("3 5");
		}
		else if (m % 3 != 0 && m % 5 != 0 && m % 7 == 0)
		{
		System.out.print("7");
		}
		else if (m % 3 == 0 && m % 5 != 0 && m % 7 != 0)
		{
		System.out.print("3");
		}
		else if (m % 3 != 0 && m % 5 == 0 && m % 7 != 0)
		{
		System.out.print("5");
		}
		if (m % 3 != 0 && m % 5 != 0 && m % 7 != 0)
		{
		System.out.print("n");
		}
	}
}

