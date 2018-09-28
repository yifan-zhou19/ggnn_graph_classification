package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] ss = new int[n];
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= i;j++)
			{
				if (i % j == 0)
				{
					sum++;
				}
			}
			if (sum == 2)
			{
				ss[k] = i;
				k++;
			}
			sum = 0;
		}
		j = 0;
		for (i = 0;i < k;i++)
		{
			if (ss[i + 1] - ss[i] == 2)
			{
				System.out.printf("%d %d\n",ss[i],ss[i + 1]);
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("empty");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(ss);
	return 0;
	}
}

