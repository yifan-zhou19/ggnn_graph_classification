package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[300];
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
			int c = 0;
			j = i - 1;
			while (j != -1)
			{
				if (a[i] == a[j])
				{
					c = c + 1;
				}
				j--;
			}
			if (c == 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}
}

