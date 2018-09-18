package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] num = new int[15];
		int out;
		while (true)
		{
			n = -1;
			out = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				i = Integer.parseInt(tempVar);
			}
			if (i == -1)
			{
				break;
			}
			num[++n] = i;
			while (true)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					i = Integer.parseInt(tempVar2);
				}
				if (i == 0)
				{
					break;
				}
				num[++n] = i;
			}
			for (i = 0;i <= n - 1;i++)
			{
				for (j = i + 1;j <= n;j++)
				{
					if (num[j] == 2 * num[i] || num[i] == 2 * num[j])
					{
						out++;
					}
				}
			}
			System.out.printf("%d\n",out);
		}
		return 0;
	}
}

