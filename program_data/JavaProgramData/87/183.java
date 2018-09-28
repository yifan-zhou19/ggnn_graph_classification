package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] q = new int[1000];
		int[] w = new int[1000];
		int[] e = new int[1000];
		int[] r = new int[1000];
		int[] t = new int[1000];
		int[] y = new int[1000];
		int[] sum = new int[1000];
		int a;
		int s;
		int d;
		int f;
		int g;
		int h;
		int i = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			f = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			g = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			h = Integer.parseInt(tempVar6);
		}
		while ((a != 0) || (s != 0) || (d != 0) || (f != 0) || (g != 0) || (h != 0))
		{
			 q[i] = (11 - a) * 3600;
			w[i] = (59 - s) * 60;
			e[i] = 60 - d;
			r[i] = 3600 * f;
			t[i] = 60 * g;
			y[i] = h;
			sum[i] = q[i] + w[i] + e[i] + r[i] + t[i] + y[i];
			i++;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				s = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				d = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				f = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				g = Integer.parseInt(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				h = Integer.parseInt(tempVar12);
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d\n",sum[j]);
		}
		return 0;
	}

}

