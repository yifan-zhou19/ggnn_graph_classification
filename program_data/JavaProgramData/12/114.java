package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] sz = new int[15];
		int a;
		int i;
		int k;
		int count = 0;
		for (i = 0;i < 15;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			if (a == -1)
			{
				break;
			}
			else if (a == 0)
			{
				i = -1;
				System.out.printf("%d\n",count);
				count = 0;
				continue;
			}
			else
			{
				sz[i] = a;
			}
			for (k = 0;k <= i;k++)
			{
				if (sz[i] == sz[k] * 2 || sz[k] == sz[i] * 2)
				{
					count++;
				}
			}
		}
	}

}

