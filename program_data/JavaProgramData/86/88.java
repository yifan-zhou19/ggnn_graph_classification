package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] p;
		int sum = 60;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 60;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m > 0)
			{
				p = new int[m];
				for (j = 0;j < m;j++)
				{
					p[j] = 0;
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p[j] = Integer.parseInt(tempVar3);
					}
					if (p[j] + 3 * j < 58)
					{
						sum -= 3;
					}
					if (p[j] + 3 * j == 58 || p[j] + 3 * j == 59 || p[j] + 3 * j == 60)
					{
						sum = p[j];
					}
				}
				System.out.printf("%d\n",sum);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(p);
			}
			else
			{
				System.out.printf("%d\n",sum);
			}
		}
		return 0;
	}

}

