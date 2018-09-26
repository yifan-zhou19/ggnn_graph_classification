package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] rs = new int[10000];
		int[] brs = new int[10000];
		for (i = 0;i < k;i++)
		{
			rs[i] = 0;
			brs[i] = 0;
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				rs[i]++;
				brs[j]++;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (rs[i] == 0 && brs[i] == (k - 1))
			{
				System.out.printf("%d",i);
				n = 1;
			}
		}
		if (n == 0)
		{
			System.out.print("NOT FOUND");
		}
	}


}

