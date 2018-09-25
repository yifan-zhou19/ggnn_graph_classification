package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int temp = 0;
		int i = 0;
		int j = 0;
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - i - 1; j++)
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
	public static int money(int[] t, int[] q, int n)
	{
		int win = 0;
		int draw = 0;
		int lose = 0;
		int w = 0;
		int j = 0;
		int wend = 0;
		int jend = 0;
		int endw = 0;
		int endj = 0;
		int flag = 0;
		wend = jend = n - 1;
		for (w = j = 0; j < n; j++)
		{
			if (q[w] < t[j])
			{
				win++;
				w++;
			}
			else if (q[w] > t[j])
			{
				lose++;
				wend--;
			}

			else if (q[w] == t[j])
			{
				if (j == jend)
				{
					draw++;
					break;
				}
				for (endw = wend,endj = jend;endj > j;endw--,endj--)
				{
					if (q[endw] >= t[endj])
					{
						flag = 1;
						break;
					}
				}
				if (flag != 0 && t[j] != q[endw])
				{
					lose++;
					wend--;
				}
				else
				{
					draw++;
					w++;
				}
			}
			flag = 0;
		}
		return 200 * (win - lose);
	}

	public static void Main()
	{
		int[] tj = new int[1001];
		int[] qw = new int[1001];
		int n = 0;
		int i = 0;
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
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tj[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qw[i] = Integer.parseInt(tempVar3);
				}
			}
			sort(tj, n);
			sort(qw, n);
			System.out.printf("%d\n",money(tj, qw, n));
		}
	}

}

