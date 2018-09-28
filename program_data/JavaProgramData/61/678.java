package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[100];
		int[] a = new int[100];
		int[] z = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	 x[0] = 1;
	 x[1] = 1;
	  for (int i = 2;i < 20;i++)
	  {
		  x[i] = x[i - 1] + x[i - 2];
	  }

	  for (int j = 0;j < n;j++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[j] = Integer.parseInt(tempVar2);
	  }
	  z[j] = x[a[j] - 1];
	  }
	  for (int t = 0;t < n;t++)
	  {
	  System.out.printf("%d\n",z[t]);
	  }
	return 0;
	}


}

