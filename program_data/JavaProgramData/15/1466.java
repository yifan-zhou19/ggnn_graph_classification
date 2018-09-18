package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int c = 0;
		int q = 0;
		int t;
		int[] m = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t = Integer.parseInt(tempVar2);
				}
				if (t == 0)
				{
					m[i]++;
					c++;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (m[i] != 0)
			{
				q++;
			}
		}
		System.out.printf("%d",(q - 2) * (c - 2 * q) / 2);
	}
}

