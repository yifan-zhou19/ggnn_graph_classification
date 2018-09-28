package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 2;
		int k;
		int j = 1;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		while (scanf(",%d", a[i]))
		{
			j = j + 1;
			i = i + 1;
		}
		k = a[1];
		if (j == 1)
		{
			System.out.print("No");
		}
		if (j > 1)
		{
		  for (i = 2;i <= j;i++)
		  {
			  if (a[i] > k)
			  {
				  k = a[i];
			  }
		  }
		  for (i = 1;i <= j;i++)
		  {
			  if (a[i] != k && a[i] > h)
			  {
				  h = a[i];
			  }
		  }
		  if (h == 0)
		  {
			  System.out.print("No");
		  }
		  else
		  {
			  System.out.printf("%d",h);
		  }
		}
		return 0;
	}



}

