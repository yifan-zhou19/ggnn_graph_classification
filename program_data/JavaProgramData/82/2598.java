package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] s = new int[101][2];
		int[] r = new int[101];
		int sum;
		int a;
		int[] sz = new int[101];
		int j;
		int max;
		sum = 0;
		j = 0;
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
				s[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((s[i][0] >= 90) && (s[i][0] <= 140) && (s[i][1] >= 60) && (s[i][1] <= 90))
			{
				r[i] = 1;
			}
			else
			{
				r[i] = 0;
			}
		}
		r[n] = 0;
		for (i = 0;i < n;i++)
		{
			sz[i] = 0;
		}
		for (i = 0;i < n - 1;i++)
		{
			if ((r[i] == 1) && (r[i + 1] == 1))
			{
				sum++;
			}
			if (r[i + 2] == 0)
			{
				sz[j] = sum;
				j++;
				sum = 0;
			}
		}
		max = sz[0];
		for (i = 0;i < j;i++)
		{
			if (sz[i] > max)
			{
				max = sz[i];
			}
		}
		sum = max;
		for (i = 0;i < n;i++)
		{
			if (r[i] != 0)
			{
				a = 1;
				break;
			}
			else
			{
				a = 0;
			}
		}
		System.out.printf("%d",sum + a);
		return 0;
	}

}

