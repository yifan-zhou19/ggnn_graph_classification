package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] t = new int[1001];
		int[] q = new int[1001];
		int n;
		int ts;
		int te;
		int qs;
		int qe;
		int i;
		int j;
		int temp;
		int win;
		int lose;
		int equal;
		for (;;)
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
		else
		{
		win = lose = equal = 0;
		ts = te = qs = qe = 0;
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
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
				if (t[i] < t[i + 1])
				{
					temp = t[i + 1];
					t[i + 1] = t[i];
					t[i] = temp;
				}
				else
				{
				}
				if (q[i] < q[i + 1])
				{
					temp = q[i + 1];
					q[i + 1] = q[i];
					q[i] = temp;
				}
			}
		}
		while ((lose + equal + win) < n)
		{
			if (t[ts] > q[qs])
			{
				win++;
				ts++;
				qs++;
			}
			else if (t[ts] == q[qs])
			{
				if (t[n - te-1] > q[n - qe-1])
				{
					te++;
					qe++;
					win++;
					continue;
				}
				else if (t[n - te-1] == q[n - qe-1])
				{
					if (t[n - te-1] == q[qs])
					{
						equal++;
						qs++;
						te++;
					}
					else
					{
						lose++;
						qs++;
						te++;
					}
				}
				else
				{
					lose++;
					qs++;
					te++;
				}
			}
			else
			{
					lose++;
					te++;
					qs++;
			}
		}
		}
		System.out.printf("%d\n",(win - lose) * 200);
		}
	}



}

