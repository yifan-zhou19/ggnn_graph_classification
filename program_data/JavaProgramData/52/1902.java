package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] chu = new int[100];
		int[] mu = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chu[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < m;j++)
		{
			mu[j] = chu[j + n - m];
			if (j == 0)
			{
				System.out.printf("%d",mu[j]);
			}
			else
			{
				System.out.printf(" %d",mu[j]);
			}
		}
		for (j = m;j < n;j++)
		{
			mu[j] = chu[j - m];
			System.out.printf(" %d",mu[j]);
		}
		return 0;
	}
}

