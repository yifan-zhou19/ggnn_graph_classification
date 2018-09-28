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
		int[] k = new int[100];
		int i;
		int j;
		for (i = 0;i < 100;i++)
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
				j = i;
				break;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (c[i] <= f[i] != 0 && b[i] < e[i])
			{
				k[i] = f[i] - c[i] + 60 * (e[i] - b[i]) + 3600 * (d[i] + 12 - a[i]);
			}
			else if (c[i] <= f[i] != 0 && b[i] >= e[i])
			{
				k[i] = f[i] - c[i] + 60 * (e[i] + 60 - b[i]) + 3600 * (d[i] + 11 - a[i]);
			}
			else if (c[i] > f[i] && b[i] < e[i])
			{
				k[i] = f[i] + 60 - c[i] + 60 * (e[i] - 1 - b[i]) + 3600 * (d[i] + 12 - a[i]);
			}
			else if (c[i] > f[i] && b[i] >= e[i])
			{
				k[i] = f[i] + 60 - c[i] + 60 * (e[i] + 59 - b[i]) + 3600 * (d[i] + 11 - a[i]);
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d\n",k[i]);
		}
		return 0;
	}

}

