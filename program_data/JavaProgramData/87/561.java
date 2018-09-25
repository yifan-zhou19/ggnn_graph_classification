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
		int[] r = new int[1000];
		int k = 0;
		int i;
		for (i = 0;i < 1000;i++)
		{
			k += 1;
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
		if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
		{
			break;
		}
		}
		for (i = 0;i < k - 1;i++)
		{
			r[i] = 3600 * (11 - a[i] + d[i]) + 60 * (59 - b[i] + e[i]) + 60 - c[i] + f[i];
			System.out.printf("%d\n",r[i]);
		}
		return 0;
	}

}

