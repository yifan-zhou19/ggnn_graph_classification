package <missing>;

public class GlobalMembers
{
	public static int mycomp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
		int n;
		int iw;
		int ib;
		int re;
		int jw;
		int jb;
		int[] tj = new int[1000];
		int[] qw = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			for (iw = 0;iw < n;iw++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tj[iw] = Integer.parseInt(tempVar2);
				}
			}
			for (iw = 0;iw < n;iw++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qw[iw] = Integer.parseInt(tempVar3);
				}
			}
			qsort(tj,n,(Integer.SIZE / Byte.SIZE),mycomp);
			qsort(qw,n,(Integer.SIZE / Byte.SIZE),mycomp);
			iw = 0;
			jw = 0;
			re = 0;
			ib = n - 1;
			jb = n - 1;
			while (iw <= ib)
			{
				if (tj[iw] > qw[jw])
				{
					re += 200;
					iw++;
					jw++;
				}
				else if (tj[iw] < qw[jw])
				{
					if (tj[iw] < qw[jb])
					{
						re -= 200;
					}
					else if (tj[iw] > qw[jb])
					{
						re += 200;
					}
					iw++;
					jb--;
				}
				else if (tj[ib] > qw[jb])
				{
					re += 200;
					ib--;
					jb--;
				}
				else if (tj[ib] < qw[jb])
				{
					re -= 200;
					iw++;
					jb--;
				}
				else
				{
					if (tj[iw] < qw[jb])
					{
						re -= 200;
					}
					iw++;
					jb--;
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

