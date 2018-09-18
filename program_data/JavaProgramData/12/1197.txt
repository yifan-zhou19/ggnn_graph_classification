package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int count = 0;
		for (;;)
		{
			count = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a[0] == -1)
			{
				break;
			}
			else
			{
				for (i = 1;;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
					if (a[i] == 0)
					{
						break;
					}
				}
				for (j = 0;j < i;j++)
				{
					for (k = j;k < i;k++)
					{
						if (a[j] == a[k] * 0.5 || a[j] == a[k] * 2)
						{
							count++;
						}
					}
				}
				System.out.printf("%d\n",count);
			}
		}
	}
}

