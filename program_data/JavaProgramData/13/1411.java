package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[20001];
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
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					a[i] = 0;
					break;
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			if (a[k] != 0)
			{
				if (k == 0)
				{
					System.out.printf("%d",a[k]);
				}
				else
				{
					System.out.printf(" %d",a[k]);
				}
			}
		}
	}
}

