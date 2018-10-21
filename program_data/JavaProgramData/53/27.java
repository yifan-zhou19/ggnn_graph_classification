package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					b[i] = 1;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			//printf("%d",b[i]);
			if (b[i] == 0)
			{
				if (flag == 1)
				{
				System.out.print(",");
				}
				System.out.printf("%d",a[i]);
				flag = 1;
			}
		}
	}

}

