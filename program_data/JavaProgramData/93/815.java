package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m % 3;
		b = m % 5;
		c = m % 7;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.printf("%d %d %d",3,5,7);
		}
		else if (a == 0 && b == 0 && c != 0)
		{
			System.out.printf("%d %d",3,5);
		}
		else if (a == 0 && b != 0 && c == 0)
		{
			System.out.printf("%d %d",3,7);
		}
		else if (a != 0 && b == 0 && c == 0)
		{
			System.out.printf("%d %d",5,7);
		}
		else if (a == 0 && b != 0 && c != 0)
		{
			System.out.printf("%d",3);
		}
		else if (a != 0 && b == 0 && c != 0)
		{
			System.out.printf("%d",5);
		}
		else if (a != 0 && b != 0 && c == 0)
		{
			System.out.printf("%d",7);
		}
		else
		{
		System.out.print("n");
		}
		return 0;
	}
}

