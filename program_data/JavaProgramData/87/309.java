package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		for (int i = 0;i < 100;i++)
		{
			int[] sz = new int[10];
			int sum;
			for (int j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(sz[j]) = Integer.parseInt(tempVar);
				}
			}
			if (sz[0] == 0 && sz[1] == 0 && sz[2] == 0 && sz[3] == 0 && sz[4] == 0 && sz[5] == 0)
			{
				break;
			}
			else
			{
				sum = (11 - sz[0] + sz[3]) * 3600 + (59 - sz[1] + sz[4]) * 60 + (60 - sz[2] + sz[5]);
				System.out.printf("%d\n",sum);
			}
		}

	}


}

