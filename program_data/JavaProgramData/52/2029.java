package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  q = Integer.parseInt(tempVar2);
	  }
	  int[] sz = new int[100];

	  for (int m = 0;m < n;m++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (sz[m]) = Integer.parseInt(tempVar3);
		  }
	  }



	  for (int i = 0;i < q;i++)
	  {

		  int e;
		  e = sz[n - 1];

		for (int j = n - 2;j >= 0;j--)
		{
			 sz[j + 1] = sz[j];
		}
		  sz[0] = e;
	  }


	  for (int w = 0;w < n - 1;w++)
	  {
		System.out.printf("%d ",sz[w]);
	  }
	System.out.printf("%d", sz[n - 1]);

	  return 0;
	}
}

