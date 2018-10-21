package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20];
		int[] b = new int[1000];
		int[] c = new int[1000];
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
		for (i = 0;i < n;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 1 || b[i] == 2)
			{
				c[i] = 1;
			}
			else if (b[i] > 2)
			{
				  for (j = 3;j <= b[i];j++)
				  {
					a[1] = 1;
					a[2] = 1;
					a[j] = a[j - 1] + a[j - 2];
					c[i] = a[j];
				  }
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
		return 0;
	}

}

