package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 10000;
		c = a / 1000;
		d = a / 100;
		e = a / 10;
		f = a % 10;
		g = e % 10;
		h = d % 10;
		i = (a / 10) % 10;
		j = (a / 100) % 10;
		k = (a / 1000) % 10;
		if (b == 0)
		{
			if (c == 0)
			{
				if (d == 0)
				{
					if (e == 0)
					{
						System.out.printf("%d",f);
					}
					else
					{
					System.out.printf("%d%d",f,e);
					}
				}
				else
				{
				System.out.printf("%d%d%d",f,g,d);
				}
			}
			else
			{
				System.out.printf("%d%d%d%d",f,i,h,c);
			}
		}
		else
		{
		System.out.printf("%d%d%d%d%d",f,i,j,k,b);
		}
		return 0;
	}
}

