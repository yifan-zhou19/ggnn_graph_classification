package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int m;
		int b;
		do
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
			for (i = 1;i <= 15;i++)
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
			j = 0;
			for (m = 0;m <= i - 1;m++)
			{
				for (b = 0;b <= i - 1;b++)
				{
					if (a[m] == a[b] * 2)
					{
						j++;
					}
				}
			}
		  System.out.printf("%d\n",j);
		} while (1 != 0);
		return 0;
	}
}

