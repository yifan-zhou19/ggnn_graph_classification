package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int[] m = new int[10000];
		int[] n = new int[10000];
		int i;
		int j;
		int k;
		int t = 0;
		int s;
		int b = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
			t = t + 1;
		}
		for (i = 0;i < t;i++)
		{
			for (j = 1;j <= 300;j++)
			{
				a[j] = 1;
			}
			s = 0;
			b = n[i];
			while (b > 1)
			{
				k = 0;
				while (k != m[i])
				{
					s += 1;
					if (s > n[i])
					{
						s -= n[i];
					}
					if (a[s] != 0)
					{
						k += 1;
					}
				}
				a[s] = 0;
				b -= 1;
			}
			for (j = 1;j <= n[i];j++)
			{
				if (a[j] != 0)
				{
					System.out.printf("%d\n",j);
				}
			}
		}
		return 0;
	}

}

