package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[1000];
		int a;
		int i;
		int j;
		int k = 0;
		int d = 0;
		int l = 0;
		int c = 0;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < a;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[j] = Integer.parseInt(tempVar2);
				}
			}
			for (j = 0;j < a;j++)
			{
				if (b[j] == 0 && c == 0)
				{
					k = k + 1;
					d = 1;
					temp = j - k + 1;
				}
			}
			if (d == 1)
			{
				c = 1;
			}
				if (b[temp] == 0 && d == 1)
				{
					l = l + 1;
				}
				else
				{
					continue;
				}
		}
		System.out.printf("%d\n",(k - 2) * (l - 2));
	}
}

