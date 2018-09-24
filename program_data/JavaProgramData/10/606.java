package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[30];
		  int[] b = new int[30];
		  int n;
		  int i;
		  int j;
		  int c;
		  int d;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < 30;i++)
		  {
		  b[i] = 1;
		  }
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  for (i = n - 2;i >= 0;i--)
		  {
							 d = 0;
							 for (j = i + 1;j < n;j++)
							 {
							 if (a[i] >= a[j])
							 {
							 if (b[j] > d)
							 {
							 d = b[j];
							 }
							 }
							 }
							 b[i] = b[i] + d;
		  }
		  c = b[0];
		  for (i = 1;i < n;i++)
		  {
		  if (b[i] > c)
		  {
				   c = b[i];
		  }
		  }
		  System.out.printf("%d",c);
		  System.in.read();
		  System.in.read();
	}

}

