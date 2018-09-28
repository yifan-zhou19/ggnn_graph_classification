package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100];
		int n;
		int i;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		int[] p = num;
		while (m != 0)
		{
			int t = num[n - 1];
			for (p = num + n - 1;p > num;p--)
			{
				p[0] = (p - 1);
			}
			p[0] = t;
			m--;
		}
		for (k = 0;k < n;k++)
		{
			if (k == 0)
			{
				System.out.printf("%d",num[k]);
			}
			else
			{
				System.out.printf(" %d",num[k]);
			}
		}
		return 0;
	}


}

