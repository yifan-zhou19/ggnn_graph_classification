package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int m1;
		int cur;
		int t;
		int[] next = new int[10000];
		int b = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			//??????????????
			for (i = 1;i <= n;i++)
			{
				next[i] = i + 1;
			}
			next[n] = 1;
			//?????????cur
			cur = 1;
			//?n-1??????????cur==next[cur]???????????
			for (i = 1;i <= n - 1;i++)
			{
				//???????
				m1 = m % (n - i + 1);
				if (m1 == 0)
				{
					m1 = n - i + 1;
				}
				else if (m1 == 1)
				{
					m1 = n - i + 1 + 1;
				}
				//??
				for (j = 0;j < m1 - 2;j++)
				{
					cur = next[cur];
				}
				//??cur???????
				t = next[next[cur]];
				next[next[cur]] = 0;
				next[cur] = t;
				//?????????1??
				cur = next[cur];
			}
			if (b != 0)
			{
				System.out.print("\n");
			}
			System.out.printf("%d", cur);
			b = 1;
		}
	}
}

