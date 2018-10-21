package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int[] b = new int[100];
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
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		if (n % 2 == 0)
		{
			for (j = n - 1,i = 0;i < (n / 2);i++,j--)
			{
						  t = b[i];
			  b[i] = b[j];
			  b[j] = t;
			}
		}
		if (n % 2 != 0)
		{
			for (j = n - 1,i = 0;i < ((n - 1) / 2);i++,j--)
			{
						  t = b[i];
			  b[i] = b[j];
			  b[j] = t;
			}
		}
		for (i = 0;i < (n - 1);i++)
		{
			System.out.printf("%d ",b[i]);
		}
			 System.out.printf("%d",b[n - 1]);
		return 0;
	}

}

