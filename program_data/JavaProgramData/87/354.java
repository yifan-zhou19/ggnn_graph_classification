package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[999];
		int[] b = new int[999];
		int[] c = new int[999];
		int[] d = new int[999];
		int[] e = new int[999];
		int[] f = new int[999];
		int[] z = new int[999];
		int i;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				(a[i]) = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				(b[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(c[i]) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(d[i]) = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				(e[i]) = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				(f[i]) = Integer.parseInt(tempVar6);
			}
			if (a[i] == 0)
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			z[i] = 3600 * d[i] + 60 * e[i] + f[i] + 3600 * (12 - a[i]) - 60 * b[i] - c[i];
			if (a[i] == 0)
			{
				break;
			}
			System.out.printf("%d\n",z[i]);
		}
		return 0;
	}
}

