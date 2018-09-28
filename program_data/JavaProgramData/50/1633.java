package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n = 0;
		int[] sz = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] sz1 = new int[12];
		int i = 0;
		int j = 0;
		sz1[0] = 13;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 12;i++)
		{
			for (j = 0;j < i;j++)
			{
				sz1[i] = sz1[i - 1] + sz[j];
			}
		}
			for (i = 0;i < 12;i++)
			{
				if ((n - 1 + sz1[i] % 7) == 5 || (n - 8 + sz1[i] % 7) == 5)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
	}

}

