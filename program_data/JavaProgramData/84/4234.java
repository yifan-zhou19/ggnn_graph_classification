package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m1 = 2;
		int m2 = 0;
		int[] zzz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zzz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (zzz[i] > m1)
			{
				m1 = zzz[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (zzz[i] == m1)
			{
				zzz[i] = 0;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (zzz[i] > m2)
			{
				m2 = zzz[i];
			}
		}
		System.out.printf("%d\n%d\n",m1,m2);
		return 0;
	}
}

