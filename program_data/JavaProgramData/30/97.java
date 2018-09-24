package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] ans = new int[100];
		int total;
		int answer;
		int n;
		int i;
		int j;
		total = 0;
		for (i = 1;i < 100;i++)
		{
			total++;
			ans[total] = i * i;
			j = i;
			if (j % 7 == 0)
			{
				total--;
				continue;
			}
			while (j != 0)
			{
				if (j % 10 == 7)
				{
					total--;
					break;
				}
				j /= 10;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		answer = 0;
		for (i = 1; i <= total; i++)
		{
			if (n * n < ans[i])
			{
				break;
			}
			answer += ans[i];
		}
		System.out.printf("%d", answer);
		return 0;
	}

}

