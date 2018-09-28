package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = 3;
		int b = 5;
		int c = 7;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		if (d % (a * b * c) == 0)
		{
			System.out.printf("%d %d %d",a,b,c);
		}
		else if (d % (a * b) == 0)
		{
			System.out.printf("%d %d",a,b);
		}
		else if (d % (a * c) == 0)
		{
			System.out.printf("%d %d",a,c);
		}
		else if (d % (b * c) == 0)
		{
			System.out.printf("%d %d",b,c);
		}
		else if (d % a == 0)
		{
			System.out.printf("%d",a);
		}
		else if (d % b == 0)
		{
			System.out.printf("%d",b);
		}
		else if (d % c == 0)
		{
			System.out.printf("%d",c);
		}
		else
		{
			System.out.print("n");
		}
	}

}

