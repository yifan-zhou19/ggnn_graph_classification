package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
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
		int[] num = new int[100];
		int[] p = num;
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			int templast = p[n - 1];
			int j;
			for (j = n - 1;j >= 1;j--)
			{
				p[j] = (p + j - 1);
			}
			p[0] = templast;
		}
		System.out.printf("%d",p[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",p[i]);
		}
		System.out.print("\n");

		return 0;
	}

}

