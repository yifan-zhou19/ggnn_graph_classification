package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int s;
		int a = 0;
		int[] k = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0; j < n * n; j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0; j < n * n; j++)
		{
			if (k[j] == 0)
			{
				a = a + 1;
			}
		}
		s = (a / 4 - 1) * (a / 4 - 1);
		System.out.printf("%d\n", s);
		return 0;
	}
}

