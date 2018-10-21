package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int t;
		int s;
		int[] a = new int[301];
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 || m == 0)
			{
				break;
			}
			for (i = 1;i <= n;i++)
			{
				a[i] = 0;
			}
			t = n;
			s = 0;
			for (i = 0;t > 0;)
			{
					i++;
					if (i == n + 1)
					{
						i = 1;
					}
				if (a[i] == 0)
				{
					s = s + 1;
				if (s % m == 0)
				{
					a[i] = -1;
					t = t - 1;
				}
				}
			}
			System.out.printf("%d\n",i);
		}
	}

}

