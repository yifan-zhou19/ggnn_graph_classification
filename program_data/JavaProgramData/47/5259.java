package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	  int n;
	  int m;
	  int e;
	  int i;
	  int[] sz = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  (sz[i]) = Integer.parseInt(tempVar2);
		  }
	  }

	  if (n % 2 == 0)
	  {
		  m = n / 2;
	  }
	  else
	  {
		  m = (n - 1) / 2;
	  }
	  for (i = 0;i < m;i++)
	  {
		  e = sz[i];
		  sz[i] = sz[n - 1 - i];
		  sz[n - 1 - i] = e;
	  }
	  if (n % 2 != 0)
	  {
		 sz[m] = sz[m];
	  }

	  for (i = 0;i < n - 1;i++)
	  {
		 System.out.printf("%d ",(sz[i]));
	  }
	  System.out.printf("%d",sz[n - 1]);


	return 0;
	}

}

