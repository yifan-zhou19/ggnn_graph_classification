package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int g;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int[] f = new int[1000];
		int i;
		int h;
		int sum;
		int s;
		int m;
		int[] u = new int[6];
		int q;
		for (i = 0;i < 1000;i++)
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
				q = i;
				if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
				{
				break;
				}
		}
		for (j = 0;j < q;j++)
		{
						h = d[j] - a[j] + 12;
						m = e[j] - b[j];
						s = f[j] - c[j];
						sum = 0;
						sum = 3600 * h + 60 * m + s;
						System.out.printf("%d\n",sum);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			g = Integer.parseInt(tempVar7);
		}
		return 0;
	}

}

