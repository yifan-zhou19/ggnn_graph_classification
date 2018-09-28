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
		int i;
		int m;
		int n;
		int s;
		for (i = 1;i++;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				e = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				f = Integer.parseInt(tempVar6);
			}
			if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
			{
				break;
			}
			else
			{
				d = d + 12;
				m = c + b * 60 + a * 3600;
				n = f + e * 60 + d * 3600;
				s = n - m;
				System.out.printf("%d\n",s);
			}
		}
		return 0;
	}

}

