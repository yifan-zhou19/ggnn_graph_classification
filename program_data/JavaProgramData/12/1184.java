package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int sign = 1;
		int i;
		int j;
		int k;
		int num;
		for (;;)
		{
			num = 0;
			for (i = 0;;)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				sign = a[i];
				if (sign == 0 || sign == -1)
				{
					break;
				}
				else
				{
					i++;
				}
			}
			if (sign == -1)
			{
				break;
			}
			else
			{
				for (j = 0;j < i;j++)
				{
					for (k = j + 1;k < i;k++)
					{
						if (a[k] == 2 * a[j] || a[j] == 2 * a[k])
						{
							num++;
						}
					}
				}
				System.out.printf("%d\n",num);
			}
		}
		return 0;
	}
}

