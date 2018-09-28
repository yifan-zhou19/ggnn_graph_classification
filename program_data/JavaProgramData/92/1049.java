package <missing>;

public class GlobalMembers
{
	public static int[] Tian = new int[MAXIN];
	public static int[] Qi = new int[MAXIN];

	public static int MyCompare(Object e1, Object e2)
	{
		return *(int) e1 - (int)e2;
	}

	public static int Main()
	{
		int n;
		while (scanf("%d", n) && n != 0)
		{
			int i;
			for (i = 0;i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					Tian[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					Qi[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(Tian, n, (Integer.SIZE / Byte.SIZE), MyCompare);
			qsort(Qi, n, (Integer.SIZE / Byte.SIZE), MyCompare);

			int Tp = 0;
			int Qtail = n - 1;
			int Ttail = n - 1;
			int Qp = 0;
			int ans = 0;
			while (Qp <= Qtail)
			{
				if (Tian[Tp] > Qi[Qp])
				{
					Tp++;
					Qp++;
					ans += 200;
				}
				else if (Tian[Tp] < Qi[Qp])
				{
					Qtail--;
					Tp++;
					ans -= 200;
				}
				else // Tian[Tp] == Qi[Qp]
				{
					if (Tian[Ttail] > Qi[Qtail])
					{
						Qtail--;
						Ttail--;
						ans += 200;
					}
					else
					{
						if (Tian[Tp] < Qi[Qtail])
						{
							ans -= 200;
						}
						Qtail--;
						Tp++;
					}
				}
			}

			System.out.printf("%d\n", ans);
		}
		return 0;
	}
}

