package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 1;
		int i;
		int j;
		int[] dk = new int[80];
		int[] kd = new int[80];
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
				(dk[i]) = Integer.parseInt(tempVar2);
			}
		}
		kd[0] = dk[0];
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m;i++)
			{
				if (dk[j] == kd[i])
				{
					break;
				}
			else if (i == m - 1)
			{
				kd[m] = dk[j];
				m++;
			}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d,",kd[i]);
		}
		 System.out.printf("%d",kd[m - 1]);
		return 0;
	}

}

