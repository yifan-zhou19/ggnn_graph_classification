package <missing>;

public class GlobalMembers
{
	public static int mycomp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
		int[] tj = new int[1001];
		int[] qw = new int[1001];
		int n;
		int ibe;
		int jbe;
		int ien;
		int jen;
		int re;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			for (ibe = 0;ibe < n;ibe++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tj[ibe] = Integer.parseInt(tempVar2);
				}
			}
			for (jbe = 0;jbe < n;jbe++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qw[jbe] = Integer.parseInt(tempVar3);
				}
			}
			qsort(tj,n,(Integer.SIZE / Byte.SIZE),mycomp);
			qsort(qw,n,(Integer.SIZE / Byte.SIZE),mycomp);
			ibe = jbe = 0;
			ien = jen = n - 1;
			re = 0;
			while (ibe <= ien)
			{
				if (tj[ibe] > qw[jbe])
				{
					re += 200;
					ibe++;
					jbe++;
				}
				else if (tj[ibe] < qw[jbe])
				{
					if (tj[ibe] > qw[jen])
					{
						re += 200;
						ibe++;
						jen--;
					}
					else if (tj[ibe] < qw[jen])
					{
						re -= 200;
						ibe++;
						jen--;
					}
				}
				else if (tj[ien] > qw[jen])
				{
					re += 200;
					ien--;
					jen--;
				}
				else if (tj[ien] < qw[jen])
				{
					re -= 200;
					ibe++;
					jen--;
				}
				else
				{
					if (tj[ibe] < qw[jen])
					{
						re -= 200;
					}
					ibe++;
					jen--;
				}
			}
			System.out.printf("%d\n",re);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}

}

