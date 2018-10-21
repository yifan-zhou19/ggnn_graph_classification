package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int[] a = new int[100];
	  int i;
	  int max;
	  int secondmax;
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
	  }
	  max = a[0];
	  for (i = 0;i < n;i++)
	  {
		if (a[i] > max)
		{
		  max = a[i];
		}
	  }
	  if (a[0] == max)
	  {
		secondmax = a[1];
		for (i = 1;i < n;i++)
		{
		  if (a[i] > secondmax)
		  {
			  secondmax = a[i];
		  }
		}
	  }
	  else
	  {
		secondmax = a[0];
		for (i = 0;i < n;i++)
		{
		  if (a[i] < max && a[i]> secondmax)
		  {
			  secondmax = a[i];
		  }
		}
	  }
	  System.out.printf("%d\n",max);
	  System.out.printf("%d\n",secondmax);
	}
}

