package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1010];
	public static int[] b = new int[1010];
	public static int Main()
	{
		int n;
		int i;
		while (scanf("%d", n), n)
		{
			for (i = 1; i <= n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 1; i <= n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(a + 1,a + 1 + n);
			sort(b + 1,b + 1 + n);
			int tl = 1;
			int tr = n;
			int ql = 1;
			int qr = n;
			int sum = 0;
			while (tl <= tr)
			{
				if (a[tl] < b[ql])
				{
					qr--;
					tl++;
					sum = sum - 200;
				}
				else if (a[tl] == b[ql])
				{
					while (tl <= tr != 0 && ql <= qr)
					{
						if (a[tr] > b[qr])
						{
							sum += 200;
							tr--;
							qr--;
						}
						else
						{
							if (a[tl] < b[qr])
							{
								sum -= 200;
							}
							tl++;
							qr--;
							break;
						}
					}
				}
				else
				{
					tl++;
					ql++;
					sum = sum + 200;
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

