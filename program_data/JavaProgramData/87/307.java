package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] e = new int[100];
		int[] d = new int[100];
		int[] f = new int[100];
		int i;
		int j = 0;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c[0] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d[0] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e[0] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f[0] = Integer.parseInt(tempVar6);
		}
		for (i = 0;d[i] != 0;i++)
		{
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i + 1] = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				b[i + 1] = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				c[i + 1] = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				d[i + 1] = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				e[i + 1] = Integer.parseInt(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				f[i + 1] = Integer.parseInt(tempVar12);
			}
			j++;
		}
		for (i = 0;i < j;i++)
		{
			s = (d[i] + 12 - a[i]) * 3600 + (e[i] - b[i]) * 60 + f[i] - c[i];
			System.out.printf("%d\n",s);
		}
		return 0;
	}

}

