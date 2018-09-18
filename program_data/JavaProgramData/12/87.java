package <missing>;

public class GlobalMembers
{
	/*1 4 3 2 9 7 18 22 0
	2 4 8 10 0
	7 5 11 13 1 3 0
	-1
	*/





	public static int Main()
	{
		int[] a = new int[100];
		int i = 1;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (a[i - 1] != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		i = i - 2;
		while (a[0] != -1)
		{
			count = 0;
			int j;
			int k = 0;
			for (j = 0;j < i;j++)
			{
				for (k = j + 1;k < i;k++)
				{
					if (a[k] == 2 * a[j] || a[j] == 2 * a[k])
					{
						count++;
					}
				}
			}
			System.out.printf("%d\n",count);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[0] = Integer.parseInt(tempVar3);
			}
			if (a[0] == -1)
			{
				break;
			}
			i = 1;
		   while (a[i - 1] != 0)
		   {
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			i++;
		   }
			i = i - 1;

		}
		return 0;

	}


}

