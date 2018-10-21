package <missing>;

public class GlobalMembers
{
	public static int[] F_num = new int[10000];
	public static int Main()
	{
		int test_total;
		int max = 0;
		int test_site;
		int i;
		int j;
		int k;
		F_num[0] = 1;
		F_num[1] = 1;
		max = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			test_total = Integer.parseInt(tempVar);
		}
		for (i = 0; i < test_total; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				test_site = Integer.parseInt(tempVar2);
			}
			if (max >= test_site)
			{
					System.out.printf("%d\n", F_num[test_site-1]);
			}
			else
			{
				for (j = max + 1; j <= test_site; j++)
				{
						  F_num[j] = F_num[j - 1] + F_num[j - 2];
				}
				max = test_site;
				System.out.printf("%d\n", F_num[test_site-1]);
			}
		}
		return 0;
	}

}

