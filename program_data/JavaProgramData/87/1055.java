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
		int[] n = new int[10000];
		int i = 1;
		while (true)
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
		if (a[i] == 0)
		{
			break;
		}
		d[i] = d[i] + 12;
		n[i] = (d[i] - a[i]) * 60 * 60 + (e[i] - b[i]) * 60 + f[i] - c[i];
		System.out.printf("%d\n",n[i]);
		i++;
		}
		return 0;
	}
}

