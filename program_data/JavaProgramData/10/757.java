package <missing>;

public class GlobalMembers
{
	public static int com(void a, void b)
	{
		return ((int)a - (int)b);
	}
	public static int Main()
	{
		  int k;
		  int H;
		  int j;
		  int[] count = new int[25];
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  int[] h = new int[25];
		  int i;
		  for (i = 0;i < k;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  h[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  count[k - 1] = 1;
		  for (i = k - 2;i >= 0;i--)
		  {
			  n = 0;
			  for (j = k - 1;j >= i + 1;j--)
			  {
				 if (h[j] <= h[i])
				 {
					  if (count[j] >= n)
					  {
						   n = count[j];
					  }
				 }
			  }
			  count[i] = n + 1;
		  }

			   qsort(count,k,(Integer.SIZE / Byte.SIZE),com);
			   System.out.printf("%d",count[k - 1]);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

