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
		int[] s = new int[100];
		int p;
		int i = 0;
		for (p = 0;p < 100;p++)
		{
						  s[p] = 0;
		}
		for (p = 0;p < 100;p++)
		{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							a[p] = Integer.parseInt(tempVar);
						}
						String tempVar2 = ConsoleInput.scanfRead(" ");
						if (tempVar2 != null)
						{
							b[p] = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							c[p] = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead(" ");
						if (tempVar4 != null)
						{
							d[p] = Integer.parseInt(tempVar4);
						}
						String tempVar5 = ConsoleInput.scanfRead(" ");
						if (tempVar5 != null)
						{
							e[p] = Integer.parseInt(tempVar5);
						}
						String tempVar6 = ConsoleInput.scanfRead(" ");
						if (tempVar6 != null)
						{
							f[p] = Integer.parseInt(tempVar6);
						}
						i++;
						if (a[p] == 0 && b[p] == 0 && c[p] == 0 && d[p] == 0 && e[p] == 0 && f[p] == 0)
						{
															  break;
						}
		}
		for (p = 0;p < i - 1;p++)
		{
		if (f[p] >= c[p])
		{
				s[p] += f[p] - c[p];
		}
		else
		{
			s[p] += f[p] + 60 - c[p];
			e[p]--;
		}
		if (e[p] >= b[p])
		{
				s[p] += (e[p] - b[p]) * 60;
		}
		else
		{
			s[p] += (e[p] + 60 - b[p]) * 60;
			d[p]--;
		}
		s[p] += (d[p] + 12 - a[p]) * 3600;
		}
		for (p = 0;p < i - 1;p++)
		{
						System.out.printf("%d\n",s[p]);
		}
		return 0;
	}
}

