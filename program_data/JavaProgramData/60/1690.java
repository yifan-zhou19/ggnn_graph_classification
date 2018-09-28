package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] su = new int[10000];
		int i;
		int j = 0;
		int k = 0;
		int n;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 2;j <= i;j++)
			{
				if (i != j && i % j == 0)
				{
					break;
				}
				if (i == j)
				{
					su[k] = i;
					k++;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			if (su[i + 1] - su[i] == 2)
			{
				System.out.printf("%d %d\n",su[i],su[i + 1]);
				t = 1;
			}
		}
		if (t == 0)
		{
			System.out.print("empty");
		}

	}


}

