package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k = 0;
		int know;
		int known;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] flag = new int[n];
		int[] knownum = new int[n];
		for (i = 0; i < n; i++)
		{
			flag[i] = 0;
			knownum[i] = 0;
		}

		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				know = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				known = Integer.parseInt(tempVar3);
			}
			if (know == 0 && known == 0)
			{
				break;
			}
			flag[know] = 1;
			knownum[known]++;
		}

		for (i = 0; i < n; i++)
		{
			if (flag[i] == 0 && knownum[i] == n - 1)
			{
				k = 1;
				System.out.printf("%d\n",i);
			}
		}

		if (k == 0)
		{
			System.out.print("NOT FOUND\n");
		}

		return 0;
	}




}

