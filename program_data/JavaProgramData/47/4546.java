package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int[] b = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= (n - 1) / 2;i++)
		{
			b[i] = a[n - i - 1];
			a[n - i - 1] = a[i];
			a[i] = b[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (i <= n - 2)
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

