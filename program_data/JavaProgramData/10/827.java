package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[25];
		  int[] len = new int[25];
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  len[i] = 1;
		  }
		  int lenmax = 1;
		  for (i = n - 2;i >= 0;i--)
		  {
			  int max = 0;
			  for (j = n - 1;j > i;j--)
			  {
				  if ((a[j] <= a[i]) && (len[j]> max))
				  {
					 max = len[j];
				  }
			  }
			  len[i] = max + 1;
			  lenmax = lenmax > len[i] != 0?lenmax:len[i];
		  }
		  System.out.printf("%d\n",lenmax);
		  return 0;
	}
}

