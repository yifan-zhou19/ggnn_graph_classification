package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int flag;
		int k = 0;
		int[] zhishu = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n;i = i + 2)
		{
			flag = 0;
			for (j = 3;j < Math.sqrt(i) + 1;j = j + 2)
			{
				if (i % j == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				zhishu[k] = i;
				k++;
			}
		}
		for (i = 0;i <= k;i++)
		{
			for (j = k - 1;j >= i;j--)
			{
				if (n - zhishu[i] == zhishu[j])
				{
					System.out.printf("%d %d\n",zhishu[i],zhishu[j]);
				}
			}
		}
		return 0;
	}

}

