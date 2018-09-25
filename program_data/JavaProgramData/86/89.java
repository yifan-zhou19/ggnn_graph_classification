package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int i;
		int j;
		int[] b = new int[20];
		int[] no = new int[100];
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
				a = Integer.parseInt(tempVar2);
			}
			if (a > 0)
			{
				for (j = 1;j <= a;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = 0;j < a;j++)
				{
					if (b[a - j] + 3 * (a - j) <= 62)
					{
						break;
					}
				}
				if (j == a)
				{
					no[i] = 60 - 3 * a;
				}
				else if (b[a - j] + 3 * (a - j) >= 60)
				{
					no[i] = b[a - j];
				}
				else
				{
					no[i] = 60 - 3 * (a - j);
				}
			}
			else
			{
				no[i] = 60;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",no[i]);
		}
	}
}

