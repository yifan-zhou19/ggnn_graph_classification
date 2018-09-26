package <missing>;

public class GlobalMembers
{
	public static void Main()
	{


		int n;
		int[] a = new int[20000];
		int[] b = new int[50001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int qu = 0;
		for (i = 2;i <= n;i++)
		{
			int t = Math.sqrt(i);
			int k;
			int count = 0;
			for (k = 2;k <= t;k++)
			{
				if (i % k == 0)
				{
					count++;
					break;
				}
			}
			if (count == 0)
			{
				a[qu] = i;
				qu++;
				b[i] = 1;
			}
		}
		int l = 0;
		for (i = 6;i <= n;i++)
		{
			if (i % 2 == 1)
			{
				continue;
			}
			for (l = 0;l < qu;l++)
			{
				if (b[i - a[l]] == 1)
				{
					System.out.printf("%d=%d+%d\n",i,a[l],i - a[l]);
				break;
				}
			}
		}



	}

}

