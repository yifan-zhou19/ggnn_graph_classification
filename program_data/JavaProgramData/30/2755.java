package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		int j;
		int t1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1; j <= n; j++)
		{
				if (j % 7 != 0)
				{
					int t2 = j;
					int m = (int)Math.log10(t2);
					int[] a = new int[3];
					for (i = 0; i < t2; i++)
					{
							a[i] = t2 % 10;
							if (a[i] == 7)
							{
								t1 = 1;
								break;
							}
							else
							{
								t1 = 0;
							}
							t2 = t2 / 10;
					}
					if (t1 == 0)
					{
							sum = sum + j * j;
					}
				}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}

}

