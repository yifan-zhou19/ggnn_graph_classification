package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int n;
	public static int j;
	public static int k;
	public static int M;
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int Main()
	{
		while (scanf("%d",n) != EOF)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			sort(a,a + n);
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(b,b + n);
			M = -100000;
			for (i = 0;i <= n;i++)
			{
				int now = -i;
				if (now + n - i <= M)
				{
					break;
				}
				for (j = n - 1 - i,k = n - 1;j >= 0;j--,k--)
				{
					if (a[k] > b[j])
					{
						now++;
					}
					else
					{
						if (a[k] < b[j])
						{
							now--;
						}
					}
				}
				if (now > M)
				{
					M = now;
				}
			}
			System.out.print(M * 200);
			System.out.print("\n");
		}
		return (0);
	}
}

