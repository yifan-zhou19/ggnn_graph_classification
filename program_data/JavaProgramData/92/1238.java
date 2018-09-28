package <missing>;

public class GlobalMembers
{
	public static int[] tianji = new int[1010];
	public static int[] qiwang = new int[1010];

	public static void Input(int n)
	{
		int i;
		for (i = 0 ; i < n ; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				tianji[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0 ; i < n ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qiwang[i] = Integer.parseInt(tempVar2);
			}
		}
	}
	public static int comp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}


	public static int calc(int n)
	{
		int t1;
		int t2;
		int q1;
		int q2;
		t1 = 0;
		t2 = n - 1;
		q1 = 0;
		q2 = n - 1;

		int win;
		int lose;
		win = 0;
		lose = 0;
		while (t1 <= t2)
		{
			if (tianji[t2] > qiwang[q2]) //??????????????
			{
				win++;
				t2--;
				q2--;
			}
			else
			{
				if (tianji[t2] < qiwang[q2]) //??????????????????????
				{
					lose++;
					t1++;
					q2--;
				}
				else //?????????????
				{
					if (tianji[t1] > qiwang[q1]) //??????????????
					{
						win++;
						t1++;
						q1++;
					}
					else //???????????????
					{
						if (tianji[t1] < qiwang[q2]) //??????????
						{
							lose++;
							t1++;
							q2--;
						}
						else //???
						{
							t1++;
							q2--;
						}
					}
				}
			}
		}
		return (win - lose) * 200;
	}
	public static int Main()
	{
		int n;
		while (scanf("%d", n) && n != 0)
		{
			Input(n);
			qsort(tianji,n,(Integer.SIZE / Byte.SIZE),comp);
			qsort(qiwang,n,(Integer.SIZE / Byte.SIZE),comp);
			System.out.printf("%d\n",calc(n));
		}
		return 0;
	}
}

