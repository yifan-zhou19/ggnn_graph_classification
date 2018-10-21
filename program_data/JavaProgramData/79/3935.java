package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[300];
		int[] n = new int[300];
		int k;
		int i;
		int j;
		int[] monkey = new int[300];
		int[] luckymonkey = new int[300];
		int c;
		int t;
		int a;
		k = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[k] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[k] = Integer.parseInt(tempVar2);
			}
			if (m[k] == 0 && n[k] == 0)
			{
				break;
			}
			k++;
		}
		k--;
		for (i = 0;i <= k;i++)
		{
			c = -1;
			t = 0;
			for (j = 0;j < n[i];j++)
			{
				monkey[j] = 1;
			}
			for (j = 0;j < (n[i] - 1);j++)
			{
				for (a = 1;a <= m[i];a++)
				{
					c++;
					t = c % n[i];
					while (monkey[t] == 0)
					{
						c++;
						t = c % n[i];
					}
				}
				monkey[t] = 0;
			}
			for (j = 0;j < n[i];j++)
			{
				if (monkey[j] == 1)
				{
					luckymonkey[i] = j + 1;
				}
			}
		}
		for (i = 0;i <= k;i++)
		{
			System.out.printf("%d\n",luckymonkey[i]);
		}
		return 0;
	}
}

