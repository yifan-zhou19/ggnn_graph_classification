package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = {3, 5, 7};
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int flag = 0;
		int isfirsttime = 1;

		for (i = 0;i < 3;i++)
		{
				if (n % sz[i] == 0)
				{
					if (isfirsttime == 0)
					{
					System.out.printf(" %d",sz[i]);
					flag = 1;
					}
					else
					{
						System.out.printf("%d",sz[i]);
						flag = 1;
						isfirsttime = 0;

					}

				}



		}
		if (flag == 0)
		{
			System.out.print("n");
		}
		return 0;
	}

}

