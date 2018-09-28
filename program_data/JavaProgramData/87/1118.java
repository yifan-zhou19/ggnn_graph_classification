package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[80];
		int[] b = new int[80];
		int[] c = new int[80];
		int[] d = new int[80];
		int[] e = new int[80];
		int[] f = new int[80];
		int i;
		int s = 0;
		int t = 0;
		int m;
		for (i = 0;i < 80;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e[i] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f[i] = Integer.parseInt(tempVar6);
		}
		if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
		{
		break;
		}
		else
		{
			s = 3600 * a[i] + 60 * b[i] + c[i];
			d[i] += 12;
			t = 3600 * d[i] + 60 * e[i] + f[i];
			m = t - s;
			System.out.printf("%d\n",m);
		}
		}

		return 0;
	}
}

