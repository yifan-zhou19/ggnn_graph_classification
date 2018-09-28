package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int i;
		int j;

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
		j = n - 1;
		if (n <= 1 || n >= 100)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				b[j] = a[i];
				j = j - 1;
			}
			for (j = 0;j < n - 1;j++)
			{
			   System.out.printf("%d ",b[j]);
			}
			System.out.printf("%d",b[n - 1]);
		}
		return 0;
	}



}

