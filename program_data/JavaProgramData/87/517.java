package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int sum1;
		int sum2;
		int sum;
		int[] sz = new int[6];
		int[] peo = new int[1000];
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[j] = Integer.parseInt(tempVar);
				}
			}
			if (sz[0] == 0)
			{
				n = i;
				break;
			}
			sum1 = (12 - sz[0]) * 3600 - (sz[1] * 60) - sz[2];
			sum2 = sz[3] * 3600 + sz[4] * 60 + sz[5];
			sum = sum1 + sum2;
			peo[i] = sum;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",peo[i]);
		}
		return 0;
	}





}

