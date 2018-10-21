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
	  int m;
	  int[] s = new int[1000];
	  int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c[0] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d[0] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e[0] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f[0] = Integer.parseInt(tempVar6);
		}

			while (a[i - 1] != 0 || b[i - 1] != 0 || c[i - 1] != 0 || d[i - 1] != 0 || e[i - 1] != 0 || f[i - 1] != 0)
			{

				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					a[i] = Integer.parseInt(tempVar7);
				}
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					b[i] = Integer.parseInt(tempVar8);
				}
				String tempVar9 = ConsoleInput.scanfRead();
				if (tempVar9 != null)
				{
					c[i] = Integer.parseInt(tempVar9);
				}
				String tempVar10 = ConsoleInput.scanfRead();
				if (tempVar10 != null)
				{
					d[i] = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead();
				if (tempVar11 != null)
				{
					e[i] = Integer.parseInt(tempVar11);
				}
				String tempVar12 = ConsoleInput.scanfRead();
				if (tempVar12 != null)
				{
					f[i] = Integer.parseInt(tempVar12);
				}
				i++;
			}
			m = i - 1;

			for (i = 0;i < m;i++)
			{
			s[i] = (d[i] + 12) * 3600 + e[i] * 60 + f[i] - a[i] * 3600 - b[i] * 60 - c[i];
				System.out.printf("%d\n",s[i]);
			}

	return 0;
	}
}

