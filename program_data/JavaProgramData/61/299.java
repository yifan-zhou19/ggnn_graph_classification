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
		int[] shulie = new int[20];
		int i;
		shulie[0] = 1;
		shulie[1] = 1;
		for (i = 2;i <= 19;i++)
		{
			shulie[i] = shulie[i - 1] + shulie[i - 2];
		}
		int[] ceshi = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ceshi[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",shulie[ceshi[i] - 1]);
		}
	}
}

