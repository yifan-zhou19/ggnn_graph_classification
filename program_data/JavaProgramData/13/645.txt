package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[20000];
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  System.out.printf("%d",a[0]);
		  for (i = 1;i < n;i++)
		  {
						  int k;
						  k = 0;
						  for (j = 0;j < i;j++)
						  {
										  if (a[j] != a[i])
										  {
											  k++;
										  }
										  else
										  {
											  break;
										  }
						  }
										  if (k == i)
										  {
											  System.out.printf(" %d",a[i]);
										  }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

