package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				System.out.printf("%d",a[1]);
			}
			else
			{
				for (j = 1;j < i;j++)
				{
				if (a[i] == a[j])
				{
					a[i] = -1;
				}
				}
			if (a[i] != -1)
			{
				System.out.printf(",%d",a[i]);
			}
			}

		}

	}
}

