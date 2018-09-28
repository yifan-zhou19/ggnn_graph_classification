package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int p;
		int k;
		int[] a = new int[300];
		while (1 > 0)
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
			  if (n == 0)
			  {
			  break;
			  }
			  else
			  {
				  for (i = 0;i < n;i++)
				  {
				  a[i] = i + 1;
				  }
				  p = 0;
				  while (n != 1)
				  {
							 k = (m + p - 1) % n;
							 for (i = k;i < n;i++)
							 {
											 a[i] = a[i + 1];
							 }
											 n--;
											 p = k;
				  }
											 System.out.printf("%d\n",a[0]);
			  }
		}

											return 0;
	}

}

