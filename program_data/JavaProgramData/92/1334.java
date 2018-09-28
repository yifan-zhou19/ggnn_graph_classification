package <missing>;

public class GlobalMembers
{
	public static int sort(int[] x, int m)
	{
	  int i;
	  int j;
	  int k;
	  for (i = 0;i < m;i++)
	  {
			for (j = i + 1;j < m;j++)
			{
				if (x[i] < x[j])
				{
				   k = x[i];
				   x[i] = x[j];
				   x[j] = k;
				}
			}
	  }
	}

	public static int Main()
	{
		while (true)
		{

		int num;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int shadow;
		int k;
		int temp_gain = 0;
		int temp_tie = 0;
		int temp_lose = 0;
		int gain = 0;
		int lose = 0;
		int tie = 0;
		int total_gain = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}

		if (num == 0)
		{
		   break;
		}

		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < num;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		sort(a, num);
		sort(b, num);

		for (i = 0;i < num;i++)
		{
			shadow = i;
			i = 0;
			for (j = shadow;j < num;j++,i++)
			{
				if (a[i] > b[j])
				{
				   temp_gain++;
				}
				else if (a[i] < b[j])
				{
				   temp_lose++;
				}
				else
				{
				   temp_tie++;
				}
			}
			temp_lose += shadow;
			if ((temp_gain - temp_lose) > (gain - lose) || shadow == 0)
			{
						   gain = temp_gain;
						   lose = temp_lose;
						   tie = temp_tie;
			}
			i = shadow;
			temp_gain = 0;
			temp_lose = 0;
			temp_tie = 0;
		}

		total_gain = (gain - lose) * 200;
		System.out.printf("%d\n",total_gain);
		}
	System.in.read();
	System.in.read();
	}

}

