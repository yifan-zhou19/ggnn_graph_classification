package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		//int ftianji,ltianji;
		//int fqiwang,lqiwang;
		int[] tianji = new int[1000];
		int[] qiwang = new int[1000];
		int temptianji;
		int tempqiwang;
		int money;
		int win;
		int tie;
		int lose;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
		win = 0,tie = 0,lose = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tianji[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qiwang[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (k = 0;k < n - j - 1;k++)
			{
			if (tianji[k] < tianji[k + 1])
			{
					temptianji = tianji[k];
					tianji[k] = tianji[k + 1];
					tianji[k + 1] = temptianji;
			}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (k = 0;k < n - j - 1;k++)
			{
			if (qiwang[k] < qiwang[k + 1])
			{
					tempqiwang = qiwang[k];
					qiwang[k] = qiwang[k + 1];
					qiwang[k + 1] = tempqiwang;
			}
			}
		}
		int tstart = 0;
		int tlast = n - 1;
		int kstart = 0;
		int klast = n - 1;
		int cnt = 0; //???
	  for (i = 0;i < n;i++) //????????????
	  {
	   if (tianji[tstart] > qiwang[kstart]) //tstart????????????????tianji???????
	   {
		cnt++;
		tstart++;
		kstart++;
		continue;
	   }
	   if (tianji[tstart] < qiwang[kstart]) //tianji????tianji???????????
	   {
		cnt--;
		kstart++;
		tlast--;
		continue;
	   }
	   if (tianji[tstart] == qiwang[kstart]) //??????
	   {
		if (tianji[tlast] < qiwang[klast]) //tianji?????????????????????
		{
		 tlast--;
		 kstart++;
		 cnt--;
		 continue;
		}
		if (tianji[tlast] > qiwang[klast]) //tianji?????????????????
		{
		 tlast--;
		 klast--;
		 cnt++;
		 continue;
		}
		if (tianji[tlast] == qiwang[klast]) //?????? ???tianji?????????
		{
		 if (tianji[tlast] < qiwang[kstart]) //??tianji??????????cnt?1
		 {
		  cnt--;
		 }
		 kstart++;
		 tlast--;
		}
	   }
	  }
		money = 200 * cnt;
		System.out.printf("%d\n",money);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		}
		return 0;
	}


}

