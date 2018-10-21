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
		int shui;
		int qi;
		int ms;
		int m;
		int n;
		int o;
		int p;
		int q;
		int r;
		int js = 0;
		int pd = 1;
		for (js = 0;pd != 0;js++)
		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				e = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				f = Integer.parseInt(tempVar6);
			}
			if ((a == 0) && (b == 0) && (c == 0) && (d == 0) && (e == 0) && (f == 0))
			{
				pd = 0;
			}
			else
			{
			shui = a * 3600 + b * 60 + c;
			qi = (d + 12) * 3600 + e * 60 + f;
			ms = qi - shui;
			if (js != 0)
			{
				System.out.print("\n");
			}
			System.out.printf("%d",ms);
			}
		}
		return 0;
	}



}

