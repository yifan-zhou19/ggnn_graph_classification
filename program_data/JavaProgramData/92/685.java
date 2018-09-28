package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		int[] t = new int[1000];
		int[] w = new int[1000];
		int N;
		int i;
		int k;
		int l;
		int win;
		int re;
		int tfast;
		int tslow;
		int wfast;
		int wslow;
		while (scanf("%d", N) && N != 0)
		{
			for (l = 0; l < 1000; l++)
			{
				t[l] = 0;
				w[l] = 0;
			}
			for (i = 0; i < N; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					t[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0; i < N; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					w[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(t, N, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(w, N, (Integer.SIZE / Byte.SIZE), cmp);
			win = 0;
			tfast = 0;
			wfast = 0;
			tslow = N - 1;
			wslow = N - 1;
			for (i = 0; i < N; i++)
			{
				if (t[tfast] == w[wfast])
				{
					if (t[tslow] > w[wslow])
					{
						win++;
						tslow--;
						wslow--;
					}
					else if (t[tslow] < w[wslow])
					{
						win--;
						tslow--;
						wfast++;
					}
					else if (t[tslow] == w[wslow])
					{
						if (t[tslow] < w[wfast])
						{
							win--;
							tslow--;
							wfast++;
						}
						else if (t[tslow] == w[wfast])
						{
							break;
						}
					}
				}
				else if (t[tfast] > w[wfast])
				{
					win++;
					tfast++;
					wfast++;
				}
				else
				{
					win--;
					tslow--;
					wfast++;
				}
			}
			System.out.printf("%d\n", win * 200);
		}


	}
}

