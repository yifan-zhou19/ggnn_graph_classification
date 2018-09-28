package <missing>;

public class GlobalMembers
{
	public static int money(int n)
	{
		int i;
		int j;
		int m;
		int ans = 0;
		int mid;
		int head = 0;
		int tailt = n - 1;
		int tailk = n - 1;
		int[] k = new int[n];
		int[] t = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (k[j] < k[j + 1])
				{
					mid = k[j];
					k[j] = k[j + 1];
					k[j + 1] = mid;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (t[j] < t[j + 1])
				{
					mid = t[j];
					t[j] = t[j + 1];
					t[j + 1] = mid;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
				if (t[head] > k[i])
				{
					head++;
					ans += 200;
				}
				else if (t[head] < k[i])
				{
					tailt--;
					ans -= 200;
				}
				else if (t[head] == k[i])
				{
					for (j = tailt,m = tailk;j >= head;j--,m--)
					{
						if (t[j] > k[m])
						{
							ans += 200;
							tailt--;
							tailk--;
						}
						else
						{
							if (t[j] < k[i])
							{
								ans -= 200;
							}
							tailt = --j;
							tailk = m;
							break;
						}
					}
				}

				if (head > tailt)
				{
					break;
				}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(k);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(t);
		return ans;
	}
	public static void Main()
	{
		int n;
		while (scanf("%d", n) == 1 && n != 0)
		{
			System.out.printf("%d\n",money(n));
		}
	}
}

