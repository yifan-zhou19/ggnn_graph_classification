package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int[] m = new int[100];
		int n;
		int i;
		n = 0;
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[n] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[n] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c[n] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d[n] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e[n] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f[n] = Integer.parseInt(tempVar6);
		}
		n++;
		} while (a[n - 1] != 0);

		for (i = 0;i < n - 1;i++)
		{
		m[i] = 3600 * (d[i] - a[i] + 12) + 60 * (e[i] - b[i]) + f[i] - c[i];

		System.out.printf("%d\n",m[i]);
		}
		return 0;
	}



}

