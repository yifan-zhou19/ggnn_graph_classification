package <missing>;

public class GlobalMembers
{
	public static short n;
	public static short[] tianji = new short[1010];
	public static short[] qiwang = new short[1010];
	public static int Main()
	{
		while (scanf("%d",n))
		{
			if (n == 0)
			{
				break;
			}
			for (int i = 0 ;i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tianji[i] = Short.parseShort(tempVar);
				}
			}
			for (int i = 0 ;i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qiwang[i] = Short.parseShort(tempVar2);
				}
			}
			sort(tianji,tianji + n);
			sort(qiwang,qiwang + n);
			short tianjigood;
			short qiwanggood;
			short tianjibad;
			short qiwangbad;
			tianjigood = qiwanggood = n - 1;
			tianjibad = qiwangbad = 0;
			short cnt = 0;
			while (tianjigood >= tianjibad)
			{
				if (tianji[tianjibad] > qiwang[qiwangbad])
				{
					cnt++;
					tianjibad++;
					qiwangbad++;
					continue;
				}
				if (tianji[tianjibad] < qiwang[qiwangbad])
				{
					cnt--;
					tianjibad++;
					qiwanggood--;
					continue;
				}
				if (tianji[tianjigood] > qiwang[qiwanggood])
				{
					cnt++;
					tianjigood--;
					qiwanggood--;
					continue;
				}
				if (tianji[tianjigood] < qiwang[qiwanggood])
				{
					cnt--;
					tianjibad++;
					qiwanggood--;
					continue;
				}
				if (tianji[tianjibad] < qiwang[qiwanggood])
				{
					cnt--;
				}
				tianjibad++;
				qiwanggood--;
			}
			System.out.printf("%d\n",200 * cnt);
		}
	}

}

