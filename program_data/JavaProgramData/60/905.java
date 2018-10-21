package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sushu = new int[n];
		for (i = 2;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				sushu[k] = i;
				k++;
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (sushu[i + 1] - sushu[i] == 2)
			{
				System.out.printf("%d %d\n",sushu[i],sushu[i + 1]);
				m = 1;
			}
		}
		if (m != 1)
		{
			System.out.print("empty");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sushu);
		return 0;
	}
}

