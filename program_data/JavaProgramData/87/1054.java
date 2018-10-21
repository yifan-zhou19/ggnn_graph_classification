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
		int[] D = new int[1000];
		int m1;
		int m2;
		int m;
		for (int i = 0;i < 1000;i++)
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
				D[i] = Integer.parseInt(tempVar4);
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
			d[i] = D[i] + 12;
			if (a[i] == 0 && b[i] == 0 && c[i] == 0 && D[i] == 0 && e[i] == 0 && f[i] == 0)
			{
				break;
			}
			else
			{
			m1 = 3600 * a[i] + 60 * b[i] + c[i];
			m2 = 3600 * d[i] + 60 * e[i] + f[i];
			m = m2 - m1;
			System.out.printf("%d\n",m);
			}
		}
		return 0;
	}

}

