package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int k;
		int n;
		int p = 1;
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
			for (k = 0;k < i;k++)
			{
				if (a[k] == a[i])
				{
					p = p * 0;
				}
				else
				{
					p = p * 1;
				}
			}
			if (p == 1)
			{
				System.out.printf(",%d",a[i]);
			}
			else
			{
				p = 1;
			}
		}
	}
}

