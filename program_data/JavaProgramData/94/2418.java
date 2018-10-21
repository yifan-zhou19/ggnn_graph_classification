package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int zhan;
		int k = 0;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] s = new int[n];
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zhan = Integer.parseInt(tempVar2);
			}
			if (zhan % 2 == 1)
			{
				s[k] = zhan;
				k = k + 1;
			}
			i = i + 1;
		}
		i = 0;
		while (i < k)
		{
			while (j < k - 1)
			{
				if (s[j] < s[j + 1])
				{
					zhan = s[j];
					s[j] = s[j + 1];
					s[j + 1] = zhan;
				}
				j = j + 1;
			}
			j = 0;
			i = i + 1;
		}
		i = k - 2;
		System.out.printf("%d",s[k - 1]);
		while (i >= 0)
		{
			System.out.printf(",%d",s[i]);
			i = i - 1;
		}
		return 0;
	}
}

