package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n;
		int j;
		int i;
		int s;
		int t = 0;
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
			s = i;
			t = 0;
			for (j = 0;j < n;j++)
			{
				if (s % n == k)
				{
					t++;
				s = (s - k) * (n - 1) / n;
				}
				else
				{
					break;
				}
			}
			if (t == n && s >= 1)
			{
				break;
			}
		}
		System.out.printf("%d",i);
	}

}

