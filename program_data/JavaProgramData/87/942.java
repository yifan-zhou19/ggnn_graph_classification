package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int l;
		int m;
		int n;
		int o;
		int i = 0;
		for (i;i <= 500;i++)
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
			if (1 <= a != 0 && a <= 11 && 1 <= d != 0 && d <= 11 && 0 <= b != 0 && b <= 59 && 0 <= c != 0 && c <= 59 && 0 <= e != 0 && e <= 59 && f >= 0 && f <= 59)
			{
				l = 3600 * a + 60 * b + c;
				m = 3600 * (d + 12) + 60 * e + f;
				n = m - l;
				System.out.printf("%d\n",n);
			}
			else
			{
				return 0;
			}
		}
	}

}

