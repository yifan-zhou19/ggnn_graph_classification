package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] meet = new int[100000];
		int i;
		int j;
		int n;
		int a;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(meet, 0, n * (Integer.SIZE / Byte.SIZE));
		for (scanf("%d%d", a, b); a + b; scanf("%d%d", a, b))
		{
			meet[b]++;
		}

		for (i = 0; i < n; i++)
		{
			if (meet[i] == n - 1)
			{
				break;
			}
		}

		if (i == n)
		{
			System.out.print("NOT FOUND");
		}
		else
		{
			System.out.printf("%d\n", i);
		}

		return 0;
	}

}

