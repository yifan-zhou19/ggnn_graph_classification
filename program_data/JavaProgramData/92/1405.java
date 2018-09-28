package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int n)
	{
		int e;
		int k;
		int i;
		if (n > 1)
		{
			for (k = 1;k < n;k++)
			{
				for (i = 0;i < n - k;i++)
				{
					if (a[i] < a[i + 1])
					{
						e = a[i + 1];
						a[i + 1] = a[i];
						a[i] = e;
					}
				}
			}
		}
	}

	public static void match(int[] a, int[] b, int n)
	{
		int num = 0;
		int money = 0;
		int afr = 0;
		int bfr = 0;
		int ata = n - 1;
		int bta = n - 1;
		int c = 1;
		for (;afr <= ata;)
		{
			if (a[afr] > b[bfr])
			{
				money += 200;
				bfr++;
				afr++;
			}
			else if (a[afr] < b[bfr])
			{
				money -= 200;
				bfr++;
				ata--;
			}
			else if (a[afr] == b[bfr])
			{
				for (;c == 1;)
				{
					if (a[ata] > b[bta])
					{
						money += 200;
						ata--;
						bta--;
					}
					else if (a[ata] <= b[bta])
					{
						if (a[ata] < b[bfr])
						{
							money -= 200;
						}
						ata--;
						bfr++;
						c = 0;
					}
				}
				c = 1;
			}
		}
		System.out.printf("%d\n",money);
	}

	public static int Main()
	{
		int n;
		int i;
		int[] qi = new int[1000];
		int[] tian = new int[1000];
		while (true)
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
			else
			{
				for (i = 0;i < n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						tian[i] = Integer.parseInt(tempVar2);
					}
				}
				paixu(tian, n);
				for (i = 0;i < n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						qi[i] = Integer.parseInt(tempVar3);
					}
				}
				paixu(qi, n);
				match(tian, qi, n);
			}
		}
		return 0;
	}






}

