package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int m = 1;
		int n;
		int k;
		float q = 0.5F;
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
		while ((int)q != q || q < 1F)
		{
			m += 1;
			q = (m - k) / n;
			for (j = 1;j <= n - 1;j++)
			{
				if ((int)q != q)
				{
					break;
				}
				else
				{
					q = ((n - 1) * q - k) / n;
				}
			}
		}
		System.out.printf("%d\n",m);

	}




}

