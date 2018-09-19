package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int pair = int n[15];
		int[] num = new int[15];
		for (l1 = 0;(num[0] != -1);l1++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[0] = Integer.parseInt(tempVar);
			}
			for (l2 = 1;(num[l2 - 1] != 0) && (num[0] != -1);l2++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[l2] = Integer.parseInt(tempVar2);
				}
			}
			if (num[0] != -1)
			{
				System.out.printf("%d\n",pair(num));
			}
		}
		return (0);
	}
	public static int pair(int[] n)
	{
		int sum;
		int i;
		int j;
		int k;
		int x;
		sum = 0;
		for (i = 1;(n[i] != 0);i++)
		{
			if (n[i] == (n[0] + n[0]))
			{
				sum = sum + 1;
			}
		}
		for (j = 1;(n[j - 1] != 0);j++)
		{
			for (k = 0;(n[k] != 0);k++)
			{
				if (n[k] == n[j] * 2)
				{
					sum = sum + 1;
				}
			}
		}
		return (sum);
	}
}

