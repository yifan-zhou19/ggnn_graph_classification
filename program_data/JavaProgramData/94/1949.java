package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] a = new int[501];
	  int[] b = new int[501];
	  int j = 0;
	  int maxIndex;
	  int e;


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
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  if ((a[i]) % 2 != 0)
		  {
			  b[j] = a[i];
			  j = j + 1;
		  }
	  }

	  for (int k = 1 ; k <= j; k++)
	  {
		 maxIndex = 0;
		 for (i = 0; i <= j - k; i++)
		 {
			if (b[i] > b[maxIndex])
			{
			   maxIndex = i;
			}
		 }
		 if (maxIndex != j - k)
		 {
			e = b[maxIndex];
			b[maxIndex] = b[j - k];
			b[j - k] = e;
		 }
	  }

	  for (i = 0;i < j - 1;i++)
	  {
		  System.out.printf("%d,",b[i]);
	  }
	  System.out.printf("%d",b[j - 1]);





	  return 0;
	}

}

