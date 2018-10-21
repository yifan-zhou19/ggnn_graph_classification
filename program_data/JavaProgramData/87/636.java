package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int[] s = new int[100];
		int[] p = new int[100];
		int[] q = new int[100];
		int[] v = new int[100];
		int i;
		for (i = 1;a[i - 1] != 0;i++)
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
		}
		for (i = 1;a[i] != 0;i++)
		{
		if (f[i] >= c[i])
		{
			p[i] = f[i] - c[i];
			if (e[i] >= b[i])
			{
				q[i] = e[i] - b[i];
				v[i] = d[i] + 12 - a[i];
			}
			else
			{
				q[i] = 60 - b[i] + e[i];
				v[i] = d[i] + 12 - a[i] - 1;
			}
		}
		else
		{
			p[i] = 60 - c[i] + f[i];
			if ((e[i] - 1) >= b[i])
			{
				q[i] = e[i] - b[i] - 1;
				v[i] = d[i] + 12 - a[i];
			}
			else
			{
				q[i] = 60 - b[i] + e[i] - 1;
				v[i] = d[i] + 12 - a[i] - 1;
			}
		}
		s[i] = v[i] * 60 * 60 + q[i] * 60 + p[i];
		System.out.printf("%d\n",s[i]);
		}
		return 0;
	}
}

