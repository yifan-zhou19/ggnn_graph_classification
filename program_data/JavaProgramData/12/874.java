package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int counter;
		for (;;)
		{
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
				counter = 0;
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
					for (k = 0;k < i;k++)
					{
						if (a[j] % a[k] == 0 && a[j] / a[k] == 2)
						{
							counter = counter + 1;
						}
					}
				}
				System.out.printf("%d\n",counter);
			}
		}
	}
}

