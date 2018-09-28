package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 1000;
		int[] c = new int[10000];
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int w = 0;w < 10000;w++)
		{
			c[w] = 0;
		}
		int b = n;
		while (a != 0 || b != 0)
		{
			c[b]++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
		}
		for (int l = 0;l < n;l++)
		{
				if (c[l] == n - 1)
				{
					System.out.printf("%d",l);
					k = 1;
					break;
				}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

