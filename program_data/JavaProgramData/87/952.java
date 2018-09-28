package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int[] a = new int[20];
		int[] b = new int[64];
		int[] c = new int[66];
		int[] d = new int[66];
		int[] e = new int[66];
		int[] f = new int[66];
		int[] s = new int[66];
		for (i = 1;;i++)
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
			if (a[i] == 0 && b[i] == 0 && c[i] == 0)
			{
				break;
			}
			d[i] = 12 + d[i];
			if (f[i] < c[i])
			{
				f[i] = f[i] + 60;
				e[i] = e[i] - 1;
			}
			if (e[i] < b[i])
			{
				e[i] = e[i] + 60;
				d[i] = d[i] - 1;
			}
			s[i] = (f[i] - c[i]) + (e[i] - b[i]) * 60 + (d[i] - a[i]) * 3600;
			m = i;
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%d\n", s[i]);
		}
		return 0;
	}

}

