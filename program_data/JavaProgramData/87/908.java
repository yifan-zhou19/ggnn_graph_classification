package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][1];
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
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
			i = 0;
			while (true)
			{
				a = a * 3600;
				b = b * 60;
				d = (d + 12) * 3600;
				e = e * 60;
				sz[i][0] = d + e + f - a - b - c;
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					a = Integer.parseInt(tempVar7);
				}
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					b = Integer.parseInt(tempVar8);
				}
				String tempVar9 = ConsoleInput.scanfRead();
				if (tempVar9 != null)
				{
					c = Integer.parseInt(tempVar9);
				}
				String tempVar10 = ConsoleInput.scanfRead();
				if (tempVar10 != null)
				{
					d = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead();
				if (tempVar11 != null)
				{
					e = Integer.parseInt(tempVar11);
				}
				String tempVar12 = ConsoleInput.scanfRead();
				if (tempVar12 != null)
				{
					f = Integer.parseInt(tempVar12);
				}
				if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
				{
					break;
				}
				else
				{
					i++;
				}
			}
			for (g = 0; g <= i; g++)
			{
				System.out.printf("%d\n", sz[g][0]);
			}
			return 0;
	}
}

