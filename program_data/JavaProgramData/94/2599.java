package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int i;
		int j;
		int m = 0;
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
			  a[m] = Integer.parseInt(tempVar2);
		  }
				if (a[m] % 2 != 0)
				{
					m++;
				}
		}
		for (i = 0;i < m;i++)
		{
			 for (j = 0;j < m - i - 1;j++)
			 {
				 if (a[j] > a[j + 1])
				 {
				 int x = a[j];
				 a[j] = a[j + 1];
				 a[j + 1] = x;
				 }
			 }
		}
		for (i = 0;i < m - 1;i++)
		{
			 System.out.printf("%d,",a[i]);
		}
	System.out.printf("%d",a[m - 1]);

		return 0;
	}

}

