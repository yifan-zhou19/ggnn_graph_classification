package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int know;
		int known;
		int yes = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] famous = new int[n];
		int[] chance = new int[n];
		for (i = 0;i < n;i++)
		{
			famous[i] = 0,chance[i] = 1;
		}
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				know = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				known = Integer.parseInt(tempVar3);
			}
			if (know == 0 && known == 0)
			{
				break;
			}
			chance[know]--;
			famous[known]++;
		}
		for (i = 0;i < n;i++)
		{
			if (chance[i] == 1 && famous[i] == n - 1)
			{
				System.out.printf("%d\n",i);
				yes = 1;
			}
		}
		if (yes == 0)
		{
			System.out.print("NOT FOUND\n");
		}
	}
}

