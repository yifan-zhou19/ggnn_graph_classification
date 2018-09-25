package <missing>;

public class GlobalMembers
{
	public static int[] Q_hs = new int[MAX];
	public static int[] T_hs = new int[MAX];

	public static int hs_cmp(Object p, Object q)
	{
			return *(int)p - (int)q;
	}

	public static int Main(int ac, String[] av)
	{
			int n;
			while (scanf("%d", n), n)
			{
					int i;
					for (i = 0; i < n; i++)
					{
							String tempVar = ConsoleInput.scanfRead();
							if (tempVar != null)
							{
								T_hs[i] = Integer.parseInt(tempVar);
							}
					}
					for (i = 0; i < n; i++)
					{
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								Q_hs[i] = Integer.parseInt(tempVar2);
							}
					}

					qsort(Q_hs, n, (Integer.SIZE / Byte.SIZE), hs_cmp);
					qsort(T_hs, n, (Integer.SIZE / Byte.SIZE), hs_cmp);

					for (i = 0; i < n; i++)
					{
							System.out.printf("(%d %d) ", Q_hs[i], T_hs[i]);
					}
					System.out.print("\n");

					/* greedy strategy */
					int Ql;
					int Qr;
					int Tl;
					int Tr;
					int cost = 0;
					Ql = Tl = 0;
					Qr = Tr = n - 1;

					while (Tl <= Tr)
					{
							if (T_hs[Tl] > Q_hs[Ql])
							{
									cost += 200;
									Tl++;
									Ql++;
							}
							else if (T_hs[Tr] > Q_hs[Qr])
							{
									cost += 200;
									Tr--;
									Qr--;
							}
							else
							{
									if (T_hs[Tl] < Q_hs[Qr])
									{
											cost -= 200;
											Tl++;
											Qr--;
									}
									else
									{
											Tl++;
											Qr--;
									}
							}
					}

					System.out.printf("%d\n", cost);
			}

			return 0;
	}

}

