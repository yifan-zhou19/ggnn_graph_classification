package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[100000][2];
		int n;
		int i;
		int a = 0;
		int b = 0;
		int d;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s[i][1] = Integer.parseInt(tempVar3);
		}
		}

		for (i = 0;i < n;i++)
		{
			if (s[i][0] < s[a][0])
			{
			a = i;
			}
			if (s[i][1] > s[b][1])
			{
			b = i;
			}
		}

		d = s[b][1];

		for (c = 1.0 * s[a][0];c <= d;c += 0.5)
		{
			for (i = 0;i < n;i++)
			{
				if (c >= s[i][0] != 0 && c <= s[i][1])
				{
					break;
				}
				if (i == n - 1)
				{
				System.out.print("no");
				return 0;
				}
			}
		}

		System.out.printf("%d %d",s[a][0],s[b][1]);

	return 0;
	}
}

