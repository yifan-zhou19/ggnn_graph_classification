package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m = 0;
	int i;
	int j;
	int[] a = new int[16];
	int k;
	  for (i = 1;;i++)
	  {
		  k = 0;
	  for (i = 0;i < 16;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
	  if (a[i] == 0)
	  {
		  break;
	  }
	  else if (a[i] == -1)
	  {
		  m = 1;
		  break;
	  }
	  }
	  if (m == 1)
	  {
		  break;
	  }
	  for (i = 0;a[i] != 0;i++)
	  {
	for (j = 0;a[j] != 0;j++)
	{
	if (a[i] == 2 * a[j])
	{
		k++;
	}
	}
	  }
	System.out.printf("%d\n",k);
	  }
	return 0;
	}
}

