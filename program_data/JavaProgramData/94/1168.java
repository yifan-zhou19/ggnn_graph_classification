package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[501];
		int m;
		int j;
		int n;
		int i;
		int t;
		int[] b = new int[501];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		   if (a[i] % 2 != 0)
		   {
		   b[j] = a[i];
		   }
		   if (b[j] != 0)
		   {
			   j = j + 1;
		   }

		}
		for (i = 0;i < j;i++)
		{
			for (m = 0;(m + 1) < j - i;m++)
			{
			  if (b[m] > b[m + 1])
			  {
				 t = b[m];
			   b[m] = b[m + 1];
			   b[m + 1] = t;

			  }
			}
		}
			System.out.printf("%d",b[0]);
			for (i = 1;i < j;i++)
			{
				System.out.printf(",%d",b[i]);
			}
		return (0);

	}

}

