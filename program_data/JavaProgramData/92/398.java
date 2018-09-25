package <missing>;

public class GlobalMembers
{
	public static void saima(int a, int[] b, int[] d)
	{
		int qian = 0;
		int head = 0;
		int twei = a - 1;
		int kwei = a - 1;
		int j;
		int x;
		int y;
		for (j = 0;j < a;j++)
		{
			if (b[head] > d[j])
			{
				head++;
				qian += 200;
			}
			else
			{
				for (x = twei,y = kwei;x >= head;x--,y--)
				{
					if (b[x] > d[y])
					{
						qian += 200;
						twei--;
						kwei--;
					}
					else
					{
						if (b[x] < d[j])
						{
						qian -= 200;
						}
						twei--;
						break;
					}

				}

			}
			if (twei < head)
			{
				break;
			}
		}
		System.out.printf("%d\n",qian);
	}
	public static void paixu(int[] e, int c)
	{
		int temp;
		int k;
		int l;
		for (k = 0;k < c - 1;k++)
		{
			for (l = 0;l < c - 1;l++)
			{
				if (e[l] < e[l + 1])
				{
					temp = e[l];
					e[l] = e[l + 1];
					e[l + 1] = temp;
				}
			}
		}
	}
	public static int Main()
	{
		int[] tianji = new int[1500];
		int[] kingma = new int[1500];
		int n;
		int i;
		int num = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
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
					kingma[i] = Integer.parseInt(tempVar3);
				}
			}
			if (n == 0)
			{
				break;
			}
			paixu(tianji, n);
			paixu(kingma, n);
			saima(n, tianji, kingma);
		}while (n != 0);
		return 0;

	}
}

