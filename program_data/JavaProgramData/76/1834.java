package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int k;
	  int s;
	  int max;
	  int min;
	  int[] a = new int[10000];
	  int[] b = new int[10000];
	  double c = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
	  }
	   // for(i=1;i<=n;i++) printf("%d",a[i]);


	  for (i = 1,min = a[1];i <= n;i++)
	  {
		  if (a[i] <= min)
		  {
			  min = a[i];
		  }
	  }
	  //printf("%d\n",min);
	  max = b[1];
	  for (i = 1;i <= n;i++)
	  {
		  if (b[i] > max)
		  {
			  max = b[i];
		  }
	  }
	  //printf("%d %d",min,max);
	for (c = min + 0.5;c <= max;c = c + 1.0)
	{
		for (k = 1,s = 0;k <= n;k++)
		{
			if (c >= a[k] != 0 && c <= b[k])
			{
				   s = 0;
				   break;
			}
			else
			{
				s = 1;
			}
		}
		if (s == 1)
		{
			System.out.print("no\n");
			return 0;

		}

	}
	System.out.printf("%d %d",min,max);
	return 0;

	}


}

