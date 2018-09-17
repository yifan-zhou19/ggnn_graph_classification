package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[26];
		  int[] b = new int[26];
		  int i;
		  int j;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < k;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
						  b[i] = 0;
						  for (j = 0;j < i;j++)
						  {
										  if ((a[j] >= a[i]) && (b[j] > b[i]))
										  {
																	   b[i] = b[j];
										  }
						  }
						  b[i]++;

		  }
		  for (i = 0;i < k;i++)
		  {
						  if (b[i] > b[0])
						  {
									   b[0] = b[i];
						  }
		  }
		  System.out.printf("%d",b[0]);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}


}

