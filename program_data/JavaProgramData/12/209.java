package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20];
		int i;
		int m;
		int n;
		int k;
		for (;;)
		{
			k = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a[0] == -1)
			{
				break;
			}
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
			for (m = 0;m < i;m++)
			{
				for (n = 0;n < i;n++)
				{
					if (a[m] == 2 * a[n])
					{
						k++;
					}
				}
			}
			System.out.printf("%d\n",k);
		}
	}

}

