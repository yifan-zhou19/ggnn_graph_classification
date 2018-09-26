package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] cs = new int[100];
		int t = 0;
		int max;
		int[] gao = new int[100];
		int[] di = new int[100];
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
				gao[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				di[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (gao[i] >= 90 && gao[i] <= 140 && di[i] >= 60 && di[i] <= 90)
			{
				cs[t]++;
			}
			else
			{
				t++;
			}
		}
		for (i = 1;i < t + 1;i++)
		{
		   for (k = 0;k < t + 1 - i;k++)
		   {
			   if (cs[k] > cs[k + 1])
			   {
				   max = cs[k + 1];
				   cs[k + 1] = cs[k];
				   cs[k] = max;
			   }
		   }
		}
		System.out.printf("%d",cs[t]);
		return 0;
	}
}

