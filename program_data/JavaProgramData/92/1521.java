package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] t = new int[1010];
		  int[] w = new int[1010];
		  int n;
		  int i;
		  int j;
		  int k;
		  int m;
		  int ans;
		  int w1;
		  int w2;
		  int head;
		  int tailt;
		  int tailw;


		  while (true)
		  {
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					n = Integer.parseInt(tempVar);
				}
				ans = 0;
				if (n == 0)
				{
					break;
				}
				for (i = 1;i <= n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						t[i] = Integer.parseInt(tempVar2);
					}
				}
				for (i = 1;i <= n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						w[i] = Integer.parseInt(tempVar3);
					}
				}
				for (i = 1;i < n;i++)
				{
					for (j = i + 1;j <= n;j++)
					{
						if (t[i] < t[j])
						{
							k = t[i];
							t[i] = t[j];
							t[j] = k;
						}
						if (w[i] < w[j])
						{
							k = w[i];
							w[i] = w[j];
							w[j] = k;
						}
					}
				}
				head = 1;
	tailt = n;
	tailw = n;
	for (i = 1;i <= n;i++)
	{
	if (t[head] > w[i])
	{
	head++;
	ans += 200;
	}
	else if (t[head] < w[i])
	{
	tailt--;
	ans -= 200;
	}
	else if (t[head] == w[i])
	{
	for (j = tailt,m = tailw;j >= head;)
	{
	if (t[j] > w[m])
	{
	ans += 200;
	tailt--;
	tailw--;
	j--;
	m--;
	}
	else
	{
	if (t[j] < w[i])
	{
	ans -= 200;
	}
	tailt--;
	j--;
	break;
	}
	}
	}
	if (head > tailt)
	{
	break;
	}
	}

	System.out.printf("%d\n",ans);
		  }
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

