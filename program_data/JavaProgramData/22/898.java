package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int a;
		int b;
		int c = 0;
		int h = 1;
		int x = 1;
		int m = 0;
		char g;
		char f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			f = tempVar2.charAt(0);
		}
		if (f != ',')
		{
			System.out.print("No");
		}
		else
		{
			b = e;
			for (g = ',';g == ',';)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					g = tempVar4.charAt(0);
				}
				if (a != b)
				{
					h = 0;
				}
				if (a > b)
				{
					c = b;
					b = a;
					x = 0;
				}
				if (b > a && a > c)
				{
					c = a;
					x = 0;
				}
				if (m <= a != 0 && a != b)
				{
					m = a;
				}
			}
			if (h == 1)
			{
				System.out.print("No\n");
			}
			else if (x == 1)
			{
				System.out.printf("%d\n",m);
			}
			else if (x == 0)
			{
				System.out.printf("%d\n",c);
			}
		}
		return 0;
	}










}

