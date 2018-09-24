package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int num = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] == 0)
			{
				for (j = 0;j < i - 1;j++)
				{
					for (k = j + 1;k < i;k++)
					{
						if (a[j] == 2 * a[k] || 2 * a[j] == a[k])
						{
							num++;
						}
					}
				}
				System.out.printf("%d\n",num);
				num = 0;
				i = -1;
			}
			if (a[i] == -1)
			{
				break;
			}
		}
	}


}

