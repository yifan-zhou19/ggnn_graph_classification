package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		int[] p;
		int total;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			p = new int[n];
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[j] = Integer.parseInt(tempVar3);
				}
			}
			if ((p[n - 1] + n * 3) <= 60)
			{
				total = 60 - n * 3;
			}
			else
			{
				for (r = 1;r < n;r++)
				{
					if ((p[n - r] + 3 * (n - r)) <= 60)
					{
					   total = p[n - r];
					   break;
					}
					else if ((p[n - r - 1] + (n - r) * 3) <= 60)
					{
					   total = 60 - (n - r) * 3;
					   break;
					}
				}

			}
			System.out.printf("%d\n",total);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p);
		}
		return 0;
	}
}

