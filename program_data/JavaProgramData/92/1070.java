package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1010];
		int[] b = new int[1010];
		int[] fa = new int[1010];
		int[] fb = new int[1010];
		int[] f = new int[1010];
		int i;
		int j;
		int p1;
		int p2;
		int q1;
		int q2;
		int n;
		int ans;
		int t;
		int cot;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(fa, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(fb, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 1; i <= n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 1; i <= n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = n - 1; i >= 1; i--)
			{
				for (j = 1; j <= i; j++)
				{
					if (a[j] < a[j + 1])
					{
						t = a[j];
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
					if (b[j] < b[j + 1])
					{
						t = b[j];
						b[j] = b[j + 1];
						b[j + 1] = t;
					}
				}
			}
			if (b[1] < a[n])
			{
				System.out.printf("%d\n", -200 * n);
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					n = Integer.parseInt(tempVar4);
				}
				continue;
			}
			ans = 0;
			p1 = 1;
			p2 = 1;
			q1 = n;
			q2 = n;
			cot = 0;
			while ((++cot) <= n)
			{
				if (a[p1] < b[p2])
				{
					ans++;
					p1++;
					p2++;
				}
				else if (a[p1] > b[p2])
				{
					ans--;
					p1++;
					q2--;
				}
				else
				{
					if (a[q1] < b[q2])
					{
						ans++;
						q1--;
						q2--;
					}
					else
					{
						if (a[p1] > b[q2])
						{
							ans--;
							p1++;
							q2--;
						}
					}
				}
			}
			System.out.printf("%d\n", ans * 200);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				n = Integer.parseInt(tempVar5);
			}
		}
		return 0;
	}

}

