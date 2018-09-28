package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		char n;
		b = 3;
		c = 5;
		d = 7;
		n = 'n';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % b == 0)
		{
			if (a % c == 0)
			{
				if (a % d == 0)
				{
					System.out.printf("%d %d %d",b,c,d);
				}
				else
				{
					System.out.printf("%d %d",b,c);
				}
			}
			else
			{
				if (a % d == 0)
				{
					System.out.printf("%d %d",b,d);
				}
				else
				{
					System.out.printf("%d",b);
				}
			}
		}
		else
		{
			if (a % c == 0)
			{
				if (a % d == 0)
				{
					System.out.printf("%d %d",c,d);
				}
				else
				{
					System.out.printf("%d",c);
				}
			}
			else
			{
				if (a % d == 0)
				{
					System.out.printf("%d",d);
				}
				else
				{
					System.out.printf("%c",n);
				}
			}
		}
		return 0;
	}
}

