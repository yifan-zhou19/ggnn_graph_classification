package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[] p = new int[100001];
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
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (j = 0;j < n;j++)
		{
			if (p[j] != m)
			{
				System.out.printf("%d",p[j]);
				break;
			}
		}
		for (k = (j + 1);k < n;k++)
		{
			if (p[k] != m)
			{
				System.out.printf(" %d",p[k]);
			}
		}

		return 0;
	}
}

