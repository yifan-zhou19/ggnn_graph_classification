package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int d;
		b = 3;
		c = 5;
		d = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.printf("%d %d %d",b,c,d);
		}
		else if (a % 3 == 0 && a % 5 == 0)
		{
			System.out.printf("%d %d",b,c);
		}
		else if (a % 3 == 0 && a % 7 == 0)
		{
			System.out.printf("%d %d",b,d);
		}
		else if (a % 5 == 0 && a % 7 == 0)
		{
			System.out.printf("%d %d",c,d);
		}
		else if (a % 3 == 0)
		{
			System.out.printf("%d",b);
		}
		else if (a % 5 == 0)
		{
			System.out.printf("%d",c);
		}
		else if (a % 7 == 0)
		{
			System.out.printf("%d",d);
		}
		else
		{
			System.out.print("n");
		}
	}


}

