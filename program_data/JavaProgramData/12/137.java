package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[16];
		int i;
		int j;
		int count;
		int a;
		int n;
		while (true)
		{
			count = 0;
			n = 0;
			for (i = 0;;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[i] = Integer.parseInt(tempVar);
				}
				if (num[i] == -1)
				{
					break;
				}
				if (num[i] == 0)
				{
					break;
				}
				n += 1;
			}
			if (num[0] == -1)
			{
				break;
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					a = num[i];
					for (j = 0;j < n;j++)
					{
						if (num[j] == 2 * a)
						{
							count += 1;
						}
					}
				}
			}
			System.out.printf("%d\n",count);
		}
		return 0;
	}
}

