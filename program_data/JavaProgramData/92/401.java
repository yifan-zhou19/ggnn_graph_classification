package <missing>;

public class GlobalMembers
{
	public static int result(int n, int[] tianji, int[] qiwang)
	{
		int i;
		int k;
		int e;
		int m = 0;
		int sum = 0;
		int tailt;
		int tailq;
		int a;
		int b;

		tailt = tailq = n - 1;

		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (tianji[i] < tianji[i + 1])
				{
					e = tianji[i];
					tianji[i] = tianji[i + 1];
					tianji[i + 1] = e;
				}
			}
		}

		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (qiwang[i] < qiwang[i + 1])
				{
					e = qiwang[i];
					qiwang[i] = qiwang[i + 1];
					qiwang[i + 1] = e;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (tianji[m] > qiwang[i])
			{
				m++;
				sum += 200;
			}
			else if (tianji[m] < qiwang[i])
			{
				sum -= 200;
				tailt--;
			}
			else if (tianji[m] == qiwang[i])
			{
				for (a = tailt,b = tailq;a >= m;a--,b--)
				{
					if (tianji[a] > qiwang[b])
					{
						sum += 200;
						tailt--;
						tailq--;
					}
					else if (tianji[a] < qiwang[b])
					{
						sum -= 200;
						tailt--;
						break;
					}
					else if (tianji[a] == qiwang[b])
					{
						if (tianji[tailt] < qiwang[i])
						{
							sum -= 200;
						}
						tailt--;

						break;
					}
				}
			}
			if (m > tailt)
			{
				break;
			}
		}
		return sum;
	}


	public static int Main()
	{
		int n;
		int[] tianji = new int[1000];
		int[] qiwang = new int[1000];
		int i;
		int j;
		int sum;

		for (i = 0;;i++)
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
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tianji[j] = Integer.parseInt(tempVar2);
				}
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qiwang[j] = Integer.parseInt(tempVar3);
				}
			}
			sum = result(n, tianji, qiwang);
			System.out.printf("%d\n",sum);
		}



		return 0;
	}

}

