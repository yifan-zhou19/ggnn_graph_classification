package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int num;
		int[] sz = new int[100];
		int j;
		int k;
		int geshu = -1;
		while (true)
		{
			i = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			if (num == -1)
			{
				break;
			}
			sz[0] = num;
			while (true)
			{
				if (sz[i] == 0)
				{
					break;
				}
				i++;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i] = Integer.parseInt(tempVar2);
				}
			}
			for (k = 0;k <= i;k++)
			{
				for (j = 0;j <= i;j++)
				{
					if (sz[j] == 2 * sz[k])
					{
						geshu = geshu + 1;
					}
				}
			}
			System.out.printf("%d\n",geshu);
			geshu = -1;
		}
	}

}

