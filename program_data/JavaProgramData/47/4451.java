package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n != 10)
		{
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
				b[i] = a[n - 1 - i];
			}
			for (i = 0;i < n - 1;i++)
			{
				System.out.printf("%d ",b[i]);
			}
			System.out.printf("%d\n",b[n - 1]);
		}
		if (n == 10)
		{
			for (i = 0;i < n + 1;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n + 1;i++)
			{
				b[i] = a[n - i];
			}
			for (i = 0;i < n;i++)
			{
				System.out.printf("%d ",b[i]);
			}
			System.out.printf("%d\n",b[n]);
		}
	}
}

