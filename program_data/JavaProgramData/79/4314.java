package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int n = 1;
		int m = 1;
		while ((n != 0) && (m != 0))
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if ((n != 0) && (m != 0))
		{
		for (i = 0;i <= n - 1;i++)
		{
		   a[i] = i + 1;

		}
		for (j = n;j >= 1;j--)
		{
		  for (i = 0;i <= j - 2;i++)
		  {
			b[i] = a[(m % j + i) % j];

		  }
		  for (i = 0;i <= n - 2;i++)
		  {
			a[i] = b[i];
		  }


		}
		System.out.printf("%d\n",a[0]);
		}
		}
	}

}

