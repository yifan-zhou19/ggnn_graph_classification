package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int m;
	  int t;
	  int[] a = new int[350];
	  int avg = 0;
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
		avg += a[i];
		a[i] *= n;
	  }
	  for (i = 0;i < n;i++)
	  {
		for (j = i + 1;j < n;j++)
		{
		  if (a[i] > a[j])
		  {
			t = a[i];
			a[i] = a[j];
			a[j] = t;
		  }
		}
	  }
	  if (avg - a[0] > a[n - 1] - avg)
	  {
		m = avg - a[0];
	  }
	  else
	  {
		m = a[n - 1] - avg;
	  }
	  for (i = t = 0;i < n;i++)
	  {
		if (avg - a[i] == m || a[i] - avg == m)
		{
		  if (t != 0)
		  {
			System.out.print(",");
		  }
		  System.out.printf("%d",a[i] / n);
		  t = 1;
		}
	  }
	  System.out.print("\n");
	  return 0;
	}


}

