package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100000];
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
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (a[i] == a[0])
			{
				a[i] = 0;
			}
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf(" %d",a[i]);
				for (j = i + 1;j < n;j++)
				{
					 if (a[j] == a[i])
					 {
						 a[j] = 0;
					 }
				}
			}
		}
		return 0;
	}
}

