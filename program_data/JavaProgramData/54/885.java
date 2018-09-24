package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fan = 0;
		int n;
		int k;
		int i;
		int j;
		int q;
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			s[0] = i;
			q = 1;
			for (j = 1;j < n;j++)
			{
				s[j] = fan(s[j - 1], k, n);
					if (s[j] == -1)
					{
						q = -1;
					break;
					}
			}
			if (q == 1)
			{
				break;
			}
		}
		System.out.printf("%d",s[n - 1] * n + k);
	}
	public static int fan(int a,int k,int n)
	{
		if ((a * n + k) % (n - 1) != 0)
		{
			return -1;
		}
		else
		{
			return (a * n + k) / (n - 1);
		}

	}
}

