package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int dao;
		int[] a = new int[25];
		int[] b = new int[25];
		int i;
		int j;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			dao = Integer.parseInt(tempVar);
		}
		for (i = 0;i < dao;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = dao - 1;i >= 0;i--)
		{
			num = 0;
			for (j = i;j < dao;j++)
			{
				if (b[i] >= b[j] != 0 && num <= a[j])
				{
					num = a[j];
				}
			}
			a[i] = num + 1;
		}
		num = a[0];
		for (i = 1;i < dao;i++)
		{
			if (a[i] >= num)
			{
				num = a[i];
			}
		}
		System.out.printf("%d",num);
	}

}

