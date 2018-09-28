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
		int k;
		int[] p = new int[20];
		int i;
		int l;
		int j;
		int sum;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
		if (k == 0)
		{
			System.out.print("60\n");
		}
		else
		{

		for (j = 1;j <= k;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[j] = Integer.parseInt(tempVar3);
			}
		}

		for (j = 1;j <= k;j++)
		{
			sum = 3 * (k - 1) + p[k];
		}
		if (sum <= 60)
		{
		for (j = 1;j <= k;j++)
		{
			if ((60 - sum) >= 3)
			{
				l = p[k] + (60 - (p[k] + (3 * k)));
			}
			if ((60 - sum) < 3)
			{
				l = p[k];
			}
		}
		System.out.printf("%d\n",l);
		}
		if (sum > 60)
		{
		for (j = 1;j <= k;j++)
		{
		 if ((60 - (p[j - 1] + (j - 2) * 3)) * (60 - (p[j] + (j - 1) * 3)) < 0)
		 {
			if ((60 - (p[j - 1] + (j - 2) * 3)) >= 3)
			{
				l = p[j - 1] + (60 - (p[j - 1] + (j - 1) * 3));
			}
			if ((60 - (p[j - 1] + (j - 2) * 3)) < 3)
			{
				l = p[j - 1];
			}
		 }
		}
		System.out.printf("%d\n",l);
		}
		}
		}
	}


}

