package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		int[] m = new int[350];
		int max;
		int j;
		int[] cha = new int[350];
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
				m[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + m[i];
		}
		cha[0] = Math.abs(m[0] * n - sum);
		max = cha[0];
		j = 0;
		for (i = 1;i < n;i++)
		{
			cha[i] = Math.abs(m[i] * n - sum);
			if (cha[i] > max)
			{
				max = cha[i];
				j = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] == max)
			{
				if (i == j)
				{
					System.out.printf("%d",m[i]);
				}
				else
				{
					System.out.printf(",%d",m[i]);
				}
			}
		}
		return 0;
	}

}

