package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int[] a = new int[10000];
		int[] b = new int[20];
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
		for (j = 0;j < n;j++)
		{
		  for (i = 0;i < a[j];i++)
		  {
			if (i == 0 || i == 1)
			{
				b[i] = 1;
			}
			else
			{
				b[i] = b[i - 2] + b[i - 1];
			}
		  }
		  System.out.printf("%d\n",b[a[j] - 1]);
		}
		return 0;
	}
}

