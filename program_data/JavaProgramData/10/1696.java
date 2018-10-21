package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int m;
		  int j;
		  int[] a = new int[25];
		  int[] b = new int[25];
		  m = 0;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = n - 1;i >= 0;i--)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  b[i] = 1;
		  }

		  for (j = 1;j < n;j++)
		  {
		  for (i = 0;i < j;i++)
		  {
		  if (a[j] >= a[i])
		  {
			  if ((b[i] + 1) >= b[j])
			  {
		  b[j] = b[i] + 1;
			  }
		  }
		  }
		  }

		  for (i = 0;i < n;i++)
		  {
		  if (b[i] >= m)
		  {
		  m = b[i];
		  }
		  }

		  System.out.printf("%d",m);



	}





}

