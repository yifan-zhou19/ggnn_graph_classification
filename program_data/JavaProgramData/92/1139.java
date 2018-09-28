package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1001]; //???????
	public static int[] b = new int[1001]; //???????

	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int temp;
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int win = 0;
		int lose = 0;
		int maxa;
		int maxb;
		int mina;
		int minb;
		int money;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			win = lose = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(a, n);
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			sort(b, n);
			maxa = maxb = n - 1;
			mina = minb = 0;
			money = 0;
			for (i = 0;i < n;i++)
			{
				if (a[mina] > b[minb])
				{
					win++;
					mina++;
					minb++;
				}
				else if (a[maxa] > b[maxb])
				{
					win++;
					maxa--;
					maxb--;
				}
				else if (a[mina] == b[maxb])
				{
					mina++;
					maxb--;
				}
				else if (a[mina] <= b[minb])
				{
					lose++;
					mina++;
					maxb--;
				}
			}
			money = 200 * (win - lose);
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

