package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int l;
		int qww_fast;
		int tj_fast;
		int qww_slow;
		int tj_slow;
		int n;
		int game;
		int win;
		int turn;
		int[] qww = new int[2000];
		int[] tj = new int[2000];
		int[] out = new int[300];
		for (game = 0;;game++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (m = 0;m < n;m++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tj[m] = Integer.parseInt(tempVar2);
				}
			}
			for (l = 0;l < n;l++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qww[l] = Integer.parseInt(tempVar3);
				}
			}
			for (m = 0;m < n;m++)
			{
				for (l = 0;l < n - m - 1;l++)
				{
					if (tj[l] < tj[l + 1])
					{
						turn = tj[l];
						tj[l] = tj[l + 1];
						tj[l + 1] = turn;
					}
				}
			}
			for (m = 0;m < n;m++)
			{
				for (l = 0;l < n - m - 1;l++)
				{
					if (qww[l] < qww[l + 1])
					{
						turn = qww[l];
						qww[l] = qww[l + 1];
						qww[l + 1] = turn;
					}
				}
			}
			for (win = 0,tj_slow = n - 1,qww_slow = n - 1,tj_fast = 0,qww_fast = 0;tj_slow >= tj_fast;)
			{
				if (tj[tj_slow] > qww[qww_slow])
				{
					win++;
					tj_slow--;
					qww_slow--;
				}
				else if (tj[tj_slow] < qww[qww_slow])
				{
					win--;
					tj_slow--;
					qww_fast++;
				}
				else
				{
					if (tj[tj_fast] > qww[qww_fast])
					{
						win++;
						tj_fast++;
						qww_fast++;
					}
					else if (tj[tj_fast] < qww[qww_fast])
					{
						win--;
						tj_slow--;
						qww_fast++;
					}
					else
					{
						if (tj[tj_slow] < qww[qww_fast])
						{
							win--;
						}
						qww_fast++;
						tj_slow--;
					}
				}
			}
			out[game] = win * 200;
		}
		for (m = 0;m < game;m++)
		{
			System.out.printf("%d\n",out[m]);
		}
	}


}

