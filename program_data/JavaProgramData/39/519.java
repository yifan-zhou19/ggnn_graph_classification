package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int r;
		char[][] a = new char[101][50];
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		int[] d = new int[101];
		int[] e = new int[101];
		int[] f = new int[101];
		int[] g = new int[150];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			g[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				e[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				f[i] = Integer.parseInt(tempVar7);
			}
			if (d[i] > 80 && f[i] >= 1)
			{
				g[i] = g[i] + 8000;
			}
			if (d[i] > 85 && e[i] > 80)
			{
				g[i] = g[i] + 4000;
			}
			if (d[i] > 90)
			{
				g[i] = g[i] + 2000;
			}
			if (d[i] > 85 && c.charAt(i) == 'Y')
			{
				g[i] = g[i] + 1000;
			}
			if (e[i] > 80 && b.charAt(i) == 'Y')
			{
				g[i] = g[i] + 850;
			}
		}
		g[101] = 0;
		g[102] = 0;
		for (i = 0;i < n;i++)
		{
			g[102] = g[102] + g[i];
			if (g[i] > g[101])
			{
				g[101] = g[i];
				r = i;
			}

		}

		System.out.printf("%s\n",a[r]);
		System.out.printf("%d\n",g[101]);
		System.out.printf("%d\n",g[102]);

	}
}

