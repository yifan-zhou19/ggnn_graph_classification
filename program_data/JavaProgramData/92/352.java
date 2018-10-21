package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int[] TJ = new int[MAX];
	public static int[] QW = new int[MAX];
	public static int Main()
	{
		int i;
		int j;
		int lt;
		int rt;
		int lq;
		int rq;
		while (scanf("%d",N))
		{
			if (N == 0)
			{
				break;
			}
			for (i = 0; i < N; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					TJ + i = tempVar;
				}
			}
			for (i = 0; i < N; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					QW + i = tempVar2;
				}
			}
			sort(TJ,TJ + N);
			sort(QW,QW + N);
			lt = 0;
			rt = N - 1;
			lq = 0;
			rq = N - 1;
			j = 0;
			while (lt <= rt)
			{
				if (TJ[lt] > QW[lq])
				{
					j += 200;
					lq++;
					lt++;
				}
				else if (TJ[rt] > QW[rq])
				{
					j += 200;
					rt--;
					rq--;
				}
				else
				{
					if (TJ[lt] < QW[rq])
					{
						j -= 200;
					}
					lt++;
					rq--;
				}
			}
			System.out.printf("%d\n",j);
		}
	}

}

