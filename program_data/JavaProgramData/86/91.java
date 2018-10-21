package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int[] a = new int[10];
		int sum;
		int you;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			you = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
			System.out.print("60\n");
			}
			else
			{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				sum = a[j] + 3 * j;
				if (sum >= 60)
				{
				   you = 60 - 3 * j;
				   break;
				}
				else if (sum < 57 && j == m - 1)
				{
						you = 60 - 3 * (j + 1);
						break;
				}
				else if (sum > 57)
				{
					   you = 60 - 3 * j - (60 - sum);
					   break;
				}
			}
			System.out.printf("%d\n",you);
			}
		}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				i = Integer.parseInt(tempVar4);
			}
	}

}

