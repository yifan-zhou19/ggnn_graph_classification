package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
	  int n;
	  int i;
	  int x;
	  int l;
	  int j = 0;
	  int num = 0;
	  int[] a = new int[501];
	  int[] b = new int[501];
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
			  (a[i]) = Integer.parseInt(tempVar2);
		  }

		  if ((a[i]) % 2 != 0)
		  {
			  b[j] = a[i];
			  j++;
			  num++;
		  }
	  }
	  for (l = num - 1;l >= 0;l--)
	  {
		  for (j = 0;j < num;j++)
		  {
			  if (b[j] > b[j + 1])
			  {
				  x = b[j + 1];
				  b[j + 1] = b[j];
				  b[j] = x;

			  }

		  }
	  }
	  for (j = 1;j < num;j++)
	  {

		  System.out.printf("%d,",b[j]);


	  }
	  System.out.printf("%d",b[num]);

	  return 0;
	  }

}

