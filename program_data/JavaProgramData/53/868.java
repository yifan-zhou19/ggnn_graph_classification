package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] X = new int[300];
		int[] Y = new int[300];
		int q = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				X[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				Y[0] = X[0];
			}
			else if (i >= 1)
			{
				flag = 0;
				for (int k = 0;k < i;k++)
				{
					if (X[k] == X[i])
					{
					flag = 1;
					}
				}
				if (flag == 0)
				{
					q++;
					Y[q] = X[i];

				}
			}
		}
		for (i = 0;i < q;i++)
		{
			System.out.printf("%d,",Y[i]);
		}
		System.out.printf("%d",Y[q]);
		return 0;
	}

}

