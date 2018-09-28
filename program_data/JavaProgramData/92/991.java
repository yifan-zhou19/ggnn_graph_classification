package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
			return *(int)a - (int)b;
	}
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] queue = new int[1001];
	public static int head;
	public static int tail;
	public static void enqueue(int elem)
	{
		queue[head++] = elem;
		if (head == MAX)
		{
			head = 0;
		}
	}
	public static int top()
	{
		return queue[tail];
	}
	public static int dequeue()
	{
		int ret = queue[tail++];
		if (tail == MAX)
		{
			tail = 0;
		}
		return ret;
	}
	public static int empty()
	{
		return head == tail;
	}
	public static int size()
	{
		if (head < tail)
		{
			return head + MAX - tail;
		}
		else
		{
			return head - tail;
		}
	}
	public static int Main()
	{
			int n;
			int i;
			int j;
			int draw;
			int win;
			int ans;
			while (scanf("%d", n) != EOF && n != 0)
			{
			head = tail = 0;
					for (i = 0; i < n; i++)
					{
							String tempVar = ConsoleInput.scanfRead();
							if (tempVar != null)
							{
								a + i = tempVar;
							}
					}
					for (i = 0; i < n; i++)
					{
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								b + i = tempVar2;
							}
					}
					qsort(a, n, (Integer.SIZE / Byte.SIZE), cmp);
					qsort(b, n, (Integer.SIZE / Byte.SIZE), cmp);
					win = draw = 0;
					for (i = n - 1, j = n - 1; j >= 0; j--)
					{
							if (a[i] > b[j])
							{
								i--, win++;
							}
				else
				{
					if (empty() == 0 && top() > b[j])
					{
						dequeue();
				//        printf("dequeue: %d\n", dequeue());
						win++;
					}
					else
					{
									if (a[i] == b[j])
									{
							enqueue(a[i--]);
									}
					}
				}
					}
			draw = size();
					ans = (2 * win - n + draw) * 200;
					System.out.printf("%d\n", ans);
	//              printf("ans : %d\n", ans);
	//              printf("win : %d\n", win);
	//              printf("draw: %d\n", draw);
			}
			return 0;
	}

}

