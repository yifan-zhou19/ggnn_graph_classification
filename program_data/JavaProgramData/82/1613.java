package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] s1 = new int[100];
		int[] s2 = new int[100];
		int c = 0;
		int max = 0;
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
				(s1[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(s2[i]) = Integer.parseInt(tempVar3);
			}
			if (i == 0)
			{
				if (s1[i] >= 90 && s1[i] <= 140 && s2[i] >= 60 && s2[i] <= 90)
				{
					c++;
					max = c;
				}
				else
				{
					continue;
				}
			}
			else
			{
				if (s1[i] >= 90 && s1[i] <= 140 && s2[i] >= 60 && s2[i] <= 90)
				{
					c++;
					if (max < c)
					{
						max = c;
					}
				}
				else
				{
					c = 0;
				}
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

