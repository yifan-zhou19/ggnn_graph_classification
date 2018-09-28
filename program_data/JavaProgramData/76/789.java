package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] qj = new int[60000];
		int p = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (j = (2 * m - 1);j <= (2 * n - 1);j++)
			{
				qj[j] = 1;
			}
		}
		for (i = 1;i < 51000;i++)
		{
			if (qj[i] == 1 && qj[i + 1] == 0)
			{
				for (j = i + 1;j < 51000;j++)
				{
					if (qj[j] == 0 && qj[j + 1] == 1)
					{
						System.out.print("no");
						return 0;
					}
				}
			}
		}
		for (i = 1;i < 51000;i++)
		{
			if (qj[i - 1] == 0 && qj[i] == 1)
			{
				p = (i + 1) / 2;
			}
			else if (qj[i] == 1 && qj[i + 1] == 0)
			{
				q = (i + 1) / 2;
			}
		}
		System.out.printf("%d %d",p,q);
		return 0;
	}

}

