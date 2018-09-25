package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x = 0;
		int y = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int[] f = new int[1000];
		int[] s = new int[1000];
		int[] h = new int[1000];
		int[] i = new int[1000];
		int[] j = new int[1000];
		for (x = 0;x < 10;x++)
		{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[x] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[x] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c[x] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d[x] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e[x] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f[x] = Integer.parseInt(tempVar6);
		}
		if ((a[x] == 0) && (b[x] == 0) && (c[x] == 0) && (d[x] == 0) && (e[x] == 0) && (f[x] == 0))
		{
			break;

		}
		else
		{

			d[x] += 12;

		h[x] = (d[x] - a[x]) * 3600;
		i[x] = (e[x] - b[x]) * 60;
		j[x] = f[x] - c[x];
		s[x] = h[x] + i[x] + j[x];
	y += 1;

		}
		}
		for (x = 0;x < y;x++)
		{

		System.out.printf("%d\n",s[x]);
		}
		return 0;
	}
}

