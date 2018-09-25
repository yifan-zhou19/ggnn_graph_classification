package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		int[] month = new int[200];
		int[] y = new int[200];
		int[] m = new int[200];
		int a;
		int[] d = new int[200];
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] dayy = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] sum = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
			if (month[i] > m[i])
			{
			e = month[i];
			month[i] = m[i];
			m[i] = e;
			}
			if (y[i] % 400 == 0 || (y[i] % 100 != 0 && y[i] % 4 == 0))
			{
			for (k = month[i] - 1;k < m[i] - 1;k++)
			{
				sum[i] += dayy[k];
			}
			}
			else
			{
				for (k = month[i] - 1;k < m[i] - 1;k++)
				{
					sum[i] += day[k];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sum[i] % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}



}

