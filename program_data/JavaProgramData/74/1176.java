package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int s;
		int t;
		int sum = 0;
		int[] a = new int[65535];
		int[] b = new int[65535];
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
		for (i = 0;m + i <= n;i++)
		{
				s = m + i;
				for (j = 0;s != 0;j++)
				{
					a[j] = s % 10;
					s = s / 10;
				}
				for (k = 0;k * 2 <= j - 1;k++)
				{
					if (a[k] != a[j - 1 - k])
					{
						t = 0;
						break;
					}
					else
					{
					t = 1;
					}
				}
				if (t == 0)
				{
				continue;
				}
				else
				{
					for (j = 2;j <= Math.sqrt(m + i);j++)
					{
							if ((m + i) % j == 0)
							{
							t = 0;
							break;
							}
							else
							{
							t = 1;
							}
					}
					if (t == 1)
					{
							sum++;
							if (sum == 1)
							{
							System.out.printf("%d",m + i);
							}
							else
							{
							System.out.printf(",%d",m + i);
							}
					}
				}
		}
		if (sum == 0)
		{
		System.out.print("no");
		}
		System.in.read();
		System.in.read();
	}

}

