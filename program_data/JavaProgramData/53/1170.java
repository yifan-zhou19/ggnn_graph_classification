package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] w = new int[300];
		int[] s = new int[300];
		int f = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w[0] = Integer.parseInt(tempVar2);
		}
		s[0] = w[0];
		k++;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				w[i] = Integer.parseInt(tempVar3);
			}
			for (j = i - 1;j >= 0;j--)
			{
				if (w[j] == w[i])
				{
					f = 1;
				}
			}
			if (f == 0)
			{
		//		printf("%d\n ",w[i]);
				s[k] = w[i];
				k++;
			}
			f = 0;
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",s[i]);
		}
		System.out.printf("%d",s[k - 1]);

		return 0;
	}
}

