package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] sz = new int[10000];
		int a;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				a = i % j;
				if (a == 0)
				{
					break;
				}
				if (j == i - 1)
				{
					sz[b] = i;
					b = b + 1;
				}
			}
		}
		if (b == 1 || b == 0)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (i = 1;i < b;i++)
			{
				 if (sz[i] - sz[i - 1] == 2)
				 {
					  System.out.printf("%d %d\n",sz[i - 1],sz[i]);
				 }
			}
		}
		return 0;
	}
}

