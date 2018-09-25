package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] t = new int[1000];
		int[] q = new int[1000];
		int n;
		int j;
		int i;
		int e;
		int f;
		int t1;
		int t2;
		int q1;
		int q2;
		int k;
		int money;
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
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (t[j] > t[j + 1])
				{
					e = t[j];
					t[j] = t[j + 1];
					t[j + 1] = e;
				}
				if (q[j] > q[j + 1])
				{
					f = q[j];
					q[j] = q[j + 1];
					q[j + 1] = f;
				}
			}
		}
		t1 = 0;
		t2 = n - 1;
		q1 = 0;
		q2 = n - 1;
		money = 0,k = 1;
		while (k != 0)
		{
			if (t1 == t2)
			{
				k = 0;
			}
			if (t[t2] > q[q2])
			{
				t2--;
				q2--;
				money += 200;
			}
			else if (t[t1] > q[q1])
			{
				t1++;
				q1++;
				money += 200;
			}
			else
			{
				if (t[t1] < q[q2])
				{
					money -= 200;
				}
				t1++;
				q2--;
			}
		}
		System.out.printf("%d\n",money);
		}
		return 0;
	}
}

