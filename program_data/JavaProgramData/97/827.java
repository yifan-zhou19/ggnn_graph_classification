package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		a = n / 100;
		if (a != 0)
		{
			System.out.printf("%d\n",a);
			a = n % 100;
		}
		else
		{
			a = 0;
			System.out.printf("%d\n",a);
			a = n;
		}
			if (a < 50)
			{
				b = 0;
				System.out.printf("%d\n",b);
				b = a;
			}
			else
			{
				b = a / 50;
				System.out.printf("%d\n",b);
				b = a % 50;
			}
			if (b < 20)
			{
				c = 0;
				System.out.printf("%d\n",c);
				c = b;
			}
			else
			{
				c = b / 20;
				System.out.printf("%d\n",c);
				c = b % 20;
			}
			if (c < 10)
			{
				d = 0;
				System.out.printf("%d\n",d);
				d = c;
			}
			else
			{
				d = c / 10;
				System.out.printf("%d\n",d);
				d = c % 10;
			}
				if (d < 5)
				{
				e = 0;
				System.out.printf("%d\n",e);
				e = d;
				}
			else
			{
				e = d / 5;
				System.out.printf("%d\n",e);
				e = d % 5;
			}
				if (e == 0)
				{
				f = 0;
				System.out.printf("%d\n",f);
				}
			else
			{
				f = e;
				System.out.printf("%d\n",f);
			}
			return 0;
	}






}

