package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		int[] d = new int[10000];
		int[] e = new int[10000];
		int[] f = new int[10000];
		int s;
		int h;
		int m;
		int z;
		int j = 0;
		int n = 10000;
		for (int i = 0;i < n;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e[i] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f[i] = Integer.parseInt(tempVar6);
		}
		j++;
		if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
		{
			break;
		}
		}
		for (int k = 0;k < (j - 1);k++)
		{
		h = ((d[k] - a[k]) + 12) * 3600;
		m = (e[k] - b[k]) * 60;
		s = f[k] - c[k];
		z = h + m + s;
		System.out.printf("%d\n",z);
		}
		return 0;
	}
}

