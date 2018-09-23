package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] b = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j <= i - 1;j++)
			{
				if (b[i] == b[j])
				{
					b[i] = 0;
				}
			}
		}
		for (m = 1;m < n;m++)
		{
			if (b[m] != 0)
			{
			System.out.printf(" %d",b[m]);
			}
		}
	}

}

