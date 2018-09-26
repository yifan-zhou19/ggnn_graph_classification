package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int l;
		int r;
		int[] s = new int[100];
		int z = 0;
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
				l = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				r = Integer.parseInt(tempVar3);
			}
			if (l >= 90 && l <= 140 && r >= 60 && r <= 90)
			{
				s[z]++;
			}
			else
			{
				z++;
			}
		}
		if (l >= 90 && l <= 140 && r >= 60 && r <= 90)
		{
			z++;
		}
		for (i = 0;i < z;i++)
		{
			if (i == 0 || max < s[i])
			{
				max = s[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

