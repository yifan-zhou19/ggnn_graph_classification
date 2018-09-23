package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count;
		int n;
		int j;
		int i = 1;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (count = 0,j = 1;j < i;j++)
			{
				if (a[i] == a[j])
				{
					count++;
				}
			}
			if (i == 1 && count == 0)
			{
				System.out.printf("%d",a[i]);
			}
			else if (i != 1 && count == 0)
			{
				System.out.printf(" %d",a[i]);
			}
		}
		return 0;
	}

}

