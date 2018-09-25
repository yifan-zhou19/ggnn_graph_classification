package <missing>;

public class GlobalMembers
{
	public static int[] T = new int[1001];
	public static int[] K = new int[1001];

	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}


	public static int Main()
	{
		int n;
		int i;
		int sum;
		int flag;
		int t_tail;
		int t_head;
		int k_tail;
		int k_head;
		while (scanf("%d", n) != EOF && n != 0)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					T[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					K[i] = Integer.parseInt(tempVar2);
				}
			}

			qsort(T,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(K,n,(Integer.SIZE / Byte.SIZE),cmp);
			sum = 0;
			flag = 1;
			k_head = t_head = 0;
			k_tail = t_tail = n - 1;

			while (t_head <= t_tail != 0 && k_head <= k_tail)
			{
				if (T[t_head] > K[k_head])
				{
					sum += 200;
					t_head++;
					k_head++;
				}
	//?????else?   
				else if (T[t_head] < K[k_head])
				{
					sum -= 200;
					t_tail--;
					k_head++;
				}
				else
				{
					while (t_head <= t_tail != 0 && k_head <= k_tail)
					{
						if (T[t_tail] > K[k_tail])
						{
							sum += 200;
							t_tail--;
							k_tail--;
						}
						else
						{
							if (T[t_tail] < K[k_head])
							{
								sum -= 200;
							}
							t_tail--;
							k_head++;
							break;
						}
					}
				}
				if (T[t_tail] > K[k_head])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				sum += (t_tail - t_head + 1) * 200;
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

