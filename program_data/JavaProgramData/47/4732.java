package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
		}
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
		for (i = n;i >= 1;i--)
		{
			if (i > 1)
			{
				System.out.printf("%d ",a[i]);
			}
			else
			{
				System.out.printf("%d",a[i]);
			}
		}
		return 0;
	}

}

