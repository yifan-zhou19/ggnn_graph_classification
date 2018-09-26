package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int n;
		int m;
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
			for (j = i + 1;j < n;)
			{
				if (a[i] == a[j])
				{
					for (m = j;m < n;m++)
					{
				a[m] = a[m + 1];
					}
				n -= 1;
				}
				else
				{
					j++;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;a[i] != 0;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}
}

