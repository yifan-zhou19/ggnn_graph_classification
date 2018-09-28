package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s1 = new int[100];
		int[] s2 = new int[100];
		int m;
		int n;
		int i;
		int t;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s2[i] = Integer.parseInt(tempVar4);
			}
		}

		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (s1[j] > s1[j + 1])
				{
					t = s1[j + 1];
					s1[j + 1] = s1[j];
					s1[j] = t;
				}
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (s2[j] > s2[j + 1])
				{
					t = s2[j + 1];
					s2[j + 1] = s2[j];
					s2[j] = t;
				}
			}
		}

		System.out.printf("%d",s1[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %d",s1[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf(" %d",s2[i]);
		}
		return 0;
	}
}

