package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] org = new int[100];
		int[] opp = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				org[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			opp[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			opp[n - 1 - i] = org[i];
		}
		int k;
		for (k = 0;k < n - 1;k++)
		{
			System.out.printf("%d ",opp[k]);
		}
		System.out.printf("%d",opp[n - 1]);
	}
}

