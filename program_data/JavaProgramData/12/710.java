package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i = 0;
		int j = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (a[0] != -1)
		{

			i = 1;
			do
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				if (a[i] < 0)
				{
				}
				i++;
			} while (a[i - 1] != 0);
			for (i = 0;i < 16;i++)
			{
				if (a[i] != 0)
				{
					for (j = 0;j < 16;j++)
					{
						if (a[i] == 2 * a[j])
						{
							k += 1;
						}
					}
				}
			}
			System.out.printf("%d\n",k);
			for (i = 0;i < 16;i++)
			{
				a[i] = 0;
			}
			k = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[0] = Integer.parseInt(tempVar3);
			}
		}






	}
}

