package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] s = new int[20];
		int[] z = new int[20];
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[j] = Integer.parseInt(tempVar3);
				}
			}
			if (s[m - 1] + 3 * m < 60)
			{
				z[i] = 60 - m * 3;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					if (s[j] + j * 3 >= 57 && s[j] + j * 3 <= 60)
					{
						z[i] = s[j];
						break;
					}
					if (s[j] + j * 3 >= 60)
					{
						z[i] = s[j] - (s[j] + j * 3 - 60);
						break;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",z[i]);
		}
		return 0;
	}
}

