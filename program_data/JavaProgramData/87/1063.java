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
		int i;
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;
		int f1;
		int num = 0;
		int zh;
		int zq;
		int zc;
		int ans;
		for (i = 0;i >= 0;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a1 = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d1 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				e1 = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				f1 = Integer.parseInt(tempVar6);
			}
			if (a1 == 0)
			{
				break;
			}
			else
			{
				a[i] = a1;
				b[i] = b1;
				c[i] = c1;
				d[i] = d1;
				e[i] = e1;
				f[i] = f1;
				num++;
			}
		}
		for (i = 0;i < num;i++)
		{
			zc = 0;
			zq = 0;
			zh = 0;
			ans = 0;
			zc = 3600 * (12 - a[i] + d[i]);
			zq = 60 * b[i] + c[i];
			zh = 60 * e[i] + f[i];
			ans = zc + zh - zq;
			System.out.printf("%d\n",ans);
		}
		return 0;
	}
}

