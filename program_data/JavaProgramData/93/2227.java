package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int a;
		int b;
		int c;
		a = 3;
		b = 5;
		c = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if (i % 3 == 0)
		{
			if (i % 5 == 0 && i % 7 == 0)
			{
				System.out.printf("%d %d %d",a,b,c);
			}
			else if (i % 5 == 0 && i % 7 != 0)
			{
				System.out.printf("%d %d",a,b);
			}
			else if (i % 5 != 0 && i % 7 == 0)
			{
				System.out.printf("%d %d",a,c);
			}
			else
			{
				System.out.printf("%d",a);
			}
		}
		else if (i % 5 == 0)
		{
			if (i % 7 == 0)
			{
				System.out.printf("%d %d",b,c);
			}
			else
			{
				System.out.printf("%d",b);
			}
		}
		else if (i % 7 == 0)
		{
			System.out.printf("%d",c);
		}
		else
		{
			System.out.print("n");
		}
	}
}

