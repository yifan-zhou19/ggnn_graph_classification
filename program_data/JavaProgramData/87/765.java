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
		int n;
		int[] s = new int[1000];
		for (i = 0;i < 1000;i++)
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
			if (a[i] == 0)
			{
				n = i;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
				d[i] = d[i] + 12;
		}
		for (i = 0;i < n;i++)
		{
			if (f[i] < c[i])
			{
				f[i] = f[i] + 60;
				e[i] = e[i] - 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (e[i] < b[i])
			{
				e[i] = e[i] + 60;
				d[i]--;
			}
			s[i] = (d[i] - a[i]) * 3600 + (e[i] - b[i]) * 60 + (f[i] - c[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
		return 0;
	}

}

