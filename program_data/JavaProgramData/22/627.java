package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[] a = new int[301];
	  int n;
	  int j;
	  int k;
	  int l;
	  int i;
	  int max;
	  int max1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[0] = Integer.parseInt(tempVar);
	  }
	  i = 1;
	  while (scanf(",%d", a[i]))
	  {
	  i++;
	  }
	  n = i;
	  max = a[0];
	  for (i = 1;i < n;i++)
	  {
		if (a[i] >= max)
		{
			max = a[i];
		}
	  }
	  k = 0;
	  for (i = 0;i < n;i++)
	  {
	   if (a[i] != max)
	   {
		   k = 1;
		   break;
	   }
	  }
	  if (k == 0)
	  {
		  System.out.print("No");
	  }
	  else
	  {
		max1 = a[i];
		for (l = 0;l < n;l++)
		{
		  if (a[l] >= max1 != 0 && a[l] != max)
		  {
			  max1 = a[l];
		  }
		}
	   System.out.printf("%d",max1);
	  }
	}

}

