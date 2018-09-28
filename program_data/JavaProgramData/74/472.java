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
		int flag;
		int[] a = new int[100];
		int start = 0;
		int t = 0;
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
		for (i = m;i <= n;i++)
		{
			flag = 0;
			for (j = 2;j <= Math.sqrt(n);j++)
			{
				if (i % j == 0)
				{
					flag = 1;
					break;
				}
			}
				if (flag == 0)
				{
					k = i;
					for (j = 0;k > 0;j++)
					{
						a[j] = k % 10;
						k = (k - a[j]) / 10;
					}
					for (k = 0;k < j / 2;k++)
					{
						if (a[k] != a[j - k - 1])
						{
							flag = 1;
							break;
						}
					}
				}
				if (flag == 0)
				{
					if (start == 0)
					{
						System.out.printf("%d",i);
						start = 1;
					}
					else
					{
						System.out.printf(",%d",i);
					}
					t++;
				}

		}
		if (t == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

