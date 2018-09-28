package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int m = 0;
		 int num = 0;
		 int[] sz = new int[10000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 2;i <= n;i++)
		 {
				for (j = 2;j <= i;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j == i)
				{
					sz[m] = i;
					m++;
				}
		 }
		if (m < 2)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 1;i < m;i++)
			{
			if (sz[i] - sz[i - 1] == 2)
			{
				System.out.printf("%d %d\n",sz[i - 1],sz[i]);
				num++;
			}
			}
		if (num == 0)
		{
			System.out.print("empty");
		}
		}


		return 0;
	}
}

