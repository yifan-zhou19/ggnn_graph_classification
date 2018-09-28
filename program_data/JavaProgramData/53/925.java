package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] an = new int[300];
		int[] bn = new int[300];
		int i = 0;
		int j = 0;
		int k = 0;
		int s = 0;
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
				an[i] = Integer.parseInt(tempVar2);
			}
		}
		bn[0] = an[0];
		for (i = 0;i < n;i++)
		{
			k = 0;
			for (j = 0;j < s;j++)
			{
				if (bn[j] != an[i])
				{
					k++;
				}
			}
			if (k == s)
			{
				bn[s] = an[i];
				s++;
			}
		}
		for (i = 0;i < s - 1;i++)
		{
			System.out.printf("%d,",bn[i]);
		}
		System.out.printf("%d",bn[s - 1]);
		return 0;
	}
}

