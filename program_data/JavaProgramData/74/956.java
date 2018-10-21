package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int t;
		int p;
		int q;
		int i;
		int k;
		int sum;
		int b;
		int c;
		int d;
		int e;
		int u;

		int[] a = new int[10000];
		int[] s = new int[10000];
		int[] prime = new int[10000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		q = 0;
		sum = 0;
		for (i = m;i <= n;i++) //?????????? ??????
		{
			k = (int)Math.sqrt(i);
			for (t = 2;t <= k;t++)
			{
				if (i % t == 0)
				{
					break;
				}
			}
			if (t > k)
			{
				a[q] = i; //a[q]??????????
				q = q + 1;
			}
		}

		for (i = 0;i < q;i++) //?a[i]???????,??s[i]??
		{
			p = a[i];
			sum = 0;
			do
			{
				e = p % 10;
				p = p / 10;
				sum = sum * 10 + e;
			}while (p != 0);
			s[i] = sum;
		}

		u = 0;
		for (i = 0;i < q;i++) //??????????????? ???prime[i]
		{
			if (a[i] == s[i])
			{
				prime[u] = a[i];
				u = u + 1;
			}
		}
		if (u == 0) //??????????no
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < u - 1;i++) //???????
			{
				System.out.printf("%d,",prime[i]);
			}
			System.out.printf("%d\n",prime[u - 1]);
		}
	}
}

