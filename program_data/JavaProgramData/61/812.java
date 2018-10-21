package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int[] b = new int[20];
		  b[0] = 1;
		  b[1] = 1;
		  for (i = 2;i < 20;i++)
		  {
		  b[i] = b[i - 1] + b[i - 2];
		  }
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
						  System.out.printf("%d\n",b[a[i] - 1]);
		  }

	}

}

