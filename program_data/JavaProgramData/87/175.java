package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int s;
		int d;
		int f;
		int g;
		int h;
		int j;
		int i = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				f = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				g = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				h = Integer.parseInt(tempVar6);
			}
			if (a == 0 && s == 0 && d == 0 && f == 0 && g == 0 && h == 0)
			{
				return 0;
			}
			else
			{
				j = (f - a + 12) * 3600 + (g - s) * 60 + (h - d);
				System.out.printf("%d\n",j);
			}
		}
		i++;


		return 0;
	}
}

