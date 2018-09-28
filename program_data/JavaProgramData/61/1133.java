package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	  for (i = 0; i <= n - 1;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	  }
	  int[] A = new int[20];
	  A[0] = 1;
	  A[1] = 1;
	  for (i = 2;i <= 19;i++)
	  {
		A[i] = A[i - 1] + A[i - 2];
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		a[i] = A[a[i] - 1];
	  }
	  System.out.printf("%d",a[0]);
	  for (i = 1;i <= n - 1;i++)
	  {
		System.out.printf("\n%d",a[i]);
	  }
	}

}

