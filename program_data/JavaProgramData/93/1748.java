package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e = 3;
		int f = 5;
		int g = 7;
		char c1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 3;
		c = a % 5;
		d = a % 7;
		c1 = 'n';
		if (b == 0)
		{
			if (c == 0)
			{
				if (d == 0)
				{
					System.out.printf("%d %d %d\n",e,f,g);
				}
				else
				{
					System.out.printf("%d %d\n",e,f);
				}
			}
			else
			{
				if (d == 0)
				{
					System.out.printf("%d %d\n",e,g);
				}
				else
				{
					System.out.printf("%d\n",e);
				}
			}
		}
		else
		{
			if (c == 0)
			{
				if (d == 0)
				{
					System.out.printf("%d %d\n",f,g);
				}
				else
				{
					System.out.printf("%d\n",f);
				}
			}

			else
			{
				if (d == 0)
				{
					System.out.printf("%d\n",g);
				}
				else
				{
					System.out.printf("%c\n",c1);
				}
			}
		}
	}
}

