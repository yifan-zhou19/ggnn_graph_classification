package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p = 0;
		int q = 0;
		int mianji;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] shu = new int[n];
		int[] ge = new int[n];
		for (i = 0;i < n;i++)
		{
			k = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					shu[j] = Integer.parseInt(tempVar2);
				}
				if (shu[j] == 0)
				{
					k++;
				}
			}
			ge[i] = k;
			if (ge[i] > p)
			{
				p = ge[i];
			}
			for (j = 0;j < n;j++)
			{
				if (shu[j] == 0)
				{
					q++;
					break;
				}
			}
		}
		mianji = (p - 2) * (q - 2);
		System.out.printf("%d\n",mianji);
		return 0;
	}

}

