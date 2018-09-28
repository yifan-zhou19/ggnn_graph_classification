package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int *arrange(int a[], int n)
	public static int[] arrange(int[] a, int n)
	{
		//????n-1?
		int i1;
		int position = n - 1;
		for (i1 = 0;i1 <= n - 1;i1++,position--)
		{
			int i2;
			for (i2 = 0;i2 <= position - 1;i2++)
			{
				if (a[i2] < a[i2 + 1])
				{
					int tmp;
					tmp = a[i2];
					a[i2] = a[i2 + 1];
					a[i2 + 1] = tmp;
				}
			}
		}
		return a;
	}
	public static int Main()
	{
		//money??
		int money;
		//num ???
		int num;
		for (;;)
		{
			money = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			if (num == 0)
			{
				break;
			}
			else
			{
				//??????
				//king?tianji????????????
				int[] king = new int[1000];
				int[] tianji = new int[1000];
				int i1;
				for (i1 = 0;i1 <= num - 1;i1++)
				{
					if (i1 == 0)
					{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							tianji[i1] = Integer.parseInt(tempVar2);
						}
					}
					else
					{
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							tianji[i1] = Integer.parseInt(tempVar3);
						}
					}
				}
				for (i1 = 0;i1 <= num - 1;i1++)
				{
					if (i1 == 0)
					{
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							king[i1] = Integer.parseInt(tempVar4);
						}
					}
					else
					{
						String tempVar5 = ConsoleInput.scanfRead(" ");
						if (tempVar5 != null)
						{
							king[i1] = Integer.parseInt(tempVar5);
						}
					}
				}
				//??????
				arrange(tianji, num);
				arrange(king, num);
				//??????
				//head,tail????????????????
				int tianhead = 0;
				int kinghead = 0;
				int tiantail = num - 1;
				int kingtail = num - 1;
				//flag??????
				int flag = 1;
				for (;flag != 0;)
				{
					if (tianhead == tiantail)
					{
						flag = 0;
					}
					if (tianji[tianhead] > king[kinghead])
					{
						money += 200;
						tianhead++;
						kinghead++;
					}
					else if (tianji[tiantail] > king[kingtail])
					{
						money += 200;
						tiantail--;
						kingtail--;
					}
					else
					{
						if (tianji[tiantail] < king[kinghead])
						{
							money -= 200;
						}
						tiantail--;
						kinghead++;
					}
				}
				System.out.printf("%d\n",money);
			}
		}


		return 0;
	}
}

