package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int t;
		int num;
		int[] br = new int[100];
		int[][] count = new int[100][61];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				br[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < br[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					t = Integer.parseInt(tempVar3);
				}
				count[i][t - 1] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			num = 0;
			while (j < 60)
			{
				j += 1;
				num += 1;
				if (count[i][num - 1] == 1)
				{
					j += 3;

				};
			}
			System.out.printf("%d\n",num);
		}
	}


}

