package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
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
			if ((a[i] != a[0] && i != 0) || i == 0)
			{
			if (i == 0)
			{
			System.out.printf("%d",a[i]);
			}
			else
			{
			System.out.printf(",%d",a[i]);
			}
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j])
				{
					a[j] = a[0];
				}
			}
			}
		}
	}
}

