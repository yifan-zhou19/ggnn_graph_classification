package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int[] t = new int[50];
		int[][] m = new int[50][50];
		int[] max = new int[50];
		int[] num = new int[50];
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
				t[i] = Integer.parseInt(tempVar2);
			}
			for (e = 0;e < t[i];e++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m[i][e] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			num[i] = 60 - 3 * t[i];
			for (e = 0;e < t[i];e++)
			{
				if ((m[i][e] + 3 * e) >= 57 && (m[i][e] + 3 * e) <= 60)
				{
					num[i] = m[i][e];
					break;
				}
				if ((m[i][e] + 3 * e) > 60)
				{
					t[i] = e;
					num[i] = 60 - 3 * t[i];
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",num[i]);
		}
		return 0;
	}
}

