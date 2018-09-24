package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[1000];
	  int i = 0;
	  int k;
	  int x = 0;
	  int j;
	  for (;;)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  i++;
	  if (a[i - 1] == -1)
	  {
	  break;
	  }
	  }
	  for (k = 0;k < i - 1;k++)
	  {
		  for (j = k + 1;j < i - 1;j++)
		  {
			  if (a[k] == 2 * a[j] || a[j] == 2 * a[k])
			  {
			  x++;
			  }
			  if (a[j + 1] == 0)
			  {
			  break;
			  }
		  }
		  if (a[k + 2] == 0 || a[k + 2] == -1)
		  {
		  k = k + 2;
		  System.out.printf("%d\n",x);
		  x = 0;
		  }
	  }
	  return 0;
	}

}

