package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		int[] d = new int[N];
		int[] e = new int[N];
		int[] f = new int[N];
		int[] s = new int[N];
		int i;
		int n;
		n = 0;
		for (i = 0;i < N;i++)
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
			n++;
				if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
				{
					break;
				}
		}
		for (i = 0;i < n - 1;i++)
		{
			s[i] = (d[i] - a[i] + 12) * 3600 + (e[i] - b[i]) * 60 + (f[i] - c[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d\n", s[i]);
		}
		return 0;
	}


}

