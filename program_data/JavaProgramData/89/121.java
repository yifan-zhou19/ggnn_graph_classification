package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int a = 0;
		int b = 0;
		int i = 0;
		int pos = 0;
		int[] count = new int[10000];
		int num = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			count[i] = 0;
		}

		while (scanf("%d%d", a, b) && (a + b != 0))
		{
			count[b]++;
		}

		for (i = 0; i < n; i++)
		{
			if (count[i] == n - 1)
			{
				pos = i;
				num++;
			}
		}

		if (num == 1)
		{
			System.out.printf("%d\n", pos);
		}
		else
		{
			System.out.print("NOT FOUND\n");
		}

		return 0;
	}

}

