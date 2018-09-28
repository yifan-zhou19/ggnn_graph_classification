package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int tianfast;
		int tianslow;
		int qifast;
		int qislow;
		int[] tianhorse = new int[1000];
		int[] qihorse = new int[1000];
		int button;
		int swap;
		int i;
		int j;
		int n;
		int win;
		int lost;
		int money;
		button = 0;
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 0)
		{
			for (i = 0;i <= n - 1;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tianhorse[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i <= n - 1;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qihorse[i] = Integer.parseInt(tempVar3);
				}
			}

			for (i = 0;i < n - 1;i++)
			{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (tianhorse[j] < tianhorse[j + 1])
				{
					swap = tianhorse[j];
					tianhorse[j] = tianhorse[j + 1];
					tianhorse[j + 1] = swap;
				}
				if (qihorse[j] < qihorse[j + 1])
				{
					swap = qihorse[j];
					qihorse[j] = qihorse[j + 1];
					qihorse[j + 1] = swap;
				}
			}
			}

			win = lost = 0;
			tianfast = qifast = 0;
			tianslow = qislow = n - 1;
			while (tianfast <= tianslow)
			{
				if (tianhorse[tianfast] > qihorse[qifast])
				{
					tianfast++;
					qifast++;
					win++;
				}
				else
				{
					if (tianhorse[tianfast] < qihorse[qifast])
					{
						tianslow--;
						qifast++;
						lost++;
					}
					else
					{
						if (tianhorse[tianslow] > qihorse[qislow])
						{
							tianslow--;
							qislow--;
							win++;
						}
						else
						{
							if (tianhorse[tianslow] < qihorse[qislow])
							{
								tianslow--;
								qifast++;
								lost++;
							}
							else
							{
								if (tianhorse[tianslow] < qihorse[qifast])
								{
									lost++;
								}
								else if (tianhorse[tianslow] > qihorse[qifast])
								{
									win++;
								}
								tianslow--;
								qifast++;
							}
						}
					}
				}
			}
			money = (win - lost) * 200;
			if (button == 0)
			{
				System.out.printf("%d",money);
				button = 1;
			}
			else
			{
				System.out.printf("\n%d",money);
			}
		}
		if (n == 0)
		{
			break;
		}
		}
	}
}

