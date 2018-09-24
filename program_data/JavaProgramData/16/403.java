package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		f = a % 10;
		a = (int)(a / 10);
		e = a % 10;
		a = (int)(a / 10);
		d = a % 10;
		a = (int)(a / 10);
		c = a % 10;
		a = (int)(a / 10);
		b = a % 10;
		if (b != 0)
		{
			System.out.printf("%d%d%d%d%d\n",f,e,d,c,b);
		}
		else
		{
			if (c != 0)
			{
				 System.out.printf("%d%d%d%d\n",f,e,d,c);
			}
			else
			{
				if (d != 0)
				{
					System.out.printf("%d%d%d\n",f,e,d);
				}
				else
				{
					if (e != 0)
					{
						System.out.printf("%d%d\n",f,e);
					}
					else
					{
						System.out.printf("%d\n",f,f);
					}
				}
			}
		}
	}

}

