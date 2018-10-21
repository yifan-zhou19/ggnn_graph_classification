package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int[] sz = new int[15];
		int i = 0;
		int j;
		int k;
		int result = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t != -1)
		{
			if (t != 0)
			{
				sz[i] = t;
				i++;
			}
			else
			{
				for (j = 0;j < i;j++)
				{
					for (k = 0;k < i;k++)
					{
						if (sz[k] == sz[j] * 2)
						{
							result++;
						}
					}
				}
				System.out.printf("%d\n",result);
				i = 0;
				result = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
		}
		return 0;

	}




}

