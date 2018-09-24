package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[11];
		int[] b = new int[11];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < 11;i++)
		{
			a[i] = (int)(a[i - 1] / 2);
		}
		for (j = 1;j < 11;j++)
		{
			b[j] = (int)(b[j - 1] / 2);
		}
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					i = 11;
					j = 11;
				}

			}
		}
	}
}

