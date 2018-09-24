package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[100];
		for (i = n - 1;i >= 0;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			b[i] = a;
		}
		for (j = 0;j < n;j++)
		{
			if (j < n - 1)
			{
			System.out.printf("%d ",b[j]);
			}
			else
			{
				System.out.printf("%d",b[j]);
			}
		}
		return 0;
	}
}

