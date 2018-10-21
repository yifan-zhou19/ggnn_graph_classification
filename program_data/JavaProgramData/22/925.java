package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String l = new String(new char[1000]);
		int i;
		int[] num = new int[1000];
		int j;
		int rate;
		int k;
		int circle;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = tempVar.charAt(0);
		}
		i = 0;
		rate = 1;
		int[] terminalnum = new int[1000];
		while (l.charAt(i) != '\0')
		{
			for (j = 1;l.charAt(i) != ',' && l.charAt(i) != '\0';i++, j++)
			{
				num[j] = l.charAt(i) - '0';
			}
			for (k = 0;k < j - 1;k++)
			{
				a = 1;
				for (circle = 1;circle <= k;circle++)
				{
					a *= 10;
				}
				terminalnum[rate] += a * num[j - k - 1];
			}
			if (l.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				i += 1;
			}
			rate += 1;
		}
		int max;
		int m;
		int n;
		int min;
		n = 0;
		max = 0;
		for (m = 1;m <= rate;m++)
		{
			if (terminalnum[m] < max)
			{
				max = max;
			}
			else
			{
				if (terminalnum[m] > max)
				{
					max = terminalnum[m];
				}
				else
				{
					n += 1;
				}
			}
		}
		if (n == rate-1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (m = 1;m <= rate;m++)
			{
				if (terminalnum[m] == max)
				{
					terminalnum[m] = -1;
				}
			}
			min = 0;
			for (m = 1;m <= rate;m++)
			{
				if (terminalnum[m] < min)
				{
					 min = min;
				}
				else
				{
					 min = terminalnum[m];
				}
			}
		System.out.printf("%d\n",min);
		}
		return 0;
	}
}

