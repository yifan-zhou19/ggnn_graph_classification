package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int g;
		int s;
		int b;
		int q;
		int w;
		int p;
		int xnum;
		xnum = Math.abs(num);
		if (num < 0)
		{
			System.out.print("-");
		}
		{
		if (xnum > 9999)
		{
			p = 5;
		}
		else if (xnum > 999)
		{
			p = 4;
		}
		else if (xnum > 99)
		{
			p = 3;
		}
		else if (xnum > 9)
		{
			p = 5;
		}
		else
		{
			p = 1;
		}
		w = xnum / 10000;
		q = (int)(xnum - w * 10000) / 1000;
		b = (int)(xnum - w * 10000 - q * 1000) / 100;
		s = (int)(xnum - w * 10000 - q * 1000 - b * 100) / 10;
		g = (int)(xnum - w * 10000 - q * 1000 - b * 100 - s * 10);
		switch (p)
		{
		case 5:
		{
			if (g != 0)
			{
			   System.out.printf("%d%d%d%d%d",g,s,b,q,w);
			}
			if (g == 0 && s != 0)
			{
				System.out.printf("%d%d%d%d",s,b,q,w);
			}
			if (g == 0 && s == 0 && b != 0)
			{
				System.out.printf("%d%d%d",b,q,w);
			}
			if (g == 0 && s == 0 && b != 0 && q != 0)
			{
				System.out.printf("%d%d",q,w);
			}
			 if (g == 0 && s == 0 && b != 0 && q == 0 && g != 0)
			 {
				 System.out.printf("%d",w);
			 }
			 break;
		}


		case 4:
		{
			if (g != 0)
			{
			System.out.printf("%d%d%d%d",g,s,b,q);
			}
			if (g == 0 && s != 0)
			{
				System.out.printf("%d%d%d",s,b,q);
			}
			if (g == 0 && s == 0 && b != 0)
			{
				System.out.printf("%d%d",b,q);
			}
			if (g == 0 && s == 0 && b == 0 && q != 0)
			{
				System.out.printf("%d",q);
			}
			break;
		}
		case 3:
		{
			if (g != 0)
			{
			System.out.printf("%d%d%d",g,s,b);
			}
			if (g == 0 && s != 0)
			{
				System.out.printf("%d%d",s,b);
			}
			if (g == 0 && s == 0 && b != 0)
			{
				System.out.printf("%d",b);
			}
			break;
		}
		case 2:
		{
			if (g != 0)
			{
			System.out.printf("%d%d",g,s);
			}
			if (g = 0)
			{
				System.out.printf("%d",s);
			}
			break;
		}
		case 1:
			System.out.printf("%d",g);
			break;
		}
	}

	}
	public static void Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			  reverse(a[i]);
				System.out.print("\n");

		}
	}







}

