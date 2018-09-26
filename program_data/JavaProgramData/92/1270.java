package <missing>;

public class GlobalMembers
{
	public static void Main()
	{


		while (true)
		{
			int[] a = new int[1024];
			int[] b = new int[1024];
			int[] choose = new int[1024];
			int[] bchoose = new int[1024];
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}


			int i;
			int j;

			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
				choose[i] = n;
				bchoose[i] = 0;
			}

			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j <= n - 1;j++)
				{
					if (a[j] >= a[i])
					{
						int temp = a[j];
						a[j] = a[i];
						a[i] = temp;
					}
					if (b[j] >= b[i])
					{
						int temp = b[j];
						b[j] = b[i];
						b[i] = temp;
					}
				}
			}


			int win = 0;
			int deuce = 0;
			int lose = 0;

			int heada = 0;
			int headb = 0;
			int taila = n - 1;
			int tailb = n - 1;
			while (heada <= taila != 0 && headb <= tailb)
			{
				if (a[heada] > b[headb])
				{
						choose[heada] = headb;
						bchoose[headb] = 1;
						win++;
						heada++;
						headb++;
				}
					else if (a[taila] > b[tailb])
					{
						choose[taila] = tailb;
						bchoose[tailb] = 1;
						win++;
						taila--;
						tailb--;
					}
					else
					{
						choose[taila] = headb;
						bchoose[headb] = 1;
						if (a[taila] < b[headb])
						{
							lose++;
						}
						else
						{
							deuce++;
						}
						headb++;
						taila--;
					}
			}

			int money = 200 * win - (lose) * 200;
			System.out.printf("%d\n",money);


		}
	}
}

