package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int[] f = new int[1000];
		int i;
		int k;
		int[] s = new int[1000];
		for (i = 0;;i++)
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
			if ((a[i] == 0) && (b[i] == 0) && (c[i] == 0) && (d[i] == 0) && (e[i] == 0) && (f[i] == 0))
			{
				break;
			}
		}
		for (k = 0;k < i;k++)
		{
			if (f[k] < c[k])
			{
				s[k] += f[k] + 60 - c[k];
				e[k]--;
			}
			else
			{
				s[k] += f[k] - c[k];
			}
			if (e[k] < b[k])
			{
				s[k] += (e[k] + 60 - b[k]) * 60;
				d[k]--;
			}
			else
			{
				s[k] += (e[k] - b[k]) * 60;
			}
			s[k] += (d[k] + 12 - a[k]) * 3600;
			System.out.printf("%d\n",s[k]);
		}
		return 0;
	}
}

