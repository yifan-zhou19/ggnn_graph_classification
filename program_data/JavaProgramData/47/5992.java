package <missing>;

public class GlobalMembers
{
	public static void Main(void argc, String[] args)
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int n;
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
			b[n - 1 - i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
				System.out.printf("%d ",b[i]);
			}
		}
	}

}

