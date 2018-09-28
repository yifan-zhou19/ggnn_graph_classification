package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] zzd = new int[501];
		int[] hzy = new int[501];
		int[] wh = new int[501];
		int[] zjz = new int[501];
		int i;
		int a;
		int m;
		int g;
		int s;
		int k;
		a = 0;
		s = 0;
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
				zzd[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (zzd[i] % 2 == 1)
			{
				hzy[a] = zzd[i];
				a++;
			}
		}
		for (k = 0;k < a;k++)
		{
			for (i = 0;i < a;i++)
			{
			 if (i == 0)
			 {
				m = hzy[i];
			 }
			 if (i > 0)
			 {
				if (m < hzy[i])
				{
					m = hzy[i];
					g = i;
				}
			 }
			 if (i == a - 1)
			 {
				wh[s] = m;
				s++;
				hzy[g] = 0;
			 }
			}
		}
		for (i = 0;i < a;i++)
		{
			zjz[a - i - 1] = wh[i];
		}
		for (i = 0;i < a - 1;i++)
		{
		System.out.printf("%d,",zjz[i]);
		}
		if (i = a - 1)
		{
			System.out.printf("%d",zjz[i]);
		}

		return 0;
	}

}

